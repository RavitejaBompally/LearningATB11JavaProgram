package Polymorphism;

public class overiding_animal {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }

}
        class Animal {
            void sound() {
                System.out.println("Animal can sound");
            }
        }
        class Dog extends Animal {
            void sound() {
                System.out.println("Bark");
            }
        }


