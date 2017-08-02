package tr.org.linux.kamp.oop;

import java.awt.Color;

public class FootballApplication {
	public static void main(String[] args) {
		
		FootballClub fc1=new FootballClub("Gençlerbirliği", "Kara Kızıl", 1,"19 mayıs Stadyumu",200000);
		FootballClub fc2=new FootballClub("ankaragücü", "Sarı Lacivert", 1,"19 MAyıs Stadyumu",200000);
		
		FootballRules match = new FootballRules(fc1, fc2);
		System.out.println(match.homeTeam.clubName);
		System.out.println(match.guestTeam.clubName);
		
		match.anOpponentScore(fc1);
		match.anOpponentScore(fc2);
		match.anOpponentScore(fc1);
		
		System.out.println(fc1.getClubName()+ " "+ match.scoresOfHomeTeam +" "+ fc2.getClubName() + " " + match.scoresOfGuestTeam);

	}
}
