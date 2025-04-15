package Collections_Framework.LIST;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List list = new java.util.LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
