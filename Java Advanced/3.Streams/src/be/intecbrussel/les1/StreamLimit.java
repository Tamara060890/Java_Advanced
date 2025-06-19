package be.intecbrussel.les1;

import java.util.Random;
import java.util.stream.Stream;

public class StreamLimit {
    public static void main(String[] args) {
        Stream.of("Jai", "Mahesh","Vishal","Naren","Hemant")
                .limit(3)
                .forEach(System.out::println);

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
