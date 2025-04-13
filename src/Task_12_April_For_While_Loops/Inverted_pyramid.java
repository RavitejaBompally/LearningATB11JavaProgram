package Task_12_April_For_While_Loops;

import java.util.Scanner;

public class Inverted_pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to print the Inverted pyramid Star format : ");
        int rows = scanner.nextInt();
        for (int i = rows-1; i >= 1; i--) {
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
