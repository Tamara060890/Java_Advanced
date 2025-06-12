package be.intecbrussel.les1.oefening2;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);

        // Lambda-expressie met twee parameters
        NumberCheck checkType = (number, type) -> {
            if (type.equalsIgnoreCase("even")) {
                return number % 2 == 0;
            } else if (type.equalsIgnoreCase("oneven")) {
                return number % 2 != 0;
            } else {
                // Ongeldige invoer → gooi een uitzondering
                throw new IllegalArgumentException("Ongeldig type: " + type + ". Gebruik 'even' of 'oneven'.");
            }
        };

        // Kies welk type je wilt afdrukken (even of odd)
        String selectedType = "oneven"; // verander naar "odd" om oneven te tonen

        System.out.println("De " + selectedType + " getallen:");

        // Filter en print op basis van het gekozen type
        num.stream()
                .filter(n -> checkType.check(n, selectedType))
                .forEach(n -> System.out.print(n + " "));
    }
}
