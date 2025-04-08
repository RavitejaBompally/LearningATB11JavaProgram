package super_keyword;

public class super_002 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.display();
    }
}

class Animal {
    protected String color = "white";

    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    private String color = "black";

    Dog() {
        System.out.println("Dog constructor");
    }

    void display() {
        System.out.println("Dog color: " + color);       // Child class color
        System.out.println("Animal color: " + super.color); // Parent class color
    }
}