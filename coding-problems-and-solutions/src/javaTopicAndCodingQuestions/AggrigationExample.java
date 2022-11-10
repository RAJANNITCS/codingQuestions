package javaTopicAndCodingQuestions;
import java.util.ArrayList;

class Player {
	public String nameOfPlayer;
	public int ageOfPlayer;
	
	public Player(String nameString, int ageOfPlayer) {
		this.nameOfPlayer = nameString;
		this.ageOfPlayer = ageOfPlayer;
	}
	
	public void display() {
		System.out.println(this.nameOfPlayer+" "+this.ageOfPlayer);
	}
}

class Team {
	public String nameOfTeam;
	public int numberOfMember;
	ArrayList<Player> players = new ArrayList<Player>();
	
	public Team (String nameOfTeam, int numberOfMember) {
		this.nameOfTeam = nameOfTeam;
		this.numberOfMember = numberOfMember;
	}
	
	public void addPlayer(Player player) {
		this.players.add(player);
	}
	
	public void display() {
		System.out.println(this.nameOfTeam+" "+this.numberOfMember);
		for (Player player: this.players) {
			player.display();
		}
		
	}
}
public class AggrigationExample {
	public static void main(String[] args) {
		Team india = new Team("INDIA", 11);
		india.addPlayer(new Player("rohan", 22));
		india.addPlayer(new Player("manish", 23));
		
		india.display();
	}
}
