package Task_April_4;

import java.util.Scanner;

public class Find_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = sc.nextInt();
        if(num1 > num2) {
            System.out.println(num1 + " is an maximum number");
        }
            else{
                System.out.println(num2 + " is an minimum number");
            }
        }
    }

