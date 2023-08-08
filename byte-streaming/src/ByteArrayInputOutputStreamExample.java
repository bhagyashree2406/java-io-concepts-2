import java.io.*;
//InputStream and OutputStream deals with bytes. [1B or 8 bit]
//Read/Write or Input/Output
public class ByteArrayInputOutputStreamExample {
    public static void main(String[] args) {
        try{
            byte[] byteArray = {'H','e','l','l','o'};

            InputStream inputStream = new ByteArrayInputStream(byteArray,0,byteArray.length);//Read

            OutputStream outputStream = new ByteArrayOutputStream();//Write

            outputStream.write(inputStream.readAllBytes());

            System.out.println(outputStream.toString());

        } catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

}