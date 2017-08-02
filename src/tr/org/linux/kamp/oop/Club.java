package tr.org.linux.kamp.oop;

public abstract class Club {
	protected String clubName;
	protected String color;
	protected int clupValue;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Club(String clubName, String color, int clupValue) {
		this.clubName = clubName;
		this.color = color;
		this.clupValue = clupValue;
	}
	
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public int getClupValue() {
		return clupValue;
	}
	public void setClupValue(int clupValue) {
		this.clupValue = clupValue;
	}
	
	
	
}
