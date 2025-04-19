package Task_19_April_OOPS;

   class Calculator {

    int attribute;

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(3,4);
        c1.add(3.414,4.56);
        System.out.println(c1.add(3,4));
        System.out.println(c1.add(3.414,4.56));
    }
}