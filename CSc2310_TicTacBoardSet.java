//Stephanie Wyckoff
//6/26/2016
//TicTacBoardSet
//This is an instance variable Class for use with the TicTac program.  This program sets the parameters for the TicTac program including the 
//basic board setup, the player indicators, and win conditions. 

public class TicTacBoardSet {

	private char[][] boardArr; //basic board set up array, dont want it changed, make private
	char player; //private? dont want it to be changed by user... look up getter/setter
	
	public TicTacBoardSet(){ //general parameters for basic game board of 3x3, sets player 1
		
		boardArr = new char[3][3];
		player = 'X';
		createBoard();
	
	}

	public void createBoard(){ //builds the tictactoe board, double for, sets each char to '-' as place holder so not null
		
		for(int i = 0; i < boardArr.length; i++){
		
			for(int j = 0; j < boardArr[i].length; j ++){
			
				boardArr[i][j] = '-';
			
			}
		}
	}
	
	public void printBoard(){ //prints out board built in createBoard
		
		System.out.println("-------------");
		
		for(int i = 0; i < boardArr.length; i++){
			
			System.out.print("| ");
			
			for(int j = 0; j < boardArr[i].length; j++){
			
				System.out.print(boardArr[i][j] + " | ");
		
			}
			
			System.out.println();
			System.out.println("-------------");
		}
	}
	
	public boolean FullOrDraw(){ //at start, board is filled with '-', board is checked after each player input to see if board has any
		
		boolean full = true;		//remaining '-' characters, if yes, board is not full, if no, board is full. If game reaches this point,
		
		for(int i = 0; i < boardArr.length; i++){  //then the game is a Draw.
		
			for(int j = 0; j < boardArr[i].length; j ++){
			
				if(boardArr[i][j] == '-'){
				
					full = false;
				}
			}
		}return full;
	}
	
	public boolean winning(){ //checks all winning conditions, if any are true, there is a winner
		
		return(rowWins() || colWins() || diagWins());
			
	}
	
	private boolean rowWins(){
		
		for(int i = 0; i < boardArr.length; i++){ //checks all rows (0-2) and checks each column number for each row[i], if matching, Winner!
		
			if(boardCheck(boardArr[i][0], boardArr[i][1], boardArr[i][2]) == true){ //calls boardCheck and sends boardArr[][] info as parameter.
			
				return  true;
			}
		}return false;
	}
	
	private boolean colWins(){
	
		for(int i = 0; i < boardArr.length; i++){ //checks all columns (0-2) and checks each row number for each column[i], if matching, Winner!
		
			if(boardCheck(boardArr[0][i], boardArr[1][i], boardArr[2][i]) == true){ //calls boardCheck and sends boardArr[][] info as parameter.
			
				return  true;
			}
		}return false;
	}
	
	private boolean diagWins(){ //checks both diagonal conditions for win.  Calls boardCheck and sends boardArr[][] info as parameter.
		
		return ((boardCheck(boardArr[0][0], boardArr[1][1], boardArr[2][2]) == true) || (boardCheck(boardArr[0][2], boardArr[1][1], boardArr[2][0]) == true));
	}
	
	private boolean boardCheck(char a, char b, char c){ //called by winning conditions, checks input parameters to see if equal, if equal, Winner!
	
		return ((a != '-') && (b == a) && (c == b));
	}
	
	public void player1to2(){ //Swaps player 1(X) and player 2(O) 
		
		if(player == 'X'){
		
			player = 'O';
		}
		else{
		
			player = 'X';
		}
	}
	
	public boolean setXO(int row, int col){ //stores input from user in 2d array

		if((row >= 0) && (row < boardArr.length)){ //allows user to input numbers 1-3 for row and column which makes this program user friendly
			 										//for persons unused to programming standards of starting at 0.  It does make it a challenge
			if((col >= 0) && (col < boardArr.length)){ //for programmers!
			
				if(boardArr[row][col] == '-'){
				
					boardArr[row][col] = player;
					
					return true;
				}
			}	
		}return false;
			
	}

	
}
