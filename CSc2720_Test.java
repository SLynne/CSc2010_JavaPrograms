/*
 * Program Name: Lab 7 / Test
 * Name: Stephanie L. Wyckoff
 * Date: 2/24/2017
 * Course: Data Structures Lab
 * Professor: Duan
 * TA: Pelin Icer, Shubin Wu
 * 
 * Description: Program creates Character[] array, and new Stack. Checks if stack is empty, pushes each element to Stack, pops off last element, checks if Stack is empty and prints stack after each call.
 * 
 * Input: none.
 * 
 * Output: Stack.
*/
public class Test {

	public static void main(String[] args) {
		
		
		Character[] arr = {'H','E','Y','Y','E','Y','A','A','E','Y'}; 
			
		Stack s = new Stack(arr.length);
		
		System.out.println(s.isEmpty() + "\n");
		
		for(int i = 0; i < arr.length; i++) {
			
			s.push(arr[i]);
			s.printStack();
		
		}
		
		s.pop();
		s.printStack();
		
		s.peek();
		s.printStack();
		
		System.out.println(s.isEmpty() + "\n");
	
	}
}
