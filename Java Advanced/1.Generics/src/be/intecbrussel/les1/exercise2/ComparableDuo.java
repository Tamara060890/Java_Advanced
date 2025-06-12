package be.intecbrussel.les1.exercise2;

import be.intecbrussel.les1.exercise1.Duo;

public class ComparableDuo<T extends Comparable<T>> extends Duo<T> {
    public ComparableDuo(T first, T second) {
        super(first, second);
    }

    public T getHighest(){
        return getFirst().compareTo(getSecond()) < 0 ? getSecond() : getFirst();
    }
    public T getLowest(){
        return getFirst().compareTo(getSecond()) < 0 ? getFirst() : getSecond();
    }
}
