//Stephanie Wyckoff
//This program takes in String and Integer information from the user and prints swapped input.  If the user enters the number 12345, the program
//converts the integer to a char array, notes the length is odd, maintains the first integer char and swaps ever other integer char.  For even 
//lengths the program swaps every other integer char from the beginning.  This is the same format for the String input from the user. 

import java.util.Scanner;
import java.util.Arrays;
public class Swap {

	public static int swapDigitPairs(int n){
		
		
		int y = n;
		int a = 0;
		int b = 0;
				
		int i = 0;
					
		while(i <= b){ //length of n
			a = n%10;
			b = n/10;
			i++;
		}
		
		a = 0; 
		b = 0;
		
		
		int[] arr = new int[i]; //converts length n to int array
						
		if(arr.length%2==1){
			
					
			for(int j = arr.length-1; j > 0; j--){ 
				
				a = y%10;
				b = y/=10;	
				
				if(j==0){
					arr[j] = y;
				}
				else{
					if(j%2==1){ 		//if j is odd, store a in j-1
						arr[j+1] = a; 
						
					}
					else if(j%2==0){ 	//if j is even, store a in j+1
											
						arr[j-1] = a;
					}	
					
				}
			}
			
			
		}
		else if(arr.length%2==0){
			
			for(int j = arr.length-1; j >= 0; j--){
				a = y%10;
				b = y/=10;						
				
				if(j%2==1){
					arr[j-1] = a; 
					
				}
				else if(j%2==0){
					arr[j+1] = a; 
				}
				
			}		
		}
		int flip = 0;
					
		for(int x = 0; x < i; x++){    //converts int array to int
	   		flip += arr[x]*Math.pow(10,i-x-1);
		}
		
		return flip;
}
		
	public static void swapLetterPairs(String b){
		
		if(b.length()%2==1){
			
			System.out.print(b.substring(0,1));
			
			for(int i = 1; i < b.length(); i++){
				
				if(i%2==1){
					System.out.print(b.substring(i+1,i+2));
				}
				else if(i%2==0){
					System.out.print(b.substring(i-1,i));
				}
			}
		}
		else{
			
			for(int i = 0; i < b.length(); i++){
				
				if(i%2==1){
					System.out.print(b.substring(i-1,i));
				}
				else if(i%2==0){
					System.out.print(b.substring(i+1,i+2));
				}
			}
		}
		
		
	}
	

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter a set of numbers.");
		int digit = input.nextInt();
		
		System.out.print(swapDigitPairs(digit));
		System.out.println();
		
		System.out.println("Please enter a set of letters.");
		String letter = input.next();
		
		swapLetterPairs(letter);
		
		if (input != null){  
			input.close();
		}
		
	}
	
}
