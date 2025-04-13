package forloops;

import java.util.Scanner;

public class Triangle_classifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side1");
        int side1 = scanner.nextInt();
        System.out.println("Enter the side2");
        int side2 = scanner.nextInt();
        System.out.println("Enter the side3");
        int side3 = scanner.nextInt();
        if(side1==side2 && side3==side1 && side2==side1) {
            System.out.println("It is Equilateral Triangle");
        } else if (side1==side2 || side3==side1 || side2==side3) {
            System.out.println("It is Isosceles Triangle");
        }
        else {
            System.out.println("It is Scalene Triangle");
        }
    }
}
