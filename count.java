import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class count {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Java", "Stream", "API", "Method");
        long count = input.stream()
                .filter(word -> word.length() > 3) 
                .count(); 

        System.out.println(count); // Output: 3
    }
    
}
