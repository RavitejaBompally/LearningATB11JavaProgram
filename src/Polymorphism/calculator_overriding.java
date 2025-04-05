package Polymorphism;

public class calculator_overriding {

    int attribute;

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        calculator_overriding c1 = new calculator_overriding();
        c1.add(3,4);
        c1.add(3.414,4.56);
    }
}
