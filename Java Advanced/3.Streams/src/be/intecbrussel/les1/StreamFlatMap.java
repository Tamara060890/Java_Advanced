package be.intecbrussel.les1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMap {
    public static void main(String[] args) {
        try{
            long noOfWords = Files.lines(Paths.get("C:\\Users\\gjops\\Downloads\\new.txt"))
                    .flatMap(l-> Arrays.stream(l.split(" ")))
                    .distinct()
                    .count();
            System.out.println("No of Words: " + noOfWords);
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            List<String> uniqueWords = Files.lines(Paths.get("C:\\Users\\gjops\\Downloads\\new.txt"))
                    .flatMap(line->Arrays.stream(line.split(" ")))
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println("Distinct woorden: ");
            uniqueWords.forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
        Stream<Integer> stream = list.stream().flatMap(Collection::stream);
        stream.forEach(System.out::println);
    }
}
