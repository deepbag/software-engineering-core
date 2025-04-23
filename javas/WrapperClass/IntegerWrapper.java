package javas.WrapperClass;

public class IntegerWrapper {
    public static void main(String[] arg){
        int a = 2;
        Integer aiw = Integer.valueOf(a);
        double db = aiw.doubleValue();

        System.out.println("Integer: "+a);
        System.out.println("Integer Wrapper Class: "+aiw);
        System.out.println("Converted to Double: "+db);
    }
}
