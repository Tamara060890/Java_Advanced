package be.intecbrussel.les1.oefeningen.oefening2;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Oefening {
    //Strings die beginnen met "a" in hoofdletters, in omgekeerde volgorde en afgekort tot 10 karakters afprinten
    public String filterF(List<String> strings) {
        List<String> filtered = strings.stream()
                .filter(s ->(s.startsWith("a") || s.startsWith("A")) && s.length() > 3)
                .map(str->(str.length()>10 ? str.substring(0,10) : str).toUpperCase())
                .collect(Collectors.toList());

        Collections.reverse(filtered);

        return filtered.stream().collect(Collectors.joining(" ,"));
    }

    //Strings met prefix en suffix afprinten
    public String filterD1(List<String> strings) {
        String prefix = "Fruit ";
        String suffix = " is lekker";
        return strings.stream()
                .filter(s ->(s.startsWith("a") || s.startsWith("A")) && s.length() > 3)
                .map(str->(str.length()>10 ? str.substring(0,10) : str).toUpperCase())
                .map(str-> {
                    return new StringBuilder(str).reverse().toString();
                })
                .map(fruit->(prefix + fruit + suffix))
                .collect(Collectors.joining(" ,"));
    }

    //Strings met unieke nummers afprinten
    public String filterG(List<String> strings) {
        String prefix = "Fruit ";
        String suffix = " is lekker";
        List<String> filtered = strings.stream()
                .filter(s ->(s.startsWith("a") || s.startsWith("A")) && s.length() > 3)
                .map(str->(str.length()>10 ? str.substring(0,10) : str).toUpperCase())
                .map(fruit->(prefix + fruit + suffix))
                .collect(Collectors.toList());

        Collections.reverse(filtered);

        return filtered.stream().collect(Collectors.joining(" ,"));
    }

    //Strings met random nummers afprinten
    public String filterH(List<String> strings) {
        AtomicInteger fruitId = new AtomicInteger(1);
        String prefix = "Fruit ";
        String suffix = " is lekker";
        List<String> filtered = strings.stream()
                .filter(s ->(s.startsWith("a") || s.startsWith("A")) && s.length() > 3)
                .map(str->(str.length()>10 ? str.substring(0,10) : str).toUpperCase())
                .map(fruit->(prefix + fruit + suffix))
                .collect(Collectors.toList());

        Collections.reverse(filtered);

        return filtered.stream().map(fruit->fruitId.getAndIncrement() + ". " + fruit).collect(Collectors.joining(" ,"));
    }
    public String filterI(List<String> strings) {
        Random random = new Random();
        String prefix = "Fruit ";
        String suffix = " is lekker";
        List<String> filtered = strings.stream()
                .filter(s ->(s.startsWith("a") || s.startsWith("A")) && s.length() > 3)
                .map(str->(str.length()>10 ? str.substring(0,10) : str).toUpperCase())
                .map(fruit->(prefix + fruit + suffix))
                .distinct()
                .collect(Collectors.toList());

        Collections.reverse(filtered);

        return filtered.stream().map(fruit ->(1 + random.nextInt(10)) + ". " + fruit).collect(Collectors.joining(" ,"));
    }
}
