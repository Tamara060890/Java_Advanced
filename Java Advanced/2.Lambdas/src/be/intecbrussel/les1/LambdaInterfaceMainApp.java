package be.intecbrussel.les1;

public class LambdaInterfaceMainApp {
    public static void main(String[] args) {
        LambdaInterface expression = (int x) ->
                System.out.println(2 * x);
        expression.abstractFunction(5);
    }
}
