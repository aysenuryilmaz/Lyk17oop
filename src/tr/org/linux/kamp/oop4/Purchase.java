package tr.org.linux.kamp.oop4;

public class Purchase {
	
	protected String purchaseDate;
	protected String shippingDate;
	protected String deliveryLength;
	ShoppingCard purchasingCard;
	
	public Purchase() {//String purchaseDate, String shippingDate, String deliveryLength, ShoppingCard purchasingCard
//		super();
//		this.purchaseDate = purchaseDate;
//		this.shippingDate = shippingDate;
//		this.deliveryLength = deliveryLength;
//		this.purchasingCard = purchasingCard;
	}
	
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}
	public String getDeliveryLength() {
		return deliveryLength;
	}
	public void setDeliveryLength(String deliveryLength) {
		this.deliveryLength = deliveryLength;
	}
	public ShoppingCard getPurchasingCard() {
		return purchasingCard;
	}
	public void setPurchasingCard(ShoppingCard purchasingCard) {
		this.purchasingCard = purchasingCard;
	}
	
	
}
