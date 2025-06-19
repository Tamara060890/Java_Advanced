package be.intecbrussel.les1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduce2 {
    public static void main(String[] args) {
        IntStream numbers = IntStream.range(1,100);
        System.out.println(numbers.count());

        IntStream numbers2 = IntStream.range(1,100);
        System.out.println(numbers2.max().getAsInt());

        IntStream numbers3 = IntStream.range(1,100);
        System.out.println(numbers3.min().getAsInt());

        IntStream numbers4 = IntStream.range(1,100);
        System.out.println(numbers4.average().getAsDouble());

        IntStream numbers5 = IntStream.range(1,100);
        System.out.println(numbers5.sum());

        List<Integer> integers = Arrays.asList(1,1,1);
        System.out.println(integers.stream().reduce(23,(a,b)->a+b));

        String[] colors = {"blue","white","red","yellow","purple"};
        System.out.println(Stream.of(colors).reduce("",(acc, el)->acc+el+";"));

    }
}
