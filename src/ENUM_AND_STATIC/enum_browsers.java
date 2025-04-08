package ENUM_AND_STATIC;

public class enum_browsers {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.days[4]);


        enum Browser {
            GOOGLE, EDGE, FIREFOX, SAFARI, OPERA
        }
        System.out.println(Browser.GOOGLE);
    }
}


// Using string

class A{
    String[]days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
}
