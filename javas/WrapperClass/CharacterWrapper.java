package javas.WrapperClass;

public class CharacterWrapper {
    public static void main(String[] arg){
        char c = 'A';
        Character cWrapper = Character.valueOf(c);
        int asciiValue = cWrapper.charValue();

        System.out.println("Character: "+c);
        System.out.println("Character Wrapper Class: "+cWrapper);
        System.out.println("Converted to ASCII Value: "+asciiValue);
    }
}
