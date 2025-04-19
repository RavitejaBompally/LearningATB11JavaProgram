package Self_Practice;

public class DivisionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("You can't divide by zero!");
        }
    }
}