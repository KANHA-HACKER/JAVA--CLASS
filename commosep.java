/* Return a comma-separated string of all names with more than 4 letters.
 Input: ["John", "Ravi", "Abhishek", "Raj"]
 Output: "Abhishek"
 Hint: Use filter() and Collectors.joining(). */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class commosep {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("John", "Ravi", "Abhishek", "Rajkumar");
        String result = input.stream()
                .filter(name -> name.length() > 4) // Filter names with more than 4 letters
                .collect(Collectors.joining(", ")); // Join them with a comma

        System.out.println(result); // Output: Abhishek
    }
    
}
