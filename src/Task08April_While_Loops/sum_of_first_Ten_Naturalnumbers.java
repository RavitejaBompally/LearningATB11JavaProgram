package Task08April_While_Loops;

public class sum_of_first_Ten_Naturalnumbers {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            System.out.println(i);
            sum = sum + i;
            i++;
        }
    }
}
