import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class WebScraper {
    public static void main(String[] args) {
        try {
            // URL to scrape
            String url = "https://example.com";
            System.out.println("Fetching: " + url);

            // Fetch the HTML code from the URL
            Document doc = Jsoup.connect(url).get();

            // Print the title of the page
            String title = doc.title();
            System.out.println("Title: " + title);

            // Get all hyperlinks
            Elements links = doc.select("a[href]");
            System.out.println("\nLinks found:");

            for (Element link : links) {
                System.out.println(link.text() + " -> " + link.attr("abs:href"));
            }

        } catch (Exception e) {
            System.err.println("Error fetching the page: " + e.getMessage());
        }
    }
}
