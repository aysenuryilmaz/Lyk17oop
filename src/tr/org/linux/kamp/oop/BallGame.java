package tr.org.linux.kamp.oop;

public abstract class BallGame extends Game{

	abstract void moveTheBall();

	abstract void anOpponentScore(FootballClub fc);

	@Override
	public void hasOpponent() {
		// TODO Auto-generated method stub
		
	}
}
