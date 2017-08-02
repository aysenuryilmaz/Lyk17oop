package tr.org.linux.kamp.oop2;

public class LibreOfficeCalc extends Document{

	public LibreOfficeCalc(String content, String author) {
		super(content, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	void PrintDocument() {
		System.out.println("LibreOfficeCalc dokümanı yazdırılıyor");
	}

}
