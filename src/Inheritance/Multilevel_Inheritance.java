package Inheritance;

public class Multilevel_Inheritance {
        public static void main(String[] args) {
            Multilevel_Inheritance outer = new Multilevel_Inheritance();
            C obj = outer.new C();  // Create an object of inner class C

            obj.displayA();  // From A
            obj.displayB();  // From B
            obj.displayC();  // From C
        }

        // Base class A
        class A {
            void displayA() {
                System.out.println("Print class A method");
            }
        }

        // Class B extends A
        class B extends A {
            void displayB() {
                System.out.println("Print class B method");
            }
        }

        // Class C extends B
        class C extends B {
            void displayC() {
                System.out.println("Print class C method");
            }
        }
    }
