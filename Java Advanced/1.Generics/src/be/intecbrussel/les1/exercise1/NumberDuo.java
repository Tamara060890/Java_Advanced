package be.intecbrussel.les1.exercise1;

public class NumberDuo<E extends Number> {
    private E first;
    private E second;

    public NumberDuo(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public double sum(){
        return first.doubleValue() + second.doubleValue();
    }
}
