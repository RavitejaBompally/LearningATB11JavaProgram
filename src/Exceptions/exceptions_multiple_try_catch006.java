package Exceptions;

public class exceptions_multiple_try_catch006 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("are you fool");
        }
        catch (Exception e) {
            System.out.println("again are you fool");
        }
        System.out.println("2");
        }
    }
