package tr.org.linux.kamp.oop;

public class FootballRules extends Football{
	protected FootballClub homeTeam;
	protected FootballClub guestTeam;
	
	protected int scoresOfHomeTeam;
	protected int scoresOfGuestTeam;

	
	
	public FootballRules(FootballClub homeTeam, FootballClub guestTeam) {
		super();
		this.homeTeam = homeTeam;
		this.guestTeam = guestTeam;
	}
	
	
	@Override
	protected void hasHoliganism() {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void playableWith2Players() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void moveTheBall() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void anOpponentScore(FootballClub club) {
		if(club.equals(homeTeam)) {
			scoresOfHomeTeam=scoresOfHomeTeam+1;
		}
		else if(club.equals(guestTeam)) {
			scoresOfGuestTeam=scoresOfGuestTeam+1;
		}
		
	}
	@Override
	void hasWinner() {
		if(scoresOfHomeTeam>scoresOfGuestTeam) {
			System.out.println(homeTeam.getClubName() + " Kazandı");
		}
		else if(scoresOfGuestTeam>scoresOfHomeTeam) {
			System.out.println(guestTeam.getClubName()+ " Kazandı");
		}else {
			System.out.println(" Berabere");
		}
	}
	
}
