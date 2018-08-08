//superclass for all ticket sales {walkup, advance > student advance}
public class MyTicket {

	public double price = 0.0;
	public static int currentTixNum = 1;
	public int ticketNum;

	
	MyTicket(){
		price = 0.0;
		ticketNum = currentTixNum;
		currentTixNum++;
		
	}
	
	public double getPrice(){
		return 0.0;
	}
			
	public String toString(){
		return "Number " + ticketNum + ", Price: " + this.getPrice() +"\n"; //Number: 17, Price: 50.0
	}
	
}

