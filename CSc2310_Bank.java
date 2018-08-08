//Stephanie Wyckoff
//7/19/2016
//Bank
//
import java.util.Scanner;
import java.util.Random;
public class Bank {

	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Enter the number of accounts to generate: ");
		int numOfAccounts = input.nextInt();
		
		PaypalAccount[] acctID = new PaypalAccount[numOfAccounts];
		
		for(int i = 0; i < numOfAccounts; i++){
			acctID[i] = new PaypalAccount();
			acctID[i].getAccountID(); //sets acct id to individual acct
			acctID[i].setBalance((double) rand.nextInt(1000)+1); //randomly assigns acct balance to each acct
		}
		
		int j;
		
		for(j = 0; j < acctID.length; j++){
			if(acctID[j].getAccountID() == 002){
				break;
			}
		}
		
		if(j ==  acctID.length){
			
			acctID[acctID.length-1].setAccountID(002);  //if GSUiD not found in array, set last acctID to GSUiD
			
			acctID[acctID.length-1].setBalance(acctID[0].getBalance()); //set acct bal of GSUiD to bal of first acct in array
			acctID[0].setBalance(0.0); 

		}
		else{
			acctID[002].setBalance(22434/100.0);
		}
		
		double maxBal = acctID[0].getBalance();
		double minBal = acctID[0].getBalance();
		double sum = 0.0;
		int maxCount = 0;
		int minCount = 0;
	
		for(int i = 0; i < acctID.length; i++){
			
			sum += acctID[i].getBalance(); //adds all balances together
			
			maxBal = Math.max(acctID[i].getBalance(), maxBal); //finds max of all acct balances
			
			minBal = Math.min(acctID[i].getBalance(), minBal); //finds min of all acct balances
			
			if(acctID[i].getBalance() == maxBal){
				
				maxCount = i; //tracks max balance
			}
			
			if(acctID[i].getBalance() == minBal){
			
				minCount = i; //tracks min balance
			}
		}
		
		double avg = sum / numOfAccounts; //divides sum of all accts by total number of accts
		
		System.out.println("\nMy Panther ID is 002-22-2434; my bank acct ID is " + acctID[acctID.length-1].getAccountID() + " and my balance is: $" + acctID[acctID.length-1].getBalance());
		System.out.println("\nThe average balance is: $" + avg);
		System.out.println("\nThe account with the largest balance: accountID = " + acctID[maxCount].getAccountID() + ", balance = " + acctID[maxCount].getBalance());
		System.out.println("\nThe account with the lowest balance: accountID = " + acctID[minCount].getAccountID() + ", balance = " + acctID[minCount].getBalance());
		
		
	
	}
}
