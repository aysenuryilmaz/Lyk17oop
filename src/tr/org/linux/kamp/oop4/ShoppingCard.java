package tr.org.linux.kamp.oop4;

import java.util.ArrayList;

public class ShoppingCard {
	ArrayList<Book>contents ;
	
	public int numOfEntriesInTheCard() {
		return contents.size();
	}
	
	public void addBook(Book book) {
		contents.add(book);
	}
	
	
}
