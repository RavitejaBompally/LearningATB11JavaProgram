package Self_Practice;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter the Input number 2");
        int num2 = sc.nextInt();
        if(num1 > num2) {
            System.out.println("num1 is largest");
        }
            else if (num2<num1){
                System.out.println("num2 is smallest");
            }
            else {
            System.out.println("Both numbers are equal");
        }
        }
    }
