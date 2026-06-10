public class Program {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            rectangle.setWidth(10);
            rectangle.setHeight(2);

            if (GeometricShape.class.isAssignableFrom(Rectangle.class))
                System.out.println("Rectangle is a subclass of GeometricShape");
            else
                System.out.println("Rectangle is not a subclass of GeometricShape");

            System.out.printf("Width: %.2f\n", rectangle.getWidth());
            System.out.printf("Height: %.2f\n", rectangle.getHeight());

            try {
                System.out.printf("Area: %f\n", rectangle.area());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }