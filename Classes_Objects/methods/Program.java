public class Program {
        public static void main(String[] args) {
            CharacterGame character1 = new CharacterGame();

            character1.setName("Sonic");
            character1.setCurrentHealth(10);

            System.out.printf("%d\n", character1.getCurrentHealth());

            character1.receiveHealing(91);

            System.out.printf("%d\n", character1.getCurrentHealth());

            character1.takeDamage(25);

            System.out.printf("%d\n", character1.getCurrentHealth());

            character1.takeDamage(80);

            System.out.printf("%d\n", character1.getCurrentHealth());
        }
    }