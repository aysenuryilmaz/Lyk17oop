package tr.org.linux.kamp.oop3;

public class Bow extends Weapon implements Upgradable{

	private int  numofArrows;
	
	public Bow(int itemQuantity, int itemPrice, int itemWeight, int damageAmount,int numOfArrows) {
		super(itemQuantity, itemPrice, itemWeight, damageAmount);
		this.numofArrows=numOfArrows;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void upgrade() {
		this.numofArrows+=10;
	}
	
	public boolean useItem() {
		if(itemQuantity>0 &&numofArrows>0) {
			numofArrows-=1;
			return true;
		}else {
			return false;
		}
	}

	public int getNumofArrows() {
		return numofArrows;
	}

	

	
}
