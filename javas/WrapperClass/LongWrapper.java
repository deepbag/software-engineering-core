package javas.WrapperClass;

public class LongWrapper {
    public static void main(String[] arg){
        long l = 123456789L;
        Long lWrapper = Long.valueOf(l);
        int intValue = lWrapper.intValue();

        System.out.println("Long: "+l);
        System.out.println("Long Wrapper Class: "+lWrapper);
        System.out.println("Converted to Integer: "+intValue);
    }
}
