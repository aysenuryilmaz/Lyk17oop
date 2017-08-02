package tr.org.linux.kamp.oop4;

public class HardCopyBook extends Book {

	protected double weight;
	protected int shoppingCoast;
	
	public HardCopyBook(String name, String author, int price, int bookId, double weight, int shoppingCoast) {
		super(name, author, price, bookId);
		this.weight=weight;
		this.shoppingCoast=shoppingCoast;
	}

	public double getTotalCost() {
		return price+shoppingCoast;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getShoppingCoast() {
		return shoppingCoast;
	}

	public void setShoppingCoast(int shoppingCoast) {
		this.shoppingCoast = shoppingCoast;
	}
	
	
}
