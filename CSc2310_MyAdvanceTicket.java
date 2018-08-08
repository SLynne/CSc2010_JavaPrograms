import java.util.Scanner;

public class MyAdvanceTicket extends MyTicket{
	
	
	
	public MyAdvanceTicket(){
		super();
		
	}
	
	public double getPrice(){
		
		if(dayCount() >= 10){
			
			return super.getPrice() + 30.0;
		}
	
		return super.getPrice() + 40.0;
	}
	
	public int dayCount(){
		
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		System.out.print("What is todays date?  yyyy/mm/dd \n");
	
	String date1 = input.nextLine();
	
	int year = findYear(date1);
	int month = findMonth(date1);
	int day = findDay(date1);
	
	System.out.print("What is the date of the event?  yyyy/mm/dd \n");
		
		String date2 = input1.nextLine();
		
		int eYear = findYear(date2);
		int eMonth = findMonth(date2);
		int eDay = findDay(date2);
				
		Date today = new Date(year, month, day);
		Date eventDay = new Date(eYear, eMonth, eDay);
		
		return today.daysTo(eventDay);
		
	}
	
	public static int findYear(String input){
		int dash = input.indexOf('/');
		
	String temp = input.substring(0, dash);
	return Integer.parseInt(temp); //Returns string converted to int
	}
		
	public static int findMonth(String input){
		int dash = input.indexOf('/');
	
	String temp = input.substring(dash + 1, dash + 3);
	return Integer.parseInt(temp); //Returns string converted to int
	}
	
	public static int findDay(String input){
		int dash = input.indexOf('/');
	
	String temp = input.substring(dash + 4, input.length());
	return Integer.parseInt(temp); //Returns string converted to int
	}
	//public String toString(){
	//	return "Number " + ticketNum + " , Price: " + this.getPrice() +"\n"; //Number: 17, Price: 50.0
	//}
	
}
	

