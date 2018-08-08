/*
 * Program Name: Lab 6 / NameCard
 * Name: Stephanie L. Wyckoff
 * Date: 2/18/2017
 * Course: Data Structures Lab
 * Professor: Duan
 * TA: Pelin Icer, Shubin Wu
 * 
 * Description: Constructor class used to create new NameCard objects with name, age and company data fields.
 * 
 * Input: none.
 * 
 * Output: none.
*/

public class NameCard {
	
	private String name;
	private int age;
	private String company;
	
	private NameCard next;
	private NameCard prev;
	
		
	//constructor
	public NameCard(String n, int a, String c){
		
		next = null;
		prev = null;
		
		name = n;
		age = a;
		company = c;
		
	}
	
	//constructor w next = null
	public NameCard(String n, int a, String c, NameCard nc1, NameCard nc2){
		
		next = nc1;
		prev = nc2;
		
		name = n;
		age = a;
		company = c;
	}
	
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
	
	public String getCom(){
		return company;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public void setCom(String c){
		company = c;
	}

	public NameCard getNext() {
		return next;
	}

	public void setNext(NameCard n) {
		next = n;
	}

	public NameCard getPrev() {
		return prev;
	}

	public void setPrev(NameCard p) {
		prev = p;
	}
	
	public void setNameCard(String n, int a, String c){
		name = n;
		age = a;
		company = c;
	}

	public String toString() {
		
		return "NameCard [Name = " + name + ", Age = " + age + ", Company = " + company + "]";
		
	}
	
	



}
