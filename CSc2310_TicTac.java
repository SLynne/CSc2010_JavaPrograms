//Stephanie Wyckoff
//6/27/2016
//TicTac
//This is a tic tac toe program.  The program generates a 3x3 char array and populates with '-' as a placeholder.
//The program switches from player 1(X) to player 2(O) until either one wins or the board is full. If the board is 
//full and no winner has been declared, the program declares it a draw.  Game is set up to take inputs of 0,1 &2 
//for rows and columns but could easily be modified to make it user friendly for person unfamiliar with the
//programming standard of beginning at zero. 


import java.util.Scanner;

public class TicTac {
	
//prints out board with grid
	public static void printBoard(char[][] board){ 
		
		System.out.println("-------------");
		
		for(int i = 0; i < 3; i++){
			
			System.out.print("| ");
			
			for(int j = 0; j < 3; j++){
			
				System.out.print(board[i][j] + " | ");
			}
			
			System.out.println();
			System.out.println("-------------");
		}
	}
	
	//Sets user input of row/col to X/O as appropriate
	public static char[][] setXO(char[][] board, int row, int col, char player){

		if((row >= 0) && (row < 3)){ //allows user to input numbers 1-3 for row and column which makes this program user friendly
			 										//for persons unused to programming standards of starting at 0.  It does make it a challenge
			if((col >= 0) && (col < 3)){ //for programmers!
			
				if(board[row][col] == '-'){
				
					board[row][col] = player;
					
					return board;
				}
			}	
		}return board;
	}
	
	//Determines if board is full of X/O, if yes, game is a draw, if no, continue playing game
	public static boolean FullOrDraw(char[][] board){ //at start, board is filled with '-', board is checked after each player input to see if board has any
		
		boolean full = true;		//remaining '-' characters, if yes, board is not full, if no, board is full. If game reaches this point,
		
		for(int i = 0; i < 3; i++){  //then the game is a Draw.
		
			for(int j = 0; j < 3; j ++){
			
				if(board[i][j] == '-'){
				
					full = false;
				}
			}
		}return full;
	}
	
	//checks all winning conditions, if any are true, there is a winner
	public static boolean winning(char[][] board){ 
		
		return(rowWins(board) || colWins(board) || diagWins(board));
			
	}
	
	//win condition for rows
	public static boolean rowWins(char[][] board){
		
		for(int i = 0; i < 3; i++){ //checks all rows (0-2) and checks each column number for each row[i], if matching, Winner!
		
			if(boardCheck(board[i][0], board[i][1], board[i][2]) == true){ //calls boardCheck and sends boardArr[][] info as parameter.
			
				return  true;
			}
		}return false;
	}
	
	//win condition for columns
	public static boolean colWins(char[][] board){
	
		for(int i = 0; i < 3; i++){ //checks all columns (0-2) and checks each row number for each column[i], if matching, Winner!
		
			if(boardCheck(board[0][i], board[1][i], board[2][i]) == true){ //calls boardCheck and sends board[][] info as parameter.
			
				return  true;
			}
		}return false;
	}
	
	//win condition for diagonals
	public static boolean diagWins(char[][] board){ //checks both diagonal conditions for win.  Calls boardCheck and sends board[][] info as parameter.
		
		return ((boardCheck(board[0][0], board[1][1], board[2][2]) == true) || (boardCheck(board[0][2], board[1][1], board[2][0]) == true));
	}
	
	public static boolean boardCheck(char a, char b, char c){ //called by winning conditions, checks input parameters to see if equal, if equal, Winner!
	
		return ((a != '-') && (b == a) && (c == b));
	}

	public static void main(String args[]){
	
		char player = 'X';
		char[][] board = new char[3][3];
		
		for(int i = 0; i < 3; i++){
			
			for(int j = 0; j < 3; j++){
				board[i][j] = '-';
			}		
		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This is a TicTacToe game.  Player 1 will be X's and Player 2 will be O's.");
		System.out.println("Remember: The rows are numbered 0,1 & 2 and the columns are numbered 0,1 & 2!\n");
				
		while((winning(board) == false) || (FullOrDraw(board) == false)){
		
			if(player == 'X'){
				//X is Player 1
				System.out.print("Player 1: Enter the Row Index: ");
				int rowIndex = input.nextInt();
			
				System.out.print("Player 1: Enter the Column Index: ");
				int columnIndex = input.nextInt();		
						
				setXO(board, rowIndex, columnIndex, player);
			}
			else if(player == 'O'){
				//O is Player 2
				System.out.print("\nPlayer 2: Enter the Row Index: ");
				int rowIndex = input.nextInt();
				
				System.out.print("Player 2: Enter the Column Index: ");
				int columnIndex = input.nextInt();
				
				setXO(board, rowIndex, columnIndex, player);
			}
			
			printBoard(board); //prints board with updated rowIndex and columnIndex information
			
			if(winning(board)){ //checks for winning conditions, if winning condition met, declares which player won and breaks the loop.
				
				if(player == 'X'){
					
					player = '1';
					System.out.println("\nPlayer " + player + " Wins!");
					break;
				}
				else if(player == 'O'){
					
					player = '2';
					System.out.println("\nPlayer " + player + " Wins!");
					break;
				}		
			}
			else if(FullOrDraw(board)){ //if no winning condition met, checks if board is full. If board is full, declares a Draw.
											//If Draw, break loop.
				System.out.println("\nIts A Draw!");
				break;
			}
			
			if(player == 'X'){ //changes player from X to O (or O to X, as appropriate) at end of each loop to be ready for the next player
				
				player = 'O';
			}
			else{
			
				player = 'X';
			}
		}		
	}
}




	
	
		
		
