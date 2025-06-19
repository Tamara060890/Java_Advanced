package be.intecbrussel.les1.oefeningen.oefening2;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Oefening oefening = new Oefening();
        List<String> fruit = Arrays.asList("appel", "banaan", "appel","sinaasappel", "ananasssssss", "aardbei", "abrikoos", "kers");

        System.out.println("Strings die beginnen met a tonen met hoofdletters: " + oefening.filterF(fruit));
        System.out.println("Strings met prefix en suffix: " + oefening.filterG(fruit));
        System.out.println("Strings met unieke nummers: " + oefening.filterH(fruit));
        System.out.println("Strings met random nummers: " + oefening.filterI(fruit));
    }
}
