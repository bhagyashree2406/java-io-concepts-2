import java.io.*;
import java.util.Arrays;
//InputStream and OutputStream deals with bytes. [1B or 8 bit]
//Read/Write or Input/Output

//InputStream - Consider this as pipe of input data
//OutputStream - Consider this as pipe of output data

/**
 * ByteArrayInputStream - this is an implementation of InputStream abstract class.
 * This class is used to read byte array.
 * ByteArrayOutputStream - this is an implementation of OutputStream abstract class.
 * This class is used to write array read from input stream
 */

// byte array -> input stream -> output stream -> byte array
public class ByteArrayInputOutputStreamExample {
    public static void main(String[] args) {
        try{
            byte[] byteArray = {'H','e','l','l','o'};

            ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray,0,byteArray.length);//Read

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();//Write

//            System.out.println("inputStream.readAllBytes() = "+ Arrays.toString(inputStream.readAllBytes()));
            outputStream.write(inputStream.readAllBytes());

            byte[] bytesFromOutputStream = outputStream.toByteArray();

            System.out.println("outputStream.toString()="+ new String(bytesFromOutputStream, "UTF-8"));

        } catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

}