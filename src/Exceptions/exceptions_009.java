package Exceptions;

import java.util.Scanner;

public class exceptions_009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        try {
            int num1 = sc.nextInt();
            int num2 = num1/0;
        } catch (ArithmeticException e) {
            System.out.println("cannot be divided");
        }


    }
}
