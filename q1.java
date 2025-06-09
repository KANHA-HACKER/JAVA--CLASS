/* Given a list of integers, return a list of squares of only even numbers.
 Input: [1, 2, 3, 4, 5]
 Output: [4, 16]
 Hint: Use filter() and map(). */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class q1 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = input.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .map(n -> n * n) // Square the even numbers
                .collect(Collectors.toList()); // Collect to a list

        System.out.println(result); // Output: [4, 16]
    }
}
