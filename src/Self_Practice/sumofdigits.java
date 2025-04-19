package Self_Practice;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int sum = 0;
        while (num!=0) {
            int digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.println("sum of digits " + sum);
    }
}
