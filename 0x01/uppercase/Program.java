public class Program {
    public static void main(String[] args) {
        boolean characterInUppercase1 = Character.IsUpper('a');
        boolean characterInUppercase2 = Character.IsUpper('B');
        boolean characterInUppercase3 = Character.IsUpper('d');
        boolean characterInUppercase4 = Character.IsUpper('f');
        boolean characterInUppercase5 = Character.IsUpper('G');

        System.out.printf("%b\n", characterInUppercase1);
        System.out.printf("%b\n", characterInUppercase2);
        System.out.printf("%b\n", characterInUppercase3);
        System.out.printf("%b\n", characterInUppercase4);
        System.out.printf("%b\n", characterInUppercase5);
    }
}
