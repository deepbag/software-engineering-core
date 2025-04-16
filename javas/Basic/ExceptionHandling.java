package javas.Basic;

public class ExceptionHandling {
    public static void main(String[] arg){
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
