package javas.WrapperClass;

public class BooleanWrapper {
    public static void main(String[] arg){
        boolean b = true;
        Boolean bWrapper = Boolean.valueOf(b);
        String strValue = bWrapper.toString();

        System.out.println("Boolean: "+b);
        System.out.println("Boolean Wrapper Class: "+bWrapper);
        System.out.println("Converted to String: "+strValue);
    }
}
