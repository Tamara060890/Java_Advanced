package be.intecbrussel.les2;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        //Alles tonen zoals het is
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");
        set.add(null);
        set.add(null);

        System.out.println("LinkedHashSet: " + set);

        //Controleren of een element in de LinkedHashSet zit
        boolean containsApple = set.contains("Apple");
        System.out.println("Contains Apple? " + containsApple);

        //Een element uit de LinkedHashSet verwijderen
        boolean removed = set.remove("Orange");
        System.out.println("Removed Orange? " + removed);

        //De grootte van de LinkedHashSet opvragen
        int size = set.size();
        System.out.println("Size of LinkedHashSet: " + size);

        //De LinkedHashSet leegmaken
        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);
    }

}
