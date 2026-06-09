public class CharacterGame {
  public int currentHealth;
  public String name;

  public CharacterGame(String name, int currentHealth) {
    this.name = name;
    this.currentHealth = currentHealth;
  }

  public CharacterGame() {
  }

  public void displayStatus() {
    System.out.println(name + " has " + currentHealth + " health points.");
  }

}