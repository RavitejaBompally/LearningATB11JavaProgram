package Task_19_April_OOPS;

        class Vehicle {
            void start () {
                Vehicle v1 = new Vehicle();
                System.out.println("Vehicle starts");
            }
        }
        class Car extends Vehicle {
            void drive () {
                Car c1 = new Car();
                System.out.println("Car drives");

            }
        }

        public class Inheritance_program {
        public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.drive();
    }
    }
