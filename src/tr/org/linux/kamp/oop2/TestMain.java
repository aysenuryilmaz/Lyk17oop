package tr.org.linux.kamp.oop2;

import java.util.ArrayList;
import java.util.Random;

public class TestMain {
	public static void main(String[] args) {
		//random arraylist 3-4 nesne yarat 
		//absract classlarda nesne oluşturamıyorum


		ArrayList<Document>printlist=new ArrayList<>();
		printlist.add(new PDF("AYşenur", "Bu bir pdf dokümanı",15));
		printlist.add(new Picture("Java sınıf", "Bu bir resim dokümanıdır"));
		printlist.add(new LibreOfficeCalc("Yaz Kampı","bu bir libreofficecalc dokümanıdır"));
		
		Random random =new Random(3);
		int index= random.nextInt(3);
		printlist.get(index).PrintDocument() ;
		System.out.println("Yazar: " +printlist.get(index).getAuthor()+" İçerik "+printlist.get(index).getContent());
		
	}
}
