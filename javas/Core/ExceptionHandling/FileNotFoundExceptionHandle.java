package javas.Core.ExceptionHandling;
import java.io.*;

public class FileNotFoundExceptionHandle {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("non_existing_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }
    }
}
