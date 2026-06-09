 public class Program {
        public static void main(String[] args) {
            try {
                double side1 = -5;
                double result = Square.area(side1);
                System.out.println(result);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            try {
                double side2 = 3;
                double result = Square.area(side2);
                System.out.println(result);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }