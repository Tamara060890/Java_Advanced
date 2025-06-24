package be.intecbrussel.les2.pryorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainApp {
    public static void main(String[] args) {
        Queue<BurgerOrder> burgerOrders = new PriorityQueue<>();
        burgerOrders.offer(new BurgerOrder("Big Mac", 2));
        burgerOrders.offer(new BurgerOrder("Big Chicken", 5));
        burgerOrders.offer(new BurgerOrder("Long Chicken", 6));
        burgerOrders.offer(new BurgerOrder("Mac Vegan", 1));
        burgerOrders.offer(new BurgerOrder("Mac Fish", 3));
        burgerOrders.offer(new BurgerOrder("Big Bacon", 4));

        BurgerOrder order = burgerOrders.peek();

        while (order!=null){
            System.out.println("About to prepare " + order);
            order = burgerOrders.poll();
            System.out.println("Preparing " + order);
            order = burgerOrders.peek();
        }
    }
}
