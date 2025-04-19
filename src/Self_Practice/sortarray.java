package Self_Practice;

import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int [] numbers = {5,1,2,6,8,10};
                Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
