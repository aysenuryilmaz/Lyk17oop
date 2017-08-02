package tr.org.linux.kamp.oop4;

import java.util.ArrayList;

public class ShoppingCardTestMain {
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setUserName("Joe");
		customer.setUserSurname("Strummer");
		
		HardCopyBook hardCopyBook=new HardCopyBook("Sırça Fanus","Slyvia Plath", 30, 2, 3, 45);
		HardCopyBook hardCopyBook1=new HardCopyBook("Sevdadır","Arkadaş Zekai Özger", 12, 3, 6, 45);
		
		
		EBook ebook=new EBook("a", "ayse", 4, 2, 450, "PDF", 14);
		EBook ebook1=new EBook("tarihçe", "ayse", 4, 2, 450, "PDF", 14);
	

		Purchase purchase =new Purchase();
		ArrayList<Purchase>purchaseHistory=new ArrayList<>();
		purchaseHistory.add(purchase);
		
		ShoppingCard shoppingCard=new ShoppingCard();
		shoppingCard.addBook(hardCopyBook1);
		shoppingCard.addBook(hardCopyBook);
		
	}
}
//java runtime  environment oyunu çalıştırmak için gerekli
//jre jvm'i' içeriyor 
//jvm java sanal makinesi 
//jvm deki belleğin adı java heap
//bir java clasını     