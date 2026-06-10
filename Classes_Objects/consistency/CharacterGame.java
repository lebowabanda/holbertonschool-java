public class CharacterGame {
    private int currentHealth;
    private String name;
    private String status;

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;

        if (this.currentHealth > 0) {
            status = "alive";
        } else {
            status = "dead";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void takeDamage(int damageAmount) {
        int newHealth = currentHealth - damageAmount;

        if (newHealth < 0) {
            newHealth = 0;
        }

        setCurrentHealth(newHealth);
    }

    public void receiveHealing(int healingAmount) {
        int newHealth = currentHealth + healingAmount;

        if (newHealth > 100) {
            newHealth = 100;
        }

        setCurrentHealth(newHealth);
    }
}