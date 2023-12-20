package Q2;

public class Gold implements Collectible{
	private int value;
	
	
	public Gold() {
		value = 500;
	}
	
	public Gold(int value) {
		this.value = value;
	}
	
	public Gold(Gold c) {
		value = c.value;
	}
	
	

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public void pickup() {
		// TODO Auto-generated method stub
		System.out.println("Picked Up " + getValue() + " gold.");
	}

	@Override
	public void drop() {
		// TODO Auto-generated method stub
		System.out.println("Dropped " + getValue() + " gold.");
	}
}
