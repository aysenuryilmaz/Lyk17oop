package tr.org.linux.kamp.oop3;
//her yaratılan quantity için bir arttır
public abstract class Item {
	protected int itemQuantity;//subclasslardan erişebilmek için protected
	protected int itemPrice; 
	protected int	itemWeight;
	protected boolean useitem() {
		//metod olarakta oluşturulabilir
		if(itemQuantity>0) {
			return true;
		}else {
			return false;
		}
	}
	
	public Item(int itemQuantity, int itemPrice, int itemWeight) {
		super();
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.itemWeight = itemWeight;
	}
	
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = 5+itemQuantity;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemWeight() {
		return itemWeight;
	}
	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}
}
