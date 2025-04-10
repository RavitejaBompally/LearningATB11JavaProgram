package Exceptions;

public class exceptions_arthmetic_005 {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("are you fool");
        }
        System.out.println("2");
        }
    }
