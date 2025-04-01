package Arrays;

import java.util.Arrays;

public class arrays_003 {
    public static void main(String[] args) {
        int [] marks = {1,2,51,45,89,14,63,32,22,33,100};
         Arrays.sort(marks);
        System.out.println(marks[marks.length-2]);
    }
}
