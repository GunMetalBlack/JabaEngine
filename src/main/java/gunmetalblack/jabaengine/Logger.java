package gunmetalblack.jabaengine;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger
{
    public static void log(String toLog)
    {
        // Specify the file path. Change this to your desired file path.
        String filePath = "./log.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // The second parameter (true) in the FileWriter constructor enables append mode.
            writer.write(toLog);
            writer.newLine(); // Add a new line for better readability or to separate entries.
        } catch (IOException e) {
            System.err.println("Error appending to the file: " + e.getMessage());
        }
    }
}
