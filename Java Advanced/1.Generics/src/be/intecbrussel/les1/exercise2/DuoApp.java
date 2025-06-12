package be.intecbrussel.les1.exercise2;

public class DuoApp {
    public static void main(String[] args) {
        IntegerDuo intDuo = new IntegerDuo(5,7);
        StringDuo stringDuo = new StringDuo("Hello", "World");
        ComparableDuo comparableDuo = new ComparableDuo(6,73);

        intDuo.swap();
        System.out.println(intDuo.getFirst());
        System.out.println(intDuo.getSecond());
        System.out.println(intDuo.getFirst() + intDuo.getSecond());
        System.out.println(intDuo.getFirst() * intDuo.getSecond());
        System.out.println("----------------------");

        String first = stringDuo.getFirst();
        String second = stringDuo.getSecond();
        System.out.println(first + " " + second);

        System.out.println("De grootste getal is " + comparableDuo.getHighest());
        System.out.println("De kleinste getal is " + comparableDuo.getLowest());
    }
}
