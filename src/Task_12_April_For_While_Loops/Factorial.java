package Task_12_April_For_While_Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Factorial Number for which you want");
        int number = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial*i;
        }
        System.out.println("Factorial of number is ");
            System.out.println(factorial);
    }
}
