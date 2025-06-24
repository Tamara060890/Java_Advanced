package be.intecbrussel.les1;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Inas");
        vector.add("Adem");
        vector.add("Ilias");
        vector.add("Marwane");

        Iterator itr = vector.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
