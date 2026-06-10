public class CharacterGame {
    private int currentHealth;
    private String name;

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damageAmount) {
        currentHealth -= damageAmount;

        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }

    public void receiveHealing(int healingAmount) {
        currentHealth += healingAmount;

        if (currentHealth > 100) {
            currentHealth = 100;
        }
    }
}