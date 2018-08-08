//Program Name: Palindrome/Lab 1
//Name: Stephanie L. Wyckoff
//Date: 1/13/2017
//Course: Data Structures Lab
//Professor: Duan
//TA: Pelin Icer

//Description: This program takes in a String from the user and checks if that String is a palindrome, the same spelling both forwards and backwards. 
//  The program output is a statement of whether the String was or was not a palindrome. 

import java.util.Scanner;

public class Palindrome {

	//Method checks whether or not input String is a palindrome;
	public static boolean checkPalindrome(String s){
		
		s=s.toLowerCase();
		
		for(int i = 0; i < (s.length()/2); i++){
			
			if(s.charAt(i) != s.charAt(s.length()-i-1)){
				
				return false;
			}
		}return true;
		
	}
	
	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);

		//Request for user to enter a word
		System.out.println("Please enter a word: ");
	    //assigns user input String to input
		String input = s.nextLine();
	    	       
	    //if statement calls checkPalindrome(input) and checks if outcome of the method is true or false
	    if(checkPalindrome(input) == true){
	    	System.out.println(input + " is a palindrome.");
	    }
	    else{
	    	System.out.println(input + " is not a palindrome.");
	    }
	    
	    //closes Scanner
		s.close();
	}
}