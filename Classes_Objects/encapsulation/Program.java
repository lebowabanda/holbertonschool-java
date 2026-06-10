public class Program {
        public static void main(String[] args) {
            CharacterGame character1 = new CharacterGame();

            character1.setName("Sonic");
            character1.setCurrentHealth(10);

            System.out.printf("Name: %s - Health: %d\n", character1.getName(), character1.getCurrentHealth());
        }
    }