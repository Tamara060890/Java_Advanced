package be.intecbrussel.oefeningen;

import java.util.ArrayList;
import java.util.Random;

public class Oefening2 {
    public static void main(String[] args) {
        ArrayList<Integer> nummers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            nummers.add(random.nextInt(101));
        }

        nummers.sort(null);

        System.out.println("ArrayList van 10 random numbers: " + nummers);
    }
}
