package Strings;

public class remove_white_spaces {
    public static void main(String[] args) {
        String str = "Geeks  for Geeks ";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
