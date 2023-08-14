import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

//Two abstract classes - Reader and Writer
//FileReader extends Reader class.
//FileWriter extends Writer class.
//FileReader will read characters from specified file.
//FileWriter will write characters into the specified file.
public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {


        Reader fileReader = new FileReader("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts-2\\character-streaming\\src\\input.txt");

        System.out.println(fileReader.ready());

        int size = 100;
        char[] charsFromFile = new char[size];
        fileReader.read(charsFromFile);

        System.out.println(charsFromFile);//print on the console

        fileReader.close();

        Writer fileWriter = new FileWriter("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts-2\\character-streaming\\src\\output.txt");
        fileWriter.write(charsFromFile);

        fileWriter.close();

    }


}
