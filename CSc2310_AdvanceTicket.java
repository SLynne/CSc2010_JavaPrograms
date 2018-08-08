//Stephanie Wyckoff
//7/24/2016
//AdvanceTicket extends Ticket
//takes in int as parameter for ticket number and int as parameter for number of days purchased in advance

import java.util.Scanner;

public class AdvanceTicket extends Ticket{
		
	private int advance;
	
	public AdvanceTicket(int num, int adv){
		super(num);
		advance = adv;		
	}
	
	public double getPrice(){
		
		if(advance >= 10){
			
			return super.getPrice() + 30.0;
		}
	
		return super.getPrice() + 40.0;
	}	
}
