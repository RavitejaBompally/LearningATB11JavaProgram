package Inheritance;

public class Single_Inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.twoBhk();

        Son s1 = new Son();
        s1.threeBhk();
        System.out.println(s1.gold_f);
        s1.twoBhk();


    }


    static class Father {
        int gold_f = 1000;

        void twoBhk() {
            System.out.println("Father has 2bhk");
        }
    }


    static class Son extends Father {
        void threeBhk() {
            System.out.println("son has 3bhk");
        }
    }
}
