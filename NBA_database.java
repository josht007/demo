import java.util.ArrayList;

class Player {
    private String name;
    private String team;
    private String position;

    public Player(String name, String team, String position) {
        this.name = name;
        this.team = team;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name + " - " + position + " - " + team;
    }
}

public class NBADatabase {
    public static void main(String[] args) {
        // Create an ArrayList to store players
        ArrayList<Player> players = new ArrayList<>();

        // Add some players
        players.add(new Player("LeBron James", "Los Angeles Lakers", "Forward"));
        players.add(new Player("Stephen Curry", "Golden State Warriors", "Guard"));
        players.add(new Player("Giannis Antetokounmpo", "Milwaukee Bucks", "Forward"));
        players.add(new Player("Nikola Jokic", "Denver Nuggets", "Center"));

        // Display all players
        System.out.println("NBA Players:");
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
