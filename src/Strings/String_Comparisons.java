package Strings;

public class String_Comparisons {
    public static void main(String[] args) {
        String s1 = "hello";
        String s3 = "hello";

        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 = new String("hello");

        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s5==s6);

        // contents (equal) value check

        System.out.println(s1.equals(s3));
        System.out.println(s4.equals(s6));
        System.out.println(s5.equals(s3));
        System.out.println(s6.equals(s3));

    }
}
