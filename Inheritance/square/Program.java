import java.lang.reflect.Field;
    import java.lang.reflect.Modifier;

    public class Program {
        public static void main(String[] args) {
            Square square = new Square();

            square.setSide(10);

            if (Rectangle.class.isAssignableFrom(Square.class))
                System.out.println("Square is a subclass of Rectangle");
            else
                System.out.println("Square is not a subclass of Rectangle");

            try {
                Field heightField = Rectangle.class.getDeclaredField("height");
                int changeHeight = heightField.getModifiers();
                System.out.printf("Field height is %s\n", Modifier.toString(changeHeight));

                Field widthField = Rectangle.class.getDeclaredField("width");
                int changeWidth = widthField.getModifiers();
                System.out.printf("Field width is %s\n", Modifier.toString(changeWidth));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            System.out.printf("Side: %.2f\n", square.getSide());
            System.out.printf("Area: %.2f\n", square.area());
            System.out.printf(square.toString() + "\n");
        }
    }