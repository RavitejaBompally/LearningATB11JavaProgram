package ENUM_AND_STATIC;

public class static002 {
    public static void main(String[] args) {
        B.commonToAll();
        System.out.println(B.b);

        B b_ref = new B();
        b_ref.display();
        System.out.println(b_ref.a);

    }
}











    class B {
        static {
            System.out.println("SIB, called once, class is loaded");
        }
        int a = 10;
        static int b = 10;

        void display() {
            System.out.println(b);
            System.out.println("Non static");
        }
        static void commonToAll() {
            System.out.println("Static");
        }

    }
