 /*Check if any number in a list is divisible by 7.
 Input: [10, 14, 22, 30]
 Output: true
 Hint: Use anyMatch()*/
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BooleanCheck {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10, 14, 22, 30);
        boolean result = input.stream()
                .anyMatch(n -> n % 7 == 0); // Check if any number is divisible by 7

        System.out.println(result); // Output: true
    }
    
}
