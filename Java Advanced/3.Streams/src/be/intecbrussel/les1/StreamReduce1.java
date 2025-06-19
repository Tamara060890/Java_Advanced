package be.intecbrussel.les1;

import java.util.Arrays;
import java.util.List;

public class StreamReduce1 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5);

        int even = number.stream().filter(x-> x % 2 == 0).reduce(0,(ans, i)->ans+i);
        System.out.println(even);
    }
}
