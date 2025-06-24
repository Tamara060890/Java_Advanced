package be.intecbrussel.les3;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap <String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Orange", 8);
        linkedHashMap.put("Apple",10);
        linkedHashMap.put("Banana", 12);

        //Een element opzoeken en de waarde afdrukken
        int quantityOfApple = linkedHashMap.get("Apple");
        System.out.println("Aantal appels: " + quantityOfApple);

        //Controleren of een sleutel aanwezig is in de LinkedHashMap
        boolean containsBanana = linkedHashMap.containsKey("Banana");
        System.out.println("Bevat banana? " + containsBanana);

        for(String key : linkedHashMap.keySet()){
            System.out.println("Sleutel " +  key);
        }

        //Alle waarde van de LinkedHashMap afdrukken
        for (int value : linkedHashMap.values()) {
            System.out.println("Waarde " + value);
        }
    }
}
