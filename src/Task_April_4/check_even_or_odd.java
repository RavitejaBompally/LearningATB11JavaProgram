package Task_April_4;

import java.util.Scanner;

public class check_even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println(num + " it is an even number");
        }
        else{
            System.out.println(num +" it is an odd number");
        }
    }
}
