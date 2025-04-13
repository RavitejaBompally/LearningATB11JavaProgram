package Strings;

public class number_to_string {
    public static boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 451;
        System.out.println(isPalindrome(num1));
        System.out.println(isPalindrome(num2));
    }

}
