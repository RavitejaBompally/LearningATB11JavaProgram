package Strings;

public class vowels {
    public static void main(String[] args) {
        String input = "Hello world";
        int vowels = 0;
        int consonant = 0;
        input = input.toLowerCase();
        System.out.println(input);

        for(int i=0;i<=input.length(); i++) {
            char ch = input.charAt(i);
            if((ch == 'a') || (ch == 'e') || (ch == 'o') || (ch == 'i') || false){
                vowels++;
            }
            else{
                consonant++;
            }
            System.out.println("Number of vowels" + vowels);
            System.out.println("Number of consonants " + consonant);
            }
        }

    }
