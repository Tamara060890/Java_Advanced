package be.intecbrussel.les1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: " + queue);

        // Het eerste element opvragen en printen
        String frontElement = queue.peek();
        System.out.println("Eerste element " + frontElement);

        //Het eerste element verwijderen
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Updated Queue: " + queue);

        //Controleren of de Queue leeg is
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue empty? " + isEmpty);

        //De grotte van de Queue aanvragen
        int size = queue.size();
        System.out.println("Size of Queue: " + size);
    }
}
