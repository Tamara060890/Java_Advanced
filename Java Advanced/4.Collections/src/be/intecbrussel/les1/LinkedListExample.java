package be.intecbrussel.les1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList maken
        LinkedList<String> list = new LinkedList<>();

        //Object toevoegen aan LinkedList
        list.add("Nina");
        list.add("Janan");
        list.add("Maxim");
        list.add("Haytam");
        list.add("Abdessamad");
        list.add("Raphael");

        //Lijst doorlopen via Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
