package be.intecbrussel.les1.exercise2;

public class Duo<E> {
    private E first;
    private E second;

    public Duo(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void swap(){
        E temp = first;
        first = second;
        second = temp;
    }
}
