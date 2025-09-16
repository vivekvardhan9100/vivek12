import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
 ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Mango");
fruits.add("Orange");
System.out.println("Original List: " + fruits);
System.out.println("Element at index 1: " + fruits.get(1)); 
fruits.set(2, "Pineapple"); 
System.out.println("After modification: " + fruits);
System.out.println("After removing 'Apple': " + fruits);
System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
System.out.println("Total fruits: " + fruits.size());
        System.out.println("Contains Banana? " + fruits.contains("Banana"));
    }
}
