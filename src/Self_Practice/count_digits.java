package Self_Practice;

public class count_digits {
    public static void main(String[] args) {
        int count = 0;
        int number = 25;
        while (number!=0) {
            number = number / 10;
            count++;
        }
        System.out.println("sum of digits " + count);
        }
    }
