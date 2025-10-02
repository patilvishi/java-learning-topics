import java.util.*;
import java.util.stream.*;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Charlie","David","Eve");

        // Sequential stream
        List<String> upper = names.stream()
                                  .filter(n -> n.length() > 3)
                                  .map(String::toUpperCase)
                                  .sorted()
                                  .toList();
        System.out.println("Sequential: " + upper);

        // Parallel stream
        List<String> parallelUpper = names.parallelStream()
                                          .filter(n -> n.length() > 3)
                                          .map(String::toUpperCase)
                                          .sorted()
                                          .toList();
        System.out.println("Parallel: " + parallelUpper);

        // Reduce example
        int totalLength = names.stream()
                               .mapToInt(String::length)
                               .reduce(0, Integer::sum);
        System.out.println("Total characters: " + totalLength);
    }
}
