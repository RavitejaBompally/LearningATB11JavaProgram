package Exceptions;

public class exceptions_IQ_006 {
    public static void main(String[] args) {
       final double pi = 3.14;
       int a = 0;
        try {
          int b = 10/a;
        } catch (Exception e) {
            System.out.println("div by zero");
        }
        finally {
            System.out.println("execute and close");
        }

    }
}
