package be.intecbrussel.les1.oefeningen.oefening1;
import java.util.Arrays;
import java.util.List;
import static be.intecbrussel.les1.oefeningen.oefening1.Oefening.*;

public class MainApp {
    public static void main(String[] args) {
        Oefening oefening = new Oefening();
        // Voorbeelden voor string methodes
        List<String> fruit = Arrays.asList("appel", "banaan", "appel", "ananas", "aardbei", "abrikoos", "kers");
        // Voorbeelden voor getallen methodes
        List<Integer> getallen = Arrays.asList(2, 4, 6, 8, 10, 11, 13);

        System.out.println("---Oefening1---");
        System.out.println("Strings naar hoofdletters: " + oefening.toUppercase1(fruit));
        oefening.toUppercase2(fruit);

        System.out.println("---Oefening2---");
        System.out.println("Strings die beginnen met 'a': " + oefening.filterA1(fruit));
        oefening.filterA2(fruit);

        System.out.println("---Oefening3---");
        System.out.println("Lengte > 3: " + oefening.filterB1(fruit));
        oefening.filterB2(fruit);

        System.out.println("---Oefening4---");
        System.out.println("Omgekeerde volgorde: " + oefening.filterC1(fruit));
        oefening.filterC2(fruit);

        System.out.println("---Oefening5---");
        System.out.println("Samengevoegd met een komma: " + oefening.filterD1(fruit));
        oefening.filterD2(fruit);

        System.out.println("---Oefening6---");
        System.out.println("Alles met de hoofdletters: " + oefening.filterE(fruit));

        System.out.println("---Oefening7---");
        System.out.println("Gemiddelde van even getallen: " + gemiddeldVanEvenGetallen(getallen));

        System.out.println("---Oefening8---");
        System.out.println("Lengte van de langste string: " + lengteLangsteString(fruit));

        System.out.println("---Oefening9---");
        System.out.println("Zijn er alleen even getallen? " + bevatAlleenEven(getallen));

        System.out.println("---Oefening10---");
        System.out.println("Product van alle getallen: " + productVanElementen(Arrays.asList(2, 3, 4)));

        System.out.println("---Oefening11---");
        System.out.println("Dubbele elementen verwijderen: " + verwijderDubbele(fruit));
    }
}

