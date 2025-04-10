package Exceptions;

public class exceptions_try_catch_finally_005 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int c = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be always executed");
        }

    }
}
