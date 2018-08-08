//Stephanie Wyckoff
//6/20/2016
//IncomeTax
//The purpose of this program is to compute the income tax for a randomly set number of persons based on given parameters and produce the
//person with the max value of income tax.  The program generates a random number of persons (between 1-15) and asks the user to input their 
//taxable income.  The program then calculates the person's income tax and displays it for the user.  This repeats until the number of persons is 
//equal to the random number from the beginning.  At that time the program displays who had the greatest tax value and what their income tax was.

import java.util.Random;
import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args){
		
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int people = rand.nextInt(15)+1;
		
		double[] brr = new double[people];
		
		int i;
		int pers = 0;
		double max = 0;

		
		for(i = 0; i < brr.length; i++){ //loops through the randomly selected number of times, asking user for income information and 
			System.out.print("Please enter the taxable income for Person " + (i+1) + ".  "); //displaying income taxes for that person
			int income = input.nextInt();					
			
					
			if(income < 750){
				System.out.println("The taxes due for Person " + (i+1) +" is $" + (printf("%2f", (income * .01))));
				System.out.println();
				brr[i] = (printf("%2f", (income * .01))); //Income tax information is stored in array for the max/min below
			}
			else if(income >= 750 && income < 2500){
				System.out.println("The taxes due for Person " + (i+1) +" is $" + (printf("%2f", ((income * .02) + 7.50))));
				System.out.println();
				brr[i] = (printf("%2f", ((income * .02) + 7.50)));
			}
			else if(income >= 2500 && income < 5000){
				System.out.println("The taxes due for Person " + (i+1) +" is $" + (printf("%2f", ((income *.04) + 82.50))));
				System.out.println();
				brr[i] = (printf("%2f", ((income *.04) + 82.50)));
			}
			else if(income >=5000 && income < 8000){
				System.out.println("The taxes due for Person " + (i+1) +" is $" + (printf("%2f", ((income * .05) + 142.50))));
				System.out.println();
				brr[i] = (printf("%2f", ((income * .05) + 142.50)));
			}
			else if(income > 8000){
				System.out.println("The taxes due for Person " + (i+1) +" is $" + (printf("%2f", ((income * .06) + 230.00))));
				System.out.println();
				brr[i] = (printf("%2f", ((income * .06) + 230.00)));
			}
								
		}
		
		if(brr.length == 1){ //if random number is 1, set variables max and pers to specifics
			
			max = brr[0];
			pers = 1;
			
		}
		
		else{ //if random number is greater than 1, iterate through array from above to find max values
			
			for(int j = 0; j < brr.length-1; j++){
				
				if(j==0){
				//sets first position
					max = Math.max(brr[j], brr[j+1]); //sets max value
					
					if(brr[j] == max){
						pers = (j+1); //sets pers count
					}
					else{
						pers = (j+2);
					}
					
				}
				else if(j!=0){
				//sets all remaining positions	
					if(max < brr[j+1]){
						
						max = brr[j+1]; //sets max value
						pers = (j+2); //sets pers count					
					}
				}	
				
			}	
		}
			
			System.out.println("The person with the max value of taxes is: "); //displays person with max value income tax 
			System.out.println("Person " + pers + ": ");
			System.out.println("Total taxes: $" + max);
			System.out.println();
			
	}

	private static double printf(String string, double d) {
		// TODO Auto-generated method stub
		return d;
	}
	
	
}