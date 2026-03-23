import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("ANKIT", "VIKAS", "RAHUL", "AMIT", "SUMIT");
        System.out.println("Original: " + items);

        List<String> results = items.stream()
                .map(item -> "item-" + item)
                .collect(Collectors.toList());

        System.out.println("Filtered & mapped: " + results);
    }
}
