package javas.Core.StreamAPI;
import java.util.Arrays;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> distinctNums = nums.stream()
                .distinct()
                .toList();

        System.out.println(distinctNums); // Output: [1, 2, 3, 4, 5]
    }
}
