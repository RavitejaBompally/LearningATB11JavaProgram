package Exceptions;

import java.util.Scanner;

public class exceptions_throw_008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = sc.nextInt();

        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("You can't go, else you will be out of the house");
        } else {
            System.out.println("You are allowed!");
        }
    }
}