package tr.org.linux.kamp.oop2;
//metoda tekrarı yapmamak için override
public class Picture extends Document{

	public Picture(String content, String author) {
		super(content, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	void PrintDocument() {
			System.out.println("Resim dökümanı yazıdırılıyor");
	}

	

}
