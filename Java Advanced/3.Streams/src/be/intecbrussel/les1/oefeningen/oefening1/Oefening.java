package be.intecbrussel.les1.oefeningen.oefening1;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Oefening {
    // 1. Strings naar hoofdletters
    //Voorbeeld1: Als lijst printen
    public List<String> toUppercase1(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
    //Voorbeeld2: Als string printen
    public List<String> toUppercase2(List<String> strings) {
        List<String> uppercased = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print alle hoofdletters als één string
        String joined = uppercased.stream()
                .collect(Collectors.joining(" "));
        System.out.println(joined);

        // Return de lijst met hoofdletters
        return uppercased;
    }

    // 2. Filter strings die beginnen met 'a'
    //Voorbeeld1: Als lijst printen
    public List<String> filterA1(List<String> strings) {
        // Stream de lijst en filter op strings die beginnen met 'a'
        return strings.stream()
                .filter(s ->(s.startsWith("a") || s.startsWith("A")))
                .collect(Collectors.toList());
    }
    //Voorbeeld2: Als string printen
    public List<String> filterA2(List<String> strings) {
        // Filter de lijst op strings die beginnen met 'a'
        List<String> filtered = strings.stream()
                .filter(s -> (s.startsWith("a") || s.startsWith("A")))
                .collect(Collectors.toList());

        // Print de gefilterde woorden als één string
        String joined = filtered.stream()
                .collect(Collectors.joining(" "));
        System.out.println(joined);

        // Return de gefilterde lijst
        return filtered;
    }

    // 3. Filter strings die beginnen met 'a' en lengte > 3
    //Voorbeeld1: Als lijst printen
    public List<String> filterB1(List<String> strings) {
        return strings.stream()
                .filter(s -> (s.startsWith("a") || s.startsWith("A")) && s.length() > 3)
                .collect(Collectors.toList());
    }
    //Voorbeeld2: Als string printen
    public List<String> filterB2(List<String> strings) {
        // Filter op strings die beginnen met 'a' én lengte > 3
        List<String> filtered = strings.stream()
                .filter(s -> (s.startsWith("a") || s.startsWith("A")) && s.length() > 3)
                .collect(Collectors.toList());

        // Print de gefilterde woorden als één string met spaties
        String joined = filtered.stream()
                .collect(Collectors.joining(" "));
        System.out.println(joined);

        // Return de gefilterde lijst
        return filtered;
    }

    // 4. FilterB + omgekeerde volgorde
    //Voorbeeld1: Als lijst printen
    public List<String> filterC1(List<String> strings) {
        // Filter de lijst op strings die beginnen met 'a' en lengte > 3
        List<String> filtered = strings.stream()
                .filter(s -> (s.startsWith("a") || s.startsWith("A")) && s.length() > 3)
                .collect(Collectors.toList());

        // Draai de lijst om
        Collections.reverse(filtered);

        return filtered;
    }
    //Voorbeeld2: Als string printen
    public List<String> filterC2(List<String> strings) {
        // Filter op strings die beginnen met 'a' en lengte > 3
        List<String> filtered = strings.stream()
                .filter(s -> (s.startsWith("a") || s.startsWith("A")) && s.length() > 3)
                .collect(Collectors.toList());

        // Keer de volgorde om
        Collections.reverse(filtered);

        // Print de gefilterde woorden als één string
        String joined = filtered.stream()
                .collect(Collectors.joining(" "));
        System.out.println(joined);

        // Return de omgekeerde lijst
        return filtered;
    }

    // 5. FilterC + samenvoegen met komma
    //Voorbeeld1: Als lijst printen
    public String filterD1(List<String> strings) {
        // filtering → omkeren → joining
        List<String> filtered = strings.stream()
                .filter(s ->(s.startsWith("a") || s.startsWith("A")) && s.length() > 3)
                .collect(Collectors.toList());

        Collections.reverse(filtered);

        return filtered.stream().collect(Collectors.joining(","));
    }
    //Voorbeeld2: Als string printen
    public String filterD2(List<String> strings) {
        // Filter op strings die beginnen met 'a' en lengte > 3
        List<String> filtered = strings.stream()
                .filter(s ->(s.startsWith("a") || s.startsWith("A")) && s.length() > 3)
                .collect(Collectors.toList());

        // Keer de volgorde om
        Collections.reverse(filtered);

        // Voeg samen met komma
        String joined = filtered.stream()
                .collect(Collectors.joining(","));

        // Return de samengevoegde String
        return joined;
    }
    //Voorbeeld3
    public String filterD3(List<String> strings){
        return strings.stream()
                .filter(s ->(s.startsWith("a") || s.startsWith("A")) && s.length() > 3)
                .map(str->new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining(" ,"));
    }

    // 6. FilterD + in hoofdletters
    public String filterE(List<String> strings) {
        // Filteren en verzamelen in een lijst
        List<String> filtered = strings.stream()
                .filter(s ->(s.startsWith("a") || s.startsWith("A")) && s.length() > 3)
                .collect(Collectors.toList());

        // Lijst omkeren
        Collections.reverse(filtered);

        // Omgezette strings in hoofdletters combineren met komma's
        return filtered.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
    }

    // 7. Gemiddelde van even getallen
    public static double gemiddeldVanEvenGetallen(List<Integer> getallen) {
        return getallen.stream()
                // Filter alleen de even getallen (deelbaar door 2)
                .filter(n -> n % 2 == 0) // Even getallen filteren
                .mapToInt(n -> n) // Integer-stream naar een primitieve IntStream zetten
                .average() // Bereken het gemiddelde
                .orElse(0.0); // Als er geen even getallen zijn, geef standaard 0.0 terug
    }
    // 8. Lengte van de langste string
    public static int lengteLangsteString(List<String> strings) {
        return strings.stream()
                .map(String::length)
                .max(Integer::compareTo)
                .orElse(0);
    }

    // 9. Controleren of alle getallen even zijn
    public static boolean bevatAlleenEven(List<Integer> getallen) {
        return getallen.stream()
                // Controleer of elk getal even is
                .allMatch(n -> n % 2 == 0);
    }

    // 10. Product van alle elementen
    public static int productVanElementen(List<Integer> getallen) {
        return getallen.stream()
                // reduce begint met 1 en vermenigvuldigt alle elementen één voor één
                .reduce(1, (a, b) -> a * b);
    }

    // 11. Verwijder dubbele elementen
    public static List<String> verwijderDubbele(List<String> lijst) {
        return lijst.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
