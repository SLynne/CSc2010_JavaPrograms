//Stephanie Wyckoff
//7/10/2016
//FractionScale
//prompts user for a fraction and a scale factor, scales the fraction up or down by the factor per the users input. Prompts user for another fraction to divide by and 
//prints out the quotient. User may enter spaces before or after the integer parts if they wish.

import java.util.Scanner;

public class FractionScale {
	
	public static int findNum(String input){
		int dash = input.indexOf('/');
			
		String temp = input.substring(0, dash);
		return Integer.parseInt(temp); //Returns string converted to int
	}
		
	public static int findDen(String input){
		int dash = input.indexOf('/');
		
		String temp = input.substring(dash + 1, input.length());
		return Integer.parseInt(temp); //Returns string converted to int
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int scale;
		int factor;
		
		System.out.println("Enter a fraction: "); 
		
		String frac = input.nextLine(); //works fine here but I copied it to the section below (with updated variable names) and it doesnt work?
		
		frac = frac.replaceAll("\\s", ""); //This removes any spaces given by the user
				
		Fraction frac1 = new Fraction(findNum(frac), findDen(frac)); //Creates new Fraction object

		frac1.getNumerator();
		
		frac1.getDenominator();
		
				
		
		System.out.print("\nScale up or down (1: up, 0: down): "); 
		scale = input.nextInt();
		
		while(scale != 1 && scale != 0){
			System.out.println("Please enter either a 1 to scale up or 0 to scale down. ");
			scale = input.nextInt();
		}
		
		System.out.print("\nEnter a scale factor: ");
		factor = input.nextInt();
			
		if(scale == 1){
			
			while(factor == 0){
				System.out.println("\n"+frac1.scale(factor, true));
				factor = input.nextInt();
			}
			
			System.out.print("\nThe scaled fraction is: " + frac1.scale(factor, true));
		}
		else if(scale == 0){
			
			while(factor == 0){
				System.out.print("\n"+frac1.scale(factor, false));
				factor = input.nextInt();
			}
			
			System.out.print("\nThe scaled fraction is: " + frac1.scale(factor, false));
		}

		
	}
}
	