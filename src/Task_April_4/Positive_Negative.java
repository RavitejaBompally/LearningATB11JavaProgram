package Task_April_4;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        if(num >= 0) {
            System.out.println(num +" is a positive number");
        }
        else{
            System.out.println(num +" is a negative number");
        }
    }
}
