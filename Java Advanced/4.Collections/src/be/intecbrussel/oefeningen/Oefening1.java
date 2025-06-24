package be.intecbrussel.oefeningen;

import java.util.ArrayList;

public class Oefening1 {
    public static void main(String[] args) {
        ArrayList<String> cities1 = new ArrayList<>();
        cities1.add("Brussel");
        cities1.add("Leuven");
        cities1.add("Brugge");
        cities1.add("Gent");

        ArrayList<String> cities2 = new ArrayList<>();
        cities2.add("Antwerpen");
        cities2.add("Liege");
        cities2.add("Kortrijk");
        cities2.add("Sint-Truiden");

        ArrayList<String> cities = new ArrayList<>(cities1);
        cities.addAll(cities2);

        System.out.println("Eerste ArrayList: " + cities1);
        System.out.println("Tweede ArrayList: " + cities2);
        System.out.println("Beide ArrayListen samen: " + cities);
    }
}
