import java.io.*;

/**
 * FileInputStream will read all bytes from input file
 * and FileOutputStream will write all bytes read from FileInputStream into output file.
 */
public class FileInputOutputStreamExample {
    public static void main(String... args) {
        try{
            InputStream fileInputStream = new FileInputStream("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts-2\\byte-streaming\\src\\input.txt");

            OutputStream fileOutputStream = new FileOutputStream("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts-2\\byte-streaming\\src\\output.txt");

            System.out.println(fileInputStream.available());


            byte[] bytes = fileInputStream.readAllBytes();//read all bytes from input file
            fileOutputStream.write(bytes);//write all bytes to the output file

            System.out.println(fileOutputStream);
            fileInputStream.close();
            fileOutputStream.close();

        } catch (IOException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }
    }
}