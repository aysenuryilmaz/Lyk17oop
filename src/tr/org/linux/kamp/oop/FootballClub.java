package tr.org.linux.kamp.oop;

public class FootballClub extends Club{

	protected String stadiumName;
	protected int stadiumCapacity;
	
	public FootballClub(String clubName, String color, int clupValue,String stadiumName,int stadiumCapacity) {
		super(clubName, color, clupValue);
		this.stadiumName = stadiumName;
		this.stadiumCapacity = stadiumCapacity;
		// TODO Auto-generated constructor stub
	}

	

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public int getStadiumCapacity() {
		return stadiumCapacity;
	}

	public void setStadiumCapacity(int stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}
	
	
	

}
