package tr.org.linux.kamp.oop4;

import java.util.ArrayList;

public class Customer {
	
	protected String userName;
	protected String userSurname;
	ArrayList<Purchase> purchaseHistory;
	protected int purchaseCount;
	
	//neden boş constructor
	public Customer() {
		
	}


	
	public void placePurchase(Purchase purchase) {
		purchaseHistory.add(purchase);
		purchaseCount++;
	}
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}



	public ArrayList<Purchase> getPurchaseHistory() {
		return purchaseHistory;
	}



	public void setPurchaseHistory(ArrayList<Purchase> purchaseHistory) {
		this.purchaseHistory = purchaseHistory;
	}
	
}
