package Collections_FrameworkSET;

import java.util.HashSet;

public class SET001 {
    public static void main(String[] args) {
        HashSet <String> cars = new HashSet<>();

        cars.add("Volvo");
        cars.add("Maruti");
        cars.add("Indica");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Volvo");

        System.out.println(cars);
        System.out.println(cars.contains("Ford"));
        //remove an element
        cars.remove("BMW");
        System.out.println(cars);

        //size of hashset
        System.out.println(cars.size());
    }
}
