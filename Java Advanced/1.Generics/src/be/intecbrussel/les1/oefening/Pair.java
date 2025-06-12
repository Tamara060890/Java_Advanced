package be.intecbrussel.les1.oefening;

public class Pair <T>{
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    // toString-methode

    @Override
    public String toString() {
        return first + " " + second;
    }
}
