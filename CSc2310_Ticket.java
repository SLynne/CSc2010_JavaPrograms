//Stephanie Wyckoff
//7/24/2016
//Ticket
//superclass for all ticket sales, takes in int parameter for ticket number 

public class Ticket {

	int number;
	
	Ticket(int num){
		
		number = num;
	}
	
	public double getPrice(){
		return 0.0;
	}
			
	public String toString(){
		return "Number " + number + ", Price: " + this.getPrice() +"\n"; //Number: 17, Price: 50.0
	}
	
}
