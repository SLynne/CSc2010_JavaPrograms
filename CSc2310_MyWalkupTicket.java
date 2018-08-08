
public class MyWalkupTicket extends MyTicket {

	public MyWalkupTicket(){
		super();
	}
	
	public double getPrice(){
	
		return super.getPrice() + 50.0;
	}
	//public String toString(){
	//	return "Number " + ticketNum + " , Price: " + this.getPrice() +"\n"; //Number: 17, Price: 50.0
	//}
}


