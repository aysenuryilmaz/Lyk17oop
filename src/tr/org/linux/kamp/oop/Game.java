package tr.org.linux.kamp.oop;
//abstract yazdığımda hata vermiyor çünkü abstract yazdığımda implement ediyosam interfacein metodlarını implement etmek zorunda değilim
public abstract class Game implements Playable{
	abstract void hasWinner();
}
