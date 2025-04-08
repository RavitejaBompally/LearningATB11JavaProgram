package ENUM_AND_STATIC;

public class static001 {
    public static void main(String[] args) {
        R p1 = new R();
        R p2 = new R();
        R p3 = new R();
    }
}


        class R {
            static {
                System.out.println("SIB");
            }
            {
                System.out.println("IIB");
            }
            R() {
                System.out.println("DC");
            }
        }
