package javas.Core.StreamAPI;
import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        int sum = nums.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
