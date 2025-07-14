import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScriptTester {

    public static void main(String[] args) {
        String scriptPath = "./test.sh"; 

        try {
            ProcessBuilder pb = new ProcessBuilder(scriptPath);
            pb.redirectErrorStream(true); 
            Process process = pb.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            System.out.println("Script Output:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("Exit code: " + exitCode);

            if (exitCode == 0) {
                System.out.println("Test passed.");
            } else {
                System.out.println("Test failed.");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
