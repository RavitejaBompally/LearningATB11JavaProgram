package Task_12_April_For_While_Loops;

import java.util.Scanner;

public class Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to print the pyramid Star format : ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
