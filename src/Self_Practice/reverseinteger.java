package Self_Practice;

public class reverseinteger {
    public static void main(String[] args) {
        int reversered = 0;
        int num = 123;
        while (num!=0) {
            int digit = num % 10;
            reversered = reversered * 10 + digit;
            num = num / 10;
        }
        System.out.println(reversered);
        }
    }

