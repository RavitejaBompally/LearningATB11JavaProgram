package Exceptions;

public class exceptions__try_catch_004 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int c = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
