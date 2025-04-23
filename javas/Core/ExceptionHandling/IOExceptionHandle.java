package javas.Core.ExceptionHandling;
import java.io.*;

public class IOExceptionHandle {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
