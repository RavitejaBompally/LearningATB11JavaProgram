package Self_Practice;

public class firstandlastlettersame {
    public static void main(String[] args) {
        String word = "MADAM";

        if (word.charAt(0)==word.charAt(word.length()-1)) {
            System.out.println("same");
        }
        else {
            System.out.println("not same");
        }
    }
}
