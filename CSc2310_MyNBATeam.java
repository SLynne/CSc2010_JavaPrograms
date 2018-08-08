import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyNBATeam {
	
	private String sTeamName;
	private int nWin;
	private int nLoss;
	
	//private String[] playerArray; //need to know the size of this array before it can be used. ArrayList<String> used because array size was not provided
	
	public ArrayList<String> playerNames = new ArrayList<String>();

	public MyNBATeam(String TeamName){
		
		sTeamName = TeamName;
	}
	
	public void addAPlayer(MyNBATeam team, String yesNo, Scanner input){
		
		while (yesNo.equalsIgnoreCase("yes")){
    		
			System.out.print("What is the name to be added? ");
		    playerNames.add(input.next());
		 	    	
		    System.out.print("Add one more play to " + team +"? (yes/no): ");
			yesNo = input.next();
		 }
		
	}

	public void printResult(MyNBATeam team, int wins, int loss) {
		
		System.out.print(team.sTeamName + team.playerNames + " Win#: " + wins + ", Loss#: " + loss +"\n");
		
	}
	
	public void playGame(MyNBATeam a, MyNBATeam b){
		
		String teamA = a.sTeamName.toString();
		String teamB = b.sTeamName.toString();
		
		int teamBWin = 0;
		int teamBLoss = 0;
		
		System.out.println("\nGame on Now....\n");
		
		do{
			Random rand = new Random();
			
			int series = rand.nextInt(11)+4;
		
			teamBWin = 0; 
			teamBLoss = 0;
			
			for(int i = 0; i < series; i ++){
				double winner = rand.nextDouble()+0.0;
				if(winner <= 0.5){
				
					nWin++;
					teamBLoss++;
				}
				else if(winner > 0.5){
					
					teamBWin++; 
					nLoss++;
				}
			
			if(nWin >= 4){
				System.out.println(teamA +" ***WIN the series***");
				break;
			}
			else if(teamBWin >= 4){
				System.out.println(teamB + " ***WIN the series***");
				break;
			}
			}
		}while(nWin < 4 && teamBWin < 4);	
		printResult(a, nWin, nLoss);
		printResult(b, teamBWin, teamBLoss);
	}
	
	public void winSeries(String teamA, String teamB, int teamAWin, int teamBWin){
		
		if(teamAWin >= 4){
			System.out.println(teamA +" ***WIN the series***");
			
		}
		else if(teamBWin >= 4){
			System.out.println(teamB + " ***WIN the series***");
			
		}
	}	
	
	public String toString(){
		return ""+this.sTeamName;
	}
}





