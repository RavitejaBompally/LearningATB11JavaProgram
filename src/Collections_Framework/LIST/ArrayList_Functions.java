package Collections_Framework.LIST;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Functions {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("3");
        list.add(true);

        System.out.println(list.size());
        System.out.println(list.indexOf(2));
        System.out.println(list.contains("3"));
        System.out.println(list.contains(4));
        System.out.println(list);

        System.out.println("-------------------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.clear();
        System.out.println(list);
        }
    }
