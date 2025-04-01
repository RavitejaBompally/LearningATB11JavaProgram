package Arrays;

public class arrays_004 {
    public static void main(String[] args) {
        int[] number = {45, 23, 86, 3, 56, 25, 76};
        int max = Integer.MIN_VALUE;   // Smallest possible value
        int second_largest = Integer.MIN_VALUE; // Smallest possible value

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                second_largest = max;  // Previous max becomes second max
                max = number[i];       // Update max
            } else if (number[i] > second_largest && number[i] != max) {
                second_largest = number[i];  // Update second max if it's not equal to max
            }
        }

        System.out.println("Max number is " + max);

        if (second_largest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("Second largest number is " + second_largest);
        }
    }
}
