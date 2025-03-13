package TernaryOperators;

public class Lab003practice {
    public static void main(String[] args) {
        int grade = 90;
        String result = (grade >= 90 && grade <= 100) ? "A" :
                (grade >= 80 && grade <= 89) ? "B" :
                        (grade >= 70 && grade <= 79) ? "C" :
                                (grade >= 60 && grade <= 69) ? "D" : "F";
        System.out.println("Your Grade is: " + result);
    }
}