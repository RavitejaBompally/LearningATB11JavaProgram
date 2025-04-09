package Exceptions;

public class exceptions003 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10/0;
        }
catch (Exception e) {
    System.out.println("2");
}
    }
}
