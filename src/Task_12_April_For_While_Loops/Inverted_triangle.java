package Task_12_April_For_While_Loops;

import java.util.Scanner;

public class Inverted_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the format");
        int num = sc.nextInt();
        for (int i = num; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
