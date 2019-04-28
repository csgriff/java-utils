import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

/**
 * File utility methods. 
 */
public class FileUtils {
    /**
     * Writes out a file. The contents of the file are the list of given 
     * lines, one to a line. 
     * @param filename
     *           Name of the file to write. 
     * @param lines
     *           Lines to write. 
     */
    public static void toFile(String filename, List<String> lines) {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 