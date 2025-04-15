package Collections_FrameworkSET;

import java.util.LinkedHashSet;

public class LinkedHashSET {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("watermelon");
        fruits.add("grapes");
        fruits.add("kiwi");
        fruits.add("mango");

        System.out.println(fruits);
    }
}
