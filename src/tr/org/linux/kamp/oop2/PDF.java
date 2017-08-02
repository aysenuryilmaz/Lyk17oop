package tr.org.linux.kamp.oop2;

public class PDF extends Document{

	private int pageNUmber;
	
	public PDF(String content, String author, int pageNUmber) {
		super(content, author);
		this.pageNUmber=pageNUmber;
	}

	//hepsinin modeline göre gele dosyayı çıktı olarak vericek
	@Override
	void PrintDocument() {
		System.out.println("pdf dokümano yazdırılıyor.");		
	}

	public int getPageNUmber() {
		return pageNUmber;
	}	
}
