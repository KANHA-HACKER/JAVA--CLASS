
 /*From a list of prices, remove duplicates, filter prices above 1000, and return total sum.
 Input: [999, 1000, 1500, 1000, 2000]
 Output: 3500
 Hint: Use distinct(), filter(), and reduce().*/
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class dupicate {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(999, 1000, 1500, 1000, 2000);
        int result = input.stream()
                .distinct() // Remove duplicates
                .filter(price -> price > 1000) // Filter prices above 1000
                .reduce(0, Integer::sum); // Sum the filtered prices

        System.out.println(result); // Output: 3500
    }
}
