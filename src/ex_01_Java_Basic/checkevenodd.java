package ex_01_Java_Basic;

import java.util.Scanner;

public class checkevenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Checking if the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }

        scanner.close();
    }
}
