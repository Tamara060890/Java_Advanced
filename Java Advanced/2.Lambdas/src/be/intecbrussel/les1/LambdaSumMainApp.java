package be.intecbrussel.les1;

public class LambdaSumMainApp {
    public static void main(String[] args) {
        LambdaSum result = (int x, int y) ->{
            return x + y;
        };
        System.out.println(result.sum(10,5));
    }
}
