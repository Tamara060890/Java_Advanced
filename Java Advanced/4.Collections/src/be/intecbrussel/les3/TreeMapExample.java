package be.intecbrussel.les3;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 5);
        treeMap.put("Apple", 10);
        treeMap.put("Orange", 20);

        //controleren of een sleutel aanwezig is in de TreeMap
        boolean containsBanana = treeMap.containsKey("Banana");
        System.out.println("Bevat banana? " + containsBanana);

        //De grootte van de TreeMap opvragen
        int size = treeMap.size();
        System.out.println("Grootte van de TreeMap: " + size);

        //Alle sleutels van de TreeMap afdrukken
        for(String key : treeMap.keySet()){
            System.out.println("Sleutel: " + key);
        }

        //Alle waarde van de TreeMap afdrukken
        for(int value : treeMap.values()){
            System.out.println();
        }
    }
}
