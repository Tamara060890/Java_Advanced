package be.intecbrussel.les1.oefening1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberFilterMainApp {
    public static void main(String[] args) {
        // Een lijst met getallen maken
        List<Integer> num = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);

        // De originele lijst tonen
        System.out.println("Originele getallen:");
        num.forEach(n -> System.out.print(n + " "));

        // Twee lambda's definieeren voor even en oneven getallen via de NumberFilter interface
        NumberFilter isEven = n -> n % 2 == 0; // Even getal: rest = 0 bij deling door 2
        NumberFilter isOdd = n -> n % 2 != 0;  // Oneven getal: rest ≠ 0 bij deling door 2

        // .filter() gebruiken om even getallen te selecteren en .collect() om ze in een lijst te steken
        List<Integer> evenNumbers = num.stream()
                .filter(isEven::check) // De check() methode aanroepen van de lambda
                .collect(Collectors.toList()); // Resultaat verzamelen in een nieuwe lijst

        // De even getallen tonen
        System.out.print("\nEven getallen: ");
        evenNumbers.forEach(n -> System.out.print(n + " "));

        // De oneven getallen selecteren en in een lijst steken
        List<Integer> oddNumbers = num.stream()
                .filter(isOdd::check)
                .collect(Collectors.toList());

        // De oneven getallen tonen
        System.out.print("\nOneven getallen: ");
        oddNumbers.forEach(n -> System.out.print(n + " "));
    }
}
