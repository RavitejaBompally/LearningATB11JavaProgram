package Task_April_4;

import java.util.Scanner;

public class Age_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate age");
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("elgible to vote");
        }
            else{
                System.out.println("not eligible to vote");
            }
        }
    }
