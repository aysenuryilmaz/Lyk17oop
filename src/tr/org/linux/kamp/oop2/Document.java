package tr.org.linux.kamp.oop2;

import java.time.LocalDate;

public abstract class Document {
	private String content;
	private LocalDate createdTime;
	private String author;
	
	public Document(String content, String author) {
		this.content = content;
		this.author = author;
		this.createdTime=(LocalDate.now());
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getCreatedTime() {
		return createdTime;
	}

	 abstract void PrintDocument();

	public PDF getPageNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
