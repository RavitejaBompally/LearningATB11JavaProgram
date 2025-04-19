package Task_19_April_OOPS;

    class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

    public static void main(String[] args) {
       Employee emp = new Employee();

       emp.setName("Ravi Teja");
       emp.setSalary(50000);

        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
    }

