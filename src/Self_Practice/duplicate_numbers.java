package Self_Practice;

public class duplicate_numbers {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 3, 7, 1, 9, 5};

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i+1; j < numbers.length; j++) {

                if(numbers[i] == numbers[j]) {

                    System.out.println("Duplicate found: " + numbers[i]);
                    break;
                }
            }
        }
    }
}
