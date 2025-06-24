package be.intecbrussel.oefeningen;

import java.util.LinkedList;

public class Oefening4 {
    public static void main(String[] args) {
        LinkedList<String> cities1 = new LinkedList<>();
        cities1.add("Brussel");
        cities1.add("Leuven");
        cities1.add("Brugge");
        cities1.add("Gent");

        LinkedList<String> cities2 = new LinkedList<>();
        cities2.add("Antwerpen");
        cities2.add("Liege");
        cities2.add("Kortrijk");
        cities2.add("Sint-Truiden");

        LinkedList<String> cities = new LinkedList<>(cities1);
        cities.addAll(cities2);

        System.out.println("Eerse LinkedList: " + cities1);
        System.out.println("Tweede LinkedList: " + cities2);
        System.out.println("Beide LinkedListen samen: " + cities);
    }
}
