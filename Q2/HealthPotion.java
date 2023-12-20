package Q2;

public class HealthPotion extends Consumable {

    private int healthRestored;

    public HealthPotion() {
    	 super();
        healthRestored = 10;
    }

    public HealthPotion(int itemID, String itemName, int healthRestored) {
    	super(itemID, itemName);
        this.healthRestored = healthRestored;
    }

    public HealthPotion(HealthPotion c) {
        super(c);
        healthRestored = c.healthRestored;
    }

    public int getHealthRestored() {
        return healthRestored;
    }

    public void setHealthRestored(int healthRestored) {
        this.healthRestored = healthRestored;
    }

	
    
}
