package Self_Practice;

public class print_reverse_string {
    public static void main(String[] args) {
        String input = "This is an TCS interview";
        String reversed = "";
        for (int i = input.length()-1; i>0; i--) {
            reversed = reversed + input.charAt(i);
        }
        System.out.println(reversed);
    }
}
