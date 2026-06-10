public class Program {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            rectangle.setWidth(7);
            rectangle.setHeight(4);

            System.out.printf("Area: %.2f\n", rectangle.area());
            System.out.println(rectangle.toString());
        }
    }