import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConsoleInputOutputExample {
    public static void main(String[] args) {
        System.out.println("----------------Scanner example with  console content-------------------");
        //input string from console and append some string to it and print on console

        // Scanner scans text from console because of system's input stream
        Scanner scanner = new Scanner(System.in);

        // write something on console
        System.out.println("Provide input string - ");

        String someText = scanner.next();//read and return a string from scanner or console

        someText = someText.concat(".");

        System.out.println("Input from user is : " + someText);
            System.out.println("----------------Scanner example with File Content -------------------");
        try {
            Scanner fileScanner = new Scanner(new File("C:\\Users\\Admin\\IdeaProjects\\java-io-concepts-2\\byte-streaming\\src\\sample-file.txt"));
            while (fileScanner.hasNext()) {
                String fileContent = fileScanner.next();
                System.out.println(fileContent);
            }
        }catch (FileNotFoundException | NullPointerException exception){
            System.out.println(exception.getMessage());
        }






    }
}

