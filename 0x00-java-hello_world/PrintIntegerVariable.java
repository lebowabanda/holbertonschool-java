import java.util.Scanner;


public class PrintIntegerVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        System.out.printf ("Pennsylvania Avenue, %d\n", number);
        scanner.close();
    }
}