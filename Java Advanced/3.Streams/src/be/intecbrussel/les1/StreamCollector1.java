package be.intecbrussel.les1;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollector1 {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");

        System.out.println(list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList()));
        System.out.println(list.stream().filter(element ->!list.isEmpty()).collect(Collectors.toList()));
        Stream<String> stream=list.stream().limit(2);
        stream.forEach(System.out::println);
    }
}
