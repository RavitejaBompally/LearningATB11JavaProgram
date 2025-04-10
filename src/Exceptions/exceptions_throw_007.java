package Exceptions;

public class exceptions_throw_007 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        else {
            System.out.println("Result" + (a/b));
        }
    }
}
