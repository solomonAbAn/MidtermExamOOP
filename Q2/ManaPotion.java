package Q2;

public class ManaPotion extends Consumable {
	private int manaRestored;
	
	
	public ManaPotion() {
		super();
		manaRestored = 10;
	}
	
	public ManaPotion(int itemID, String itemName, int manaRestored) {
		super(itemID, itemName);
		this.manaRestored = manaRestored;
	}
	
	public ManaPotion(ManaPotion c) {
		super();
		manaRestored = c.manaRestored;
	}

	public double getManaRestored() {
		return manaRestored;
	}

	public void setManaRestored(int manaRestored) {
		this.manaRestored = manaRestored;
	}

	
}
