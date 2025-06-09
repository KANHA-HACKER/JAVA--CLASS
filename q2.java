/* Given a list of names, return a list of names in uppercase which have more than 3 characters.
 Input: ["Ram", "Shyam", "Om", "Sita"]
 Output: ["SHYAM", "SITA"]
 Hint: Use filter() and map() */
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;
public class q2 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Ram", "Shyam", "Om", "Sita");
        List<String> result = input.stream()
                .filter(name -> name.length() > 3) // Filter names with more than 3 characters
                .map(String::toUpperCase) // Convert names to uppercase
                .collect(Collectors.toList()); // Collect to a list

        System.out.println(result); // Output: [SHYAM, SITA]
    }
}