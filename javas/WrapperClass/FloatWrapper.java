package javas.WrapperClass;

public class FloatWrapper {
    public static void main(String[] arg){
        float f = 5.75f;
        Float fWrapper = Float.valueOf(f);
        int intValue = fWrapper.intValue();

        System.out.println("Float: "+f);
        System.out.println("Float Wrapper Class: "+fWrapper);
        System.out.println("Converted to Integer: "+intValue);
    }
}
