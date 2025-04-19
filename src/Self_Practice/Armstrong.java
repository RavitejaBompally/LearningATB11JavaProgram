package Self_Practice;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153, temp, sum = 0, rem=0;
        temp=num;
        while (num!=0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if (temp==sum) {
            System.out.println("It is an Armstrong");
        }
        else {
            System.out.println("It is not an Armstrong");

        }
    }
}
