package be.intecbrussel.les1;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brussel");
        cities.add("Leuven");
        cities.add("Brugge");
        cities.add("Gent");

        //Wij voegen een herhalend element toe
        cities.add("Leuven");

        //Wij voegen een element toe aan de index die wij willen
        cities.add(3,"Genk");
        System.out.println("ArrayList -> ");
        cities.forEach(city-> System.out.println(city + " "));
    }

}
