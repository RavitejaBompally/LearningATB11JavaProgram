package Self_Practice;

public class print_duplicate_characters {
    public static void main(String[] args) {
        String str = "Raviteja Bompally".toLowerCase().replace(" ", "");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            // Count how many times 'ch' appears in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) count++;
            }
            // Print if count > 1, and print only once
            if (count > 1 && str.indexOf(ch) == i) {
                System.out.println(ch + " - " + count);
            }
        }
    }
}
