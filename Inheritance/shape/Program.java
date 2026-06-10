public class Program {
        public static void main(String[] args) {
            GeometricShape geometricShape = new GeometricShape();

            try {
                System.out.printf("Area: %d", geometricShape.area());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }