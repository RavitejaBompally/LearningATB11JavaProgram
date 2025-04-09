package Exceptions;

public class exceptions_002 {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10/0;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        System.out.println(a);
    }
}
