package tr.org.linux.kamp.oop4;

public class Book {
	protected String name;
	protected String author;
	protected double price;
	protected int bookId;
	
	public Book(String name, String author, double price, int bookId) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void applydiscount(int discountRate) {
		price=price-(price*discountRate/100);
	}
	
	
}
