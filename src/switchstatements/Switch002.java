package switchstatements;

public class Switch002 {
    public static void main(String[] args) {
        String grade = "B";
        switch(grade) {
            case "A":
                System.out.println("Good Job");
                break;
            case "B":
                    System.out.println("Nice job");
                    break;
            case "C":
                        System.out.println("Excellent job");
                        break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
