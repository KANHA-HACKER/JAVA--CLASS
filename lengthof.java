/* Convert a list of words to their lengths.
 Input: ["Java", "Stream", "API"]
 Output: [4, 6, 3]
 Hint: Use map(). */
import java.util.Arrays;
import java.util.List;  
import java.util.stream.Collectors;
public class lengthof {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Java", "Stream", "API","Method");
        List<Integer> result = input.stream()
                .map(String::length) // Convert each word to its length
                .collect(Collectors.toList()); // Collect to a list

        System.out.println(result); // Output: [4, 6, 3]
    }
}
