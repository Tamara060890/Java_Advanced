package be.intecbrussel.les1.exercise1;

public class MixedDuoApp {
    public static void main(String[] args) {
        MixedDuo<String, Integer> value = new MixedDuo<>("Age" , 15);
        String s = value.getFirst();
        Integer i = value.getSecond();
        System.out.println(s + ": " + i);
    }
}
