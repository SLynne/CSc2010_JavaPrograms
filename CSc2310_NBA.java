//Stephanie Wyckoff
//7/10/2016
//NBA
//Client program for NBATeam Class. User creates/names teams, adds players to teams and then plays a series of games.  

import java.util.Scanner;

public class NBA {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner (System.in);
		String ifAddPlayer;
		String playerName;
		
		//construct Team Heat
		System.out.println("Create the NBA team of Heat ...... ");
		NBATeam heat= new NBATeam("Heat");
		
		System.out.print("Add a player to Heat? (yes/no): ");
		ifAddPlayer= input.next();
		
		while (ifAddPlayer.equalsIgnoreCase("yes")){
	    		System.out.print("What is the name to be added? ");
		    	playerName=input.next();
		    	heat.addAPlayer(playerName);
			
	    		System.out.print("Add one more play to Heat? (yes/no): ");
			ifAddPlayer= input.next();
		 }

		//construct Team spurs
		System.out.println("\nCreate the NBA team of Spurs ...... ");
		NBATeam spurs= new NBATeam("Spurs");
		System.out.print("Add a player to Spurs? (yes/no): ");
		ifAddPlayer= input.next();
		
		while (ifAddPlayer.equalsIgnoreCase("yes")){
	    		System.out.print("What is the name to be added? ");
		    	playerName=input.next();
		    	spurs.addAPlayer(playerName);
			
	    		System.out.print("Add one more play to Spurs? (yes/no): ");
			ifAddPlayer= input.next();
		 }
		
		heat.playGame(heat, spurs);

		
		System.out.println(heat.getTeamName() + heat.getPlayerList() + " Win# " + heat.getWins() + " Lose# " + heat.getLoss());
		System.out.println(spurs.getTeamName() + spurs.getPlayerList() + " Win# " + spurs.getWins() + " Lose# " + spurs.getLoss());

	}
}

	
  

