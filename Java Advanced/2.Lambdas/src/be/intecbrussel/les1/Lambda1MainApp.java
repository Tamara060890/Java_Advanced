package be.intecbrussel.les1;

public class Lambda1MainApp {
    public static void main(String[] args) {
        Lambda1Interface ref =(x,y)->{
            System.out.println("Hello " + x + y);
            System.out.println("Have a nice day");
        };
        ref.message("World",'!');
    }
}
