package Collections_Framework;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_animals {
    public static void main(String[] args) {
        List<String> animals = new LinkedList();
        animals.add("dog");
        animals.add("cow");
        animals.add("cat");
        animals.add("goat");
        animals.add("Lion");
        System.out.println(animals);

        //Accessing animals
        System.out.println("First animal is: " + animals.getFirst());
        System.out.println("Last animal is: " + animals.getLast());


        //Remove animals
        animals.removeFirst();
        animals.removeLast();
        System.out.println("animals after removal: " + animals);

        System.out.println("Size of LinkedList: " + animals.size());

    }
}
