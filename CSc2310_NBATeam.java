import java.util.ArrayList;
import java.util.Random;

//Stephanie Wyckoff
//7/10/2016
//NBATeam
//Set up for NBA teams, player names and game play mode. Stores team information and game win/lose record and prints for the user.

public class NBATeam {
	
	private String sTeamName;
	private int nWin;
	private int nLoss;
	private String[] playerArray = new String[50];
	private ArrayList<String> playerList = new ArrayList<String>();
		
	public NBATeam(String TeamName){
		sTeamName = TeamName;
		setUpList();
	}
	
	private void setUpList(){ //fills in player array when new NBATeam is created; ensures zero null elements
		for(int i = 0; i < playerArray.length; i++){
			playerArray[i] = "-";
		}
	}
	
	public void addAPlayer(String playerName){ //adds player names from user input to array
		
		for(int i = 0; i < playerArray.length; i++){
			if(playerArray[i] == "-"){
				playerArray[i] = playerName;
				if(playerArray[i+1] == "-"){
					break;
				}
			}
		}
	}
	
	public ArrayList<String> getPlayerList(){ //allows only the elements with user input to print out
		for(int i = 0; i < playerArray.length; i++){
			if(playerArray[i] != "-"){
				playerList.add(playerArray[i]);
			}
		}
		return playerList;
	}
	
	public String getTeamName(){
		return sTeamName;
	}
	
	public int getWins(){
		return nWin;
	}
	
	public int getLoss(){
		return nLoss;
	}
	
	public void playGame(NBATeam a, NBATeam b){
		
		String teamA = a.sTeamName.toString();
		String teamB = b.sTeamName.toString();	
		
		System.out.println("\nGame on Now....\n");
		
		do{
			Random rand = new Random();
			
			int series = rand.nextInt(11)+4;
		
			a.nWin = 0; 
			b.nLoss = 0;
			
			for(int i = 0; i < series; i ++){
				double winner = rand.nextDouble()+0.0;
				if(winner <= 0.5){
				
					a.nWin++;
					b.nLoss++;
				}
				else if(winner > 0.5){
					
					b.nWin++; 
					a.nLoss++;
				}
			
			if(a.nWin >= 4){
				System.out.println(teamA +" ***WIN the series***");
				break;
			}
			else if(b.nWin >= 4){
				System.out.println(teamB + " ***WIN the series***");
				break;
			}
			}
		}while(a.nWin < 4 && b.nWin < 4);	
		
	}
	
	public String toString(){
		return ""+this.sTeamName;
	}
}
