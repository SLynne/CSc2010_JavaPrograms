//Stephanie Wyckoff
//7/19/2016
//PaypalAccount
//constructor class
public class PaypalAccount {

	public double balance = 0.0;
	public static int currentID = 0;
	public int accountID;
	
	PaypalAccount(){
		balance = 0.0;
		accountID = currentID;
		currentID++;
	}
	
	public void setAccountID(int newID){
		this.accountID = newID;
	}
	
	public int getAccountID(){
		return accountID;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double newBal){
		this.balance = newBal;
	}
	
	public String toString(){
		return "";
	}
	
	
}
