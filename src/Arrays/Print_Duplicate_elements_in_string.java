package Arrays;

public class Print_Duplicate_elements_in_string {
    public static void main(String[] args) {
        String array[] = {"ravi","teja","ravi","sunny","bunny","tinku","teja","sunny"};

        boolean flag = false;

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    System.out.println("Found Duplicate elements: " + array[i]);
                    flag=true;
                }
            }
        }
        if (flag==false) {
            System.out.println("Duplicate element not found");
        }
    }
}
