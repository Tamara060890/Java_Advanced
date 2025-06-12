package be.intecbrussel.les1;

public class ReverseInterfaceMainApp {
    public static void main(String[] args) {
        ReverseInterface rev = (str)->{
            String result = "";
            for(int i = str.length()-1; i>=0;i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("The reversed string is :" + rev.reverse("Lambda"));
    }

}
