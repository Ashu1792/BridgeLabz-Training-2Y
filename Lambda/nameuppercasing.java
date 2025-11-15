import java.util.*;
import java.util.stream.Collectors;

public class nameuppercasing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("shivam", "anita", "rahul");
        List<String> upperNames = names.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());
        upperNames.forEach(System.out::println);
    }
}