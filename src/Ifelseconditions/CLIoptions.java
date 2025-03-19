package Ifelseconditions;

public class CLIoptions {
    public static void main(String[] args) {
        String Name = args[0];
        byte Age = (byte) Integer.parseInt(args[1]);
        long Salary = Integer.parseInt(args[2]);
        System.out.println(" Name is :" + Name + " \n age is:" + Age + " \n Salary is:" + Salary);
    }
}
