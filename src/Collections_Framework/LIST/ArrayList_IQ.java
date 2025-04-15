package Collections_Framework.LIST;

import java.util.*;


public class ArrayList_IQ {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(51);
        marks.add(65);
        marks.add(88);
        marks.add(75);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        //reverse order
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
