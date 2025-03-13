public class lab003 {
        public static double computeFunction(int x, int y, int z) {
            return Math.cbrt((Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z)));
        }

        public static void main(String[] args) {
            int x = 10, y = 10, z = 10;
            double result = computeFunction(x, y, z);
            System.out.println("Result: " + result);
        }
    }
