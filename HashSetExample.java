
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");

        fruits.add("Apple");

        System.out.println("Fruits HashSet: " + fruits);


        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);


        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the set.");
        } else {
            System.out.println("Mango is not in the set.");
        }

        System.out.println("\nIterating over HashSet:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("\nSize of HashSet: " + fruits.size());


        fruits.clear();
        System.out.println("After clearing, is set empty? " + fruits.isEmpty());
    }
}
