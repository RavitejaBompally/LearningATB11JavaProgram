package Task_19_April_OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan50k();
        c.loan25k();
        Father f2 = new Child();
    }
    }
    abstract class Father {
        abstract void loan50k();

        void loan25k() {
            System.out.println("Given 25k");
        }
    }


        class Child extends Father {
            void loan50k () {
                System.out.println("Child will pay the loan");
            }
        }
