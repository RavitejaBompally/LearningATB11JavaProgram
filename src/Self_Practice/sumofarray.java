package Self_Practice;

public class sumofarray {
    public static void main(String[] args) {
        int numbers [] = {2,5,4,6,8};
        int sum = 0;
        for (int i = 0; i<numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
        }
    }
