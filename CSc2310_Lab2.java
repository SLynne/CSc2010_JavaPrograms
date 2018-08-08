import java.util.Scanner;

public class Lab2 {

	public static boolean containDigit(int a, int b){
		
		int n = 0;
		
		for(int i = 0; i < 4; i++){
			n = a%10; 
			a /= 10;
			
			if(n == b){
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a = 0434;
		System.out.println("Please enter a number between 0-9");
		int b = input.nextInt();
		
		System.out.println(containDigit(a,b));
	}
}
