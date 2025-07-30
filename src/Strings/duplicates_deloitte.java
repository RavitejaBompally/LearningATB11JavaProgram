package Strings;

public class duplicates_deloitte {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate numbers found are: " + arr[i]);
                    break;
                }

            }
        }
    }
}
