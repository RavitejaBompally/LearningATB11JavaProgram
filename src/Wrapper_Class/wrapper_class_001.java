package Wrapper_Class;

public class wrapper_class_001 {
    public static void main(String[] args) {
        int num = 10;
        Integer obj = num;  //Autoboxing converting int to Integer

        //Unboxing: converting Integer to int

        int newNum = obj;

        System.out.println("Object: " + obj);
        System.out.println("Primitive: "+ newNum);

    }
}
