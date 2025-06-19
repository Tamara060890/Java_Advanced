package be.intecbrussel.les1;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamForEach2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jai");
        list.add("Vivek");
        list.add("Mahesh");
        list.add("Vishal");
        list.add("Naren");
        list.add("Hemant");
        list.add("Vikas");
        list.add("Ajay");

        list.forEach(name -> System.out.print(name));

        list.forEach(System.out::println);

        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);
    }
}
