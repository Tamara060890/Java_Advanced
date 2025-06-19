package be.intecbrussel.les1;

import java.util.Random;
import java.util.stream.Stream;

public class StreamSorted {
    public static void main(String[] args) {
        Random random = new Random();

        random.ints().limit(5).sorted().forEach(System.out::println);
        System.out.println();
        Stream.of("Jai", "Mahesh", "Vishal","Naren","Hemant")
                .sorted()
                .forEach(System.out::println);
    }
}
