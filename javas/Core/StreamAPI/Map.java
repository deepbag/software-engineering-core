package javas.Core.StreamAPI;
import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("deep", "amit", "rahul");

        List<String> upper = names.stream()
                .map(value->{
                    System.out.println("ForEach: "+value);
                    return value.toUpperCase();
                })
                .toList();

        System.out.println(upper);
    }
}
