package javas.WrapperClass;

public class DoubleWrapper {
    public static void main(String[] arg){
        double d = 3.14;
        Double dWrapper = Double.valueOf(d);
        int intValue = dWrapper.intValue();

        System.out.println("Double: "+d);
        System.out.println("Double Wrapper Class: "+dWrapper);
        System.out.println("Converted to Integer: "+intValue);
    }
}
