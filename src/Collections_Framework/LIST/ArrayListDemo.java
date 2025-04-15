package Collections_Framework.LIST;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Ravi");
        arrayList.add("Teja");
        arrayList.add("Tinku");
        arrayList.add("Rakesh");
        arrayList.add("Ravi");
        System.out.println(arrayList);
        System.out.println("Array list size is " + arrayList.size());
    }
}
