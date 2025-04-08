package super_keyword;

public class super_001 {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
    class Parent {
        Parent() {
            System.out.println("Parent constructor is called");
        }
    }
    class Child extends Parent {
        Child () {
            System.out.println("Child constructor is called");
        }
    }

