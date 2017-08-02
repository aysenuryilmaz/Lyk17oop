package tr.org.linux.kamp.oop3;

public abstract class Weapon extends Item{

	protected int damageAmount;
	
	public Weapon(int itemQuantity, int itemPrice, int itemWeight,int damageAmount) {//sadece çağırıldığında compile edildiği için damageamountu aşağıdada tanımlamış olsam hata vermez
		super(itemQuantity, itemPrice, itemWeight);
		this.damageAmount=damageAmount;
	}

	public int getDamageAmount() {
		return damageAmount;
	}

	public void setDamageAmount(int damageAmount) {
		this.damageAmount = damageAmount;
	}

}
