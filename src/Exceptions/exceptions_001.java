package Exceptions;

public class exceptions_001 {
    public static void main(String[] args) {
        System.out.println("starting the program");
        String input_user = args[0];
        int a = Integer.parseInt(input_user);
        int output = 0;
        try {
            output = 100/a;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(output);
        System.out.println("end of the program");
    }
}
