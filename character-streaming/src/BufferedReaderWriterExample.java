import java.io.*;
import java.util.Arrays;

/**
 * Reads text from a character-input stream, buffering characters to provide
 * for the efficient reading of characters, arrays, and lines.
 * The buffer size may be specified, or the default size may be used. 8kB
 * The default is large enough for most purposes.
 */
public class BufferedReaderWriterExample {
    public static void main(String[] args) throws IOException {

        try (    //file reader
                 FileReader fileReader = new FileReader("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts-2\\character-streaming\\src\\input.txt");
                 //buffer reader
                 BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            //char array that will hold chars from buffer reader
            char[] charsFromInputFile = new char[100];
            bufferedReader.read(charsFromInputFile);
            //print char array to the console
            System.out.println("Input String read by buffer reader from input.txt" + Arrays.toString(charsFromInputFile));
            try (
                    //file writer
                    FileWriter fileWriter = new FileWriter("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts-2\\character-streaming\\src\\output.txt");
                    //buffer writer
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            ) {
                bufferedWriter.write(charsFromInputFile);
                System.out.println("buffer writer done with writing.");
            } catch (IOException ioException) {
                System.out.println(ioException.getMessage());
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}