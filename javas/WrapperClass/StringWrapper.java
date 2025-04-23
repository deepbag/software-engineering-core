package javas.WrapperClass;

public class StringWrapper {
    public static void main(String[] arg){
        // Converting a primitive int to String
        int a = 42;
        String strFromInt = Integer.toString(a);

        // Converting String to primitive int
        String str = "123";
        int intFromStr = Integer.parseInt(str);

        System.out.println("Integer: "+a);
        System.out.println("Converted to String: "+strFromInt);
        System.out.println("String: "+str);
        System.out.println("Converted to Integer: "+intFromStr);
    }
}
