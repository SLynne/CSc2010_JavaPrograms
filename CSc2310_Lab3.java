//Stephanie Wyckoff
//Lab3 
//Randomly populating a 2D array of size provided by User and searching within that array for a specific number entered by the User. 
//If number is within the array, prints out the location in Row and Column. If number is not in array, tells user that the number was not 
//within the array. 

import java.util.Scanner;
import java.util.Random;



public class Lab3 {
	
	public static int[] LinearSearch(int[][] array, int number){
		
		int[] result = new int[2];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				
				if(array[i][j] == number){
					result[0] = i+1;
					result[1] = j+1;
					return result;
				}
				
			}
		}	return result;
		
		
		
	}
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Enter the number of rows: ");
		int rows = input.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int columns = input.nextInt();
		
		int[][] arr = new int[rows][columns];
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				
				arr[i][j] = rand.nextInt(899)+100;
				
				System.out.print(arr[i][j] + "\t");
	
			}System.out.println();
		}
		
		System.out.println("\nPlease enter a number to search for in the 2D array: ");
		int num = input.nextInt();
		
		int[] result = LinearSearch(arr, num);
		
		if(result[0] == 0){
			System.out.println("\nThe number could not be found in the array.");
		}
		else{
		
			System.out.println("\nThe number was found in location Row: " + result[0] + " Column: " + result[1]);
		}
		
		
		
	}
}
