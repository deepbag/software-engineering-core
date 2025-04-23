package javas.Core.StreamAPI;
import java.util.Arrays;
import java.util.List;

public class AnyAllNoneMatch {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        boolean anyEven = nums.stream().anyMatch(n -> n % 2 == 0); // true
        boolean allPositive = nums.stream().allMatch(n -> n > 0);  // true
        boolean noneNegative = nums.stream().noneMatch(n -> n < 0); // true
    }
}
