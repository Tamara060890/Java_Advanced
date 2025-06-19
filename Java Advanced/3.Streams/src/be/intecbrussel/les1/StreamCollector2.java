package be.intecbrussel.les1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollector2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc","","hfi","doh","zer","","lmk");

        List filtered = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered list: " + filtered);

        String mergedString = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged string: " + mergedString);
    }
}
