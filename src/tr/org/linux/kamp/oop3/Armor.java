package tr.org.linux.kamp.oop3;

import java.sql.DatabaseMetaData;

//zırh bir silah değildir bu yüzden weapon değil item
public class Armor extends Item implements Upgradable{
	
	protected int defencePoint;
	protected boolean isWorn;
	
	public Armor(int itemQuantity, int itemPrice, int itemWeight) {
		super(itemQuantity, itemPrice, itemWeight);
		isWorn=true;
	}

	@Override
	public void upgrade() {
		defencePoint+=100;
	}

	public void getHit(int damageAmount) {
		if(isWorn==true) {
			if(defencePoint>damageAmount) {
				defencePoint-=damageAmount;
			}else {
				defencePoint=0;
				isWorn=false;
			}
		}
	}

	public int getDefencePoint() {
		return defencePoint;
	}

	public void setDefencePoint(int defencePoint) {
		this.defencePoint = defencePoint;
	}

	public boolean isWorn() {
		return isWorn;
	}

	public void setWorn(boolean isWorn) {
		this.isWorn = isWorn;
	}
	
}
