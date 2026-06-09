public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i += 2) {
            if (i < 98) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();
    }
}