
public class BuyTickets {

	public static void main(String[] args){
		//checks version for class
		WalkupTicket blah = new WalkupTicket(42);
		
		System.out.println(blah.toString());
		
		AdvanceTicket adv = new AdvanceTicket(86,46);
		
		System.out.println(adv.toString());
		
		StudentAdvanceTicket stud = new StudentAdvanceTicket(99963,9);
		
		System.out.println(stud.toString());
		
		//checks my version
		MyWalkupTicket blah1 = new MyWalkupTicket();
		
		System.out.println(blah1.toString());
		
		MyAdvanceTicket adv1 = new MyAdvanceTicket();
		
		System.out.println(adv1.toString());
		
		MyStudentAdvanceTicket stud1 = new MyStudentAdvanceTicket();
		
		System.out.println(stud1.toString());
	}
}
