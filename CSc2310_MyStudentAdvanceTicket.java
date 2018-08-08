
public class MyStudentAdvanceTicket extends MyAdvanceTicket{
	
	public MyStudentAdvanceTicket(){
		super();
		
	}
	
	public double getPrice(){
		
		return super.getPrice()/2;
	}
	
	public String toString(){
		return super.toString() + "Please show Student ID with ticket.";
		//mention student must show student id
	}
}
