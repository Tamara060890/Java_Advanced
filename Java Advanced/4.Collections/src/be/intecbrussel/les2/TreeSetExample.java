package be.intecbrussel.les2;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //Alles gesorteerd afprinten (van klein naar groot)
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(2);
        set.add(8);
        set.add(3);

        System.out.println("TreeSet: " + set);

        //Het eerste en laatste element van de treeSet opvragen
        Integer firstElement = set.first();
        Integer lastElement = set.last();
        System.out.println("First element " + firstElement);
        System.out.println("Last element " + lastElement);

        //Een element in de TreeSet zoeken dat groter is dan een opgegeven waarde
        Integer higherValue = set.lower(5);
        System.out.println("Element higher than 5 " + higherValue);

        //Een element in de TreeSet zoeken dat kleiner is dan een opgegeven waarde
        Integer lowerValue = set.lower(5);
        System.out.println("Element lower than 5: " + lowerValue);

        //De Treeset afdrukken in omgekeerde volgorde
        TreeSet<Integer> descendingSet = (TreeSet<Integer>) set.descendingSet();
        System.out.println("Descending TreeSet: " + descendingSet);

        //Een subset van TreeSet maken
        TreeSet<Integer> subset = (TreeSet<Integer>) set.subSet(3,8);
        System.out.println("Subset of TreeSet " + subset);

        //De TreeSet leegmaken
        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is SetTree empty? " + isEmpty);

        }
    }
