public class Program {
        public static void main(String[] args) {
            CharacterGame character1 = new CharacterGame(50, "Sonic");

            character1.setName("");

            System.out.printf("%s, %d, %s\n", character1.getName(), character1.getCurrentHealth()
                , character1.getStatus());

            character1.receiveHealing(91);
            character1.setName(null);

            System.out.printf("%s, %d, %s\n", character1.getName(), character1.getCurrentHealth()
                , character1.getStatus());

            character1.takeDamage(25);

            System.out.printf("%s, %d, %s\n", character1.getName(), character1.getCurrentHealth()
                , character1.getStatus());

            character1.takeDamage(80);

            System.out.printf("%s, %d, %s\n", character1.getName(), character1.getCurrentHealth()
                , character1.getStatus());
        }
    }