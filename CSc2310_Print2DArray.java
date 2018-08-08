//Stephanie Wyckoff
//6/20/2016
//Print2DArray
//The purpose of this program is to print a 2D array of numbers.  The program asks the user to input the number of rows and columns of 
//the 2D array and then randomly populates the array.  The numbers are added and divided to obtain the average and the maximum and 
//minimum values are calculated.  

import java.util.Scanner;
import java.util.Random;

public class Print2DArray {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
			
		int max = Integer.MAX_VALUE; //sets the maximum value of an int
		int min = Integer.MIN_VALUE; //sets the minimum value of an int
		double sum = 0;
		double num = 0;
		
		
		System.out.println("Enter the number of rows: ");
		int rows = input.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int columns = input.nextInt();
		
		int[][] arr = new int[rows][columns];
		
		System.out.printf("%20s","Stephanie Wyckoff");  //my name
		System.out.printf("%15s","002-22-2434"); //my Panther ID
		System.out.println();
		System.out.println();
		
		
		for(int i = 0; i < arr.length; i++){ //creates rows
			
			for(int j = 0; j < arr[i].length; j++){ //creates columns
				    											
				arr[i][j] = rand.nextInt((9900)+100); //randomly populates array position with values from 100-10000
				
				System.out.printf("%10d",arr[i][j]);
				
				sum += arr[i][j]; //sum calculated for average calculation below
											
				num = arr[i].length; //number of columns
						
						
				if(i==0){
					
					max = Math.max(min, arr[i][j]); //sets max to max of Integer Min Value and first array value
					min = Math.min(max, arr[i][j]); //sets min to min of Integer Max Value and first array value
												
				}
				else if(i!=0){
					
					max = Math.max(max, arr[i][j]); //finds max of max and next array value
					min = Math.min(min, arr[i][j]); //finds min of min and next array value
									
				}
				
			}System.out.println();
		}
			
		
		
		double avg = sum / (arr.length * num); //computes average: arr.length (number of rows) * num (number of columns) is total number of 
												//the random numbers generated
		System.out.println();	
		System.out.printf("Maximum: "+ max + "  Minimum: "+ min);
		System.out.printf("%5s","  Average: " + avg);
		
	}

	private static String printf(String string, double avg) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

