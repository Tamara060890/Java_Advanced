package be.intecbrussel.les1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jai", "Mahesh", "Vishal", "Hemant", "Naren");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        Stream<Integer> stream = names.stream().map(s -> s.length());
        stream.forEach(System.out::println);

        System.out.println();

        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
        List<Integer> squaresList = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);
    }
}
