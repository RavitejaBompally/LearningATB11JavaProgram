package Self_Practice;

public class Print_words {
    public static void main(String[] args) {
        String words [] ={"Madam", "Radar", "Level", "World", "Java"};

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char first = Character.toLowerCase(word.charAt(0));
            char last = Character.toLowerCase(word.charAt(word.length()-1));

            if (first==last) {
                System.out.println(word);
            }
        }
    }
}
