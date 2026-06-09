public class EvenNum {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
           if (i % 2 != 0)
        continue;
      System.out.print(i);
      if (i < 98) {
        System.out.print(", ");
      }
    }
    System.out.println();
    }
}