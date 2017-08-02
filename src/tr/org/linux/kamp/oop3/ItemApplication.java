package tr.org.linux.kamp.oop3;

public class ItemApplication {
	public static void main(String[] args) {
		Bow bow1=new Bow(1, 5, 30, 56, 43);
		Armor armor1=new Armor(2, 6, 32);
		Sward sward1=new Sward(3, 54, 76, 23);
		
		System.out.println("Defence Point: "+armor1.getDefencePoint());
		armor1.upgrade();
		System.out.println("After upgrading defence point: "+ armor1.getDefencePoint());
		
		
		System.out.println("Number of Arrow: "+ bow1.getNumofArrows());
		bow1.upgrade();
		System.out.println("Number of arraw after upgrade: "+bow1.getNumofArrows());
		
		bow1.useItem();//arrowları 1er 1er azalıyo
		bow1.useItem();
		System.out.println(bow1.getNumofArrows());
		
	}
}
