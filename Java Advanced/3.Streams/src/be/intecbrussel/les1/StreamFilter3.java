package be.intecbrussel.les1;

import java.util.Arrays;
import java.util.List;

public class StreamFilter3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc","","bc","efg","hfi","","fji");

        long count = strings.stream().filter(string->!string.isEmpty()).count();
        System.out.println(count);
    }
}
