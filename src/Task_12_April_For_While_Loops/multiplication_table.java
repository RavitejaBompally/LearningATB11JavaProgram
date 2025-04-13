package Task_12_April_For_While_Loops;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to do multiplication");
        int number = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(number+ " * " +i+ " = " +(number*i));

        }
    }
}
