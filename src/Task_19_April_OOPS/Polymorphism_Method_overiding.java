package Task_19_April_OOPS;

public class Polymorphism_Method_overiding {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }
}


        class Animal {
        void sound () {
                System.out.println("Animal makes sound");
            }
    }
    class Dog extends Animal {
        void sound () {
            System.out.println("Bark");
    }
    }