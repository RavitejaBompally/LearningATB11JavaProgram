package Constructors;

public class defaultconstructors {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        Baby b2;





    }



}


class Baby {
    // Attribute | Instance Variable |  Member variables, data members


    String name;


    // Behaviour
    void cry() {
        System.out.println("Cry!!");
    }

    void sleep() {
        System.out.println("Cry!!");
    }

    void eat() {
        System.out.println("Eat!!");
    }

    // Default Constructor!
    Baby() {
        System.out.println("I am called, Default Constructor!");
    }
}