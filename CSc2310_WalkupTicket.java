//Stephanie Wyckoff
//7/24/2016
//WalkupTicket extends Ticket
//takes in int parameter as ticket number

public class WalkupTicket extends Ticket {
	
	
	public WalkupTicket(int num){
		super(num);
	}
	
	public double getPrice(){
	
		return super.getPrice() + 50.0;
	}
	
}
