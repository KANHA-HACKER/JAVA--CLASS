import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/* Find the sum of all odd numbers in a list.
 Input: [1, 2, 3, 4, 5]
 Output: 9
 Hint: Use filter() and reduce() */
public class sumofodd {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        int result = input.stream()
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .reduce(0, Integer::sum); // Sum the odd numbers

        System.out.println(result); // Output: 9
    }}

    

