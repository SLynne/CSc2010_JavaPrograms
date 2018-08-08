//Stephanie Wyckoff
//The program functions as expected.  The program requests the user to define length of the array, provide integers for the array and checks if the 
//array contains the numbers 7, 13 or 18.  If yes, the program is determined to be lucky.  The isLucky() method returns true, prints for the user that the 
//array is lucky and calls the sum() method which computes the sum of all of the integers in the array.  If no, the program is determined to be not lucky.  
//The isLucky() method then returns false, prints for the user that the array is not lucky and calls the sumOfEvens() method which computes the sum of all 
//of the even integers in the array.  Next the user is prompted to enter another array to compute dot product.  If the second array is the same size as the 
//first, the program proceeds with getting the integers from the user.  Otherwise it notes that the arrays must be of equal length and loops until equal 
//length is given.  Both arrays are printed for the user and the program calls dotProduct() and returns the dot product of the first and second arrays.  
//Finally the user is prompted to choose whether or not to start over and and enter another array.  The program loops until the user enters 2 which ends the
//program. 

import java.util.Arrays;
import java.util.Scanner;
public class FunArrays {

	public static boolean isLucky(int[] lucky){ //checks if array is lucky (contains 7, or 13, or 18)
		
		boolean isTrue = false;
		
		for(int i = 0; i < lucky.length; i++){ 
			int charms = lucky[i]; 
			if (charms == 7 || charms == 13 || charms == 18){ 
				isTrue = true;  //returns true
				break;
			}
		}
		return isTrue; //returns false
	}
	
	public static int sum(int[] num){ //if array is lucky, continues to here per instructions
		
		int sum = 0;
		
		for(int i = 0; i < num.length; i++){
			sum = sum + num[i];
		}
		return sum;
	}
	
	public static int sumOfEvens(int[] num){ //if array is not lucky, continues to here per instructions
		
		int even = 0;
		
		for(int i = 0; i < num.length; i++){
			if(num[i] % 2 == 0){
				even = even + num[i];
			}
		}
		return even;
	}

		
	public static int dotProduct(int[] first, int[] second){ //computes dot product ((a*b)+(a1*b1)....)
	
		int sum = 0;
							
		for(int i = 0; i < first.length; i++){
			int product = first[i] * second[i];
			sum = sum + product;	
		}	
		
		return sum; //returns dot product
}
		
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		boolean loop = true; 
		
		while(loop){ //loops program
		
			System.out.println("How many integers are in your array?");
	
			int num = input.nextInt();
		    
			int[] numbers = new int[num];
		   
		    for (int i = 0; i < numbers.length; i++){
		        System.out.println("Please enter term " + (i+1) + ":");
		        numbers[i] = input.nextInt();
		    }
		    
		    System.out.println();
		    System.out.println("Your array is " + Arrays.toString(numbers));
		    System.out.println();
		    
		    if(isLucky(numbers) == true){
				System.out.println("Your array is lucky!");
				System.out.println();
				System.out.println("The sum of all integers in your array is " + sum(numbers) + "."); //per the instructions
				System.out.println();
			}else{
				System.out.println("Your array is not lucky.");
				System.out.println();
				System.out.println("The sum of all even integers in your array is " + sumOfEvens(numbers) + "."); //per the instructions
				System.out.println();
			}
		    
		    		
			System.out.println();
			System.out.println("To compute dot product, you will need to enter a second array.  How many integers are in your second array?");
			//requests second array to compute dot product 
		
			int num2 = input.nextInt();
			
			int[] numbers2 = new int[num2];
	
			while(numbers2.length != numbers.length){ //checks second array length with first, if not equal cannot compute dot product
													  
				System.out.println("To compute dot product, the arrays must be of equal length.");
				System.out.println();
				System.out.println();
				System.out.println("How many integers are in your second array?");
				
				num2 = 0;
				num2 = input.nextInt();
				numbers2 = new int[num2];
				
				if(numbers2.length == numbers.length){//loop continues until array lengths are equal
					break;
				}
			}
			
				for (int k = 0; k < numbers2.length; k++){
					System.out.println("Please enter term " + (k+1) + ":");
				    numbers2[k] = input.nextInt();
				}
				
				System.out.println();
				System.out.println("Your first array is " + Arrays.toString(numbers)); 
				System.out.println("Your second array is " + Arrays.toString(numbers2));
				System.out.println();
				System.out.println("The dot product of your arrays is " + dotProduct(numbers, numbers2) + ".");
				System.out.println();
				System.out.println();
				System.out.println("Would you like to try again?");
				System.out.println("1 - Yes");
				System.out.println("2 - No");
				
				int answer = input.nextInt();
				
				if(answer == 2){//loops program until user enters 2
					loop = false;
					break;
				}
				else if(answer == 1){
					loop = true;
				}
		}		
				
			
		if(input != null){
			input.close();
		}
		
		
	}
}