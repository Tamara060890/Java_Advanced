package be.intecbrussel.les1.oefening;

public class MainApp {
    public static void main(String[] args) {
        //Een Pair van integers maken
        Pair<Integer> pair = new Pair<>(10,20);
        System.out.println("--- Integer Pair ---");
        System.out.println(pair);

        //Een Pair van String maken
        Pair<String> stringpair = new Pair<>("Hello","World");
        System.out.println("--- String Pair ---");
        System.out.println(stringpair);
    }

}
