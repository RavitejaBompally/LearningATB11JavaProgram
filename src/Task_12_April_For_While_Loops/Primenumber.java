package Task_12_April_For_While_Loops;


public class Primenumber {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        }
        {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}