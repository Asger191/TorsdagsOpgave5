public class Main{
	
	public static void main(String[] args){

Team team1 = new Team ("Bears");
Team team2 = new Team ("Bees");
Team team3 = new Team ("Bears");
Team team4 = new Team ("Rhinos");
Team team5 = new Team ("Hornets");
Team team6 = new Team ("Elephants");



Team[] teams = {team1, team2, team3, team4, team5, team6};
		for(int i = 0; i<teams.length; i++){
			teams[i].setRank(i+1);
		}

		team1.addPlayer("Asger");
		team1.addPlayer("Daniel");
		team1.addPlayer("Pac");
		team1.addPlayer("Biggie");
		team1.addPlayer("Ice");
		team1.addPlayer("Spice");


		for(Team team : teams){
		System.out.println(team.toString());
		}
		
	}
}

