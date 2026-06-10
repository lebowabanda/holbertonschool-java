import java.lang.reflect.Field;
    import java.lang.reflect.Modifier;

    public class Program {
        public static void main(String[] args) {
            try {
                if (Modifier.isAbstract(GeometricShape.class.getDeclaredMethod("area").getModifiers()))
                    System.out.println("area() is an abstract function");
                else
                    System.out.println("area() is not an abstract function");
            } catch (Exception ex) {
                System.out.println("area() is not an function");
            }

            if (Modifier.isAbstract(GeometricShape.class.getModifiers()))
                System.out.println("GeometricShape is an abstract class");
            else
                System.out.println("GeometricShape is not an abstract class");
        }
    }