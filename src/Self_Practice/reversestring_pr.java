package Self_Practice;

public class reversestring_pr {
    public static void main(String[] args) {
        String s1 = "ravi";
        String reversed = "";
        for (int i = s1.length()-1; i>=0; i--) {
            reversed = reversed + s1.charAt(i);
        }
        System.out.println(reversed);

        }
    }





