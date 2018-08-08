import java.util.Scanner;

public class MyNBA {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String ifAddPlayer;
		String playerName;
			
		//construct Team Heat
		System.out.println("Create the NBA team of heat ...... ");
		MyNBATeam heat = new MyNBATeam("Heat");
		
		System.out.print("Add a player to heat? (yes/no): ");
		ifAddPlayer = input.next();
			
		heat.addAPlayer(heat, ifAddPlayer, input);
	

		//construct Team spurs
		System.out.println("\nCreate the NBA team of Spurs ...... ");
		MyNBATeam spurs = new MyNBATeam("Spurs");
		
		
		System.out.print("Add a player to Spurs? (yes/no): ");
		ifAddPlayer= input.next();
		
		spurs.addAPlayer(spurs, ifAddPlayer, input);
		
				
		heat.playGame(heat, spurs);

	}
}

