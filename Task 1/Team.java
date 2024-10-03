import java.util.ArrayList;

public class Team{
	
	private String teamName;
    private int teamRank;
   	private ArrayList<String> playersNames;

public Team (String teamName){
	this.teamName = teamName;
	this.playersNames = new ArrayList<>();

	}

public void addPlayer(String playerName){
this.playersNames.add(playerName);
					
				}

		public void setRank(int teamRank){
			this.teamRank = teamRank;

		}

		
			public String toString() {
        String result = "Hold: " + teamName + " Rank: " + teamRank + "\nPlayers:\n";

        
        for (String player : playersNames) {
            result += "- " + player + "\n";
        }
        return result;
    }
}








