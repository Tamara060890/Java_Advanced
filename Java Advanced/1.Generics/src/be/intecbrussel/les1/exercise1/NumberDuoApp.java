package be.intecbrussel.les1.exercise1;

public class NumberDuoApp {
    public static void main(String[] args) {
        NumberDuo<Integer> nd1 = new NumberDuo<>(2,5);
        NumberDuo<Double> nd2 = new NumberDuo<>(2.5,5.7);
        NumberDuo<Number> nd3 = new NumberDuo<>(2,5);

        NumberDuo<?> nd4 = new NumberDuo<>(2,5);
        Number i = nd4.getFirst();
        System.out.println(nd1.sum());
        System.out.println(nd2.sum());
        System.out.println(nd3.sum());
        System.out.println(i);
    }
}
