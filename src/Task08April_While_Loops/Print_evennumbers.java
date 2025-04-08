package Task08April_While_Loops;

public class Print_evennumbers {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
