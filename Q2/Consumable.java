package Q2;

public class Consumable implements Collectible{

	protected int itemID;
	protected String itemName;
	
	
	Consumable() {
		itemID = 123456;
		itemName = "Unnamed";
	}
	
	Consumable(int itemID, String itemName) {
		this.itemID = itemID;
		this.itemName = itemName;
	}
	
	Consumable(Consumable c) {
		itemID = c.itemID;
		itemName = c.itemName;
	}
	
	
	
	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public void pickup() {
		// TODO Auto-generated method stub
		System.out.println("Picked Up a " + getItemName());
	}

	@Override
	public void drop() {
		// TODO Auto-generated method stub
		System.out.println("Dropped a " + getItemName());
	}

}
