package Encapsulation;

public class Practice002 {
    public static void main(String[] args) {
        Name person = new Name();
        person.setName("Ravi");
        String name = person.getName();
        System.out.println(name);
    }
}

class Name {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
