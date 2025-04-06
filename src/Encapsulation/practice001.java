package Encapsulation;

public class practice001 {
    public static void main(String[] args) {
        ICICI Amit = new ICICI("Amit", 954);
        long number = Amit.getNumber();
        System.out.println(number);
    }
}

class ICICI {
    private String name;
    private long number;

    public ICICI(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}
