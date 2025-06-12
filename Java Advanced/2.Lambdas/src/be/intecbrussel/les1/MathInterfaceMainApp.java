package be.intecbrussel.les1;


import java.util.Locale;

public class MathInterfaceMainApp {
    public static void main(String[] args) {
        print((a,b)-> a + b,"ADD");
        print((a,b)-> a - b,"SUB");
        print((a,b)-> a * b,"MUL");
        print((a,b)-> a / b,"DIV");
    }
    static void print (MathInterface math, String op){
        switch (op.toUpperCase()){
            case "ADD":
                System.out.println("The sum of a  and b is: " + math.operation(40,20));
                break;
            case "SUB":
                System.out.println("The difference of a and b is: " + math.operation(40,20));
                break;
            case "MUL":
                System.out.println("The product of a and b is: " + math.operation(40,20));
                break;
            case "DIV":
                System.out.println("The division of a and b is: " + math.operation(40,20));
                break;
            default:
                throw new AssertionError();
        }
    }
}
