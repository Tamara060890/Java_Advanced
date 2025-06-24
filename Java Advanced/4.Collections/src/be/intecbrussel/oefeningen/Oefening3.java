package be.intecbrussel.oefeningen;

import java.util.ArrayList;
import java.util.Scanner;
public class Oefening3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> woorden = new ArrayList<>();
        while (true) {
            System.out.println("Typ END als je wil stoppen");
            System.out.println("Woord: ");
            String invoer = scanner.nextLine();
            if (invoer.equalsIgnoreCase("end")) {
                break;
            }
            woorden.add(invoer);
            System.out.println("De woord is toegevoegd " + invoer);
        }
        System.out.println("De toegevoegde woorden zijn: ");
        for (String woord:woorden){
            System.out.print(woord + " ");
        }
    }
}
