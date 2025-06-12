package be.intecbrussel.les1.oefening1;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> getallen = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // De originele lijst tonen
        System.out.println("--- Originele getallen ---");
        getallen.forEach(n -> System.out.print(n + " "));

        //Lambda-expressie die interface implementeert
        NumberCheck isOdd = (n)-> n % 2 == 0;

        System.out.println("\n--- De even getallen ---");
        //Filter en print de even getallen
        getallen.stream()
                .filter(isOdd::check)
                .forEach(n -> System.out.print(n + " ")); //lijstformaat
                //.forEach(System.out::println); // kolomformaat

    }
}
