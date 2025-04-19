package Self_Practice;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Paindrome number");
        int num = scanner.nextInt();
        int rev = 0;
        int original = num;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (original == rev) {
            System.out.println("It is a Palindrome number");
        } else {
            System.out.println("It is not a Palindrome number");
        }
    }
}
