package tr.org.linux.kamp.oop4;

public class EBook extends Book {
	protected double fileSize;
	protected String encodingFormat;
	protected int numberOfDevicesBookBeingUsed;
	
	public EBook(String name, String author, int price, int bookId, double fileSize, String encodingFormat, int numberOfDevicesBookBeingUsed) {
		super(name, author, price, bookId);
		this.fileSize=fileSize;
		this.encodingFormat=encodingFormat;
		this.numberOfDevicesBookBeingUsed=numberOfDevicesBookBeingUsed;
	}
	
	public void addDevice() {
		numberOfDevicesBookBeingUsed++;
	}
	
	public void RemoveDevice() {
		numberOfDevicesBookBeingUsed--;
	}

	public double getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public String getEncodingFormat() {
		return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	public int getNumberOfDevicesBookBeingUsed() {
		return numberOfDevicesBookBeingUsed;
	}

	public void setNumberOfDevicesBookBeingUsed(int numberOfDevicesBookBeingUsed) {
		this.numberOfDevicesBookBeingUsed = numberOfDevicesBookBeingUsed;
	}
	
	
	
}
