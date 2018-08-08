//Stephanie Wyckoff
//7/24/2016
//StudentAdvanceTicket extends AdvanceTicket
//takes in int as parameter for ticket number and int as parameter for number of days purchased in advance

public class StudentAdvanceTicket extends AdvanceTicket{
		
	public StudentAdvanceTicket(int num, int adv){
		
		super(num,adv);
	}
	
	public double getPrice(){
		
		return super.getPrice()/2;
	}
	
	public String toString(){
		return super.toString() + "Please show Student ID with ticket.";
		//mention student must show student id
	}

}
