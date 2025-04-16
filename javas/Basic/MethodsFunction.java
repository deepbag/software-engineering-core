package javas.Basic;

public class MethodsFunction {

    public static int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public static void main(String[] arg){
        int a = add(2,5);
        System.out.println("Addition of Two Number: "+a);

        MethodsFunction mf = new MethodsFunction();
        int b = mf.subtract(4,6);
        System.out.println("Subtract of Two Number: "+b);
    }
}
