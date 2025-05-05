package Self_Practice;

public class countevenodd {
    public static void main(String[] args) {
        int numbers [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int oddCount = 0;
        int evenCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total Even numbers: " + evenCount);
        System.out.println("Total Odd numbers: " + oddCount);
    }
}
