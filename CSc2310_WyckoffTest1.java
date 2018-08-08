import java.util.Random;
import java.util.Scanner;

public class WyckoffTest1 {

	public static double minCol(double[][] array){
		
		double min = Integer.MAX_VALUE;
				
		for(int i = 0; i < array.length; i++){
			
			double sum = 0; 
			
			for(int j = 0; j < array[i].length; j++){
				sum = sum + array[i][j]; 
			}
			
			min = Math.min(min, sum);
		}
		
		return min;
	}
	
	public static double returnLast2RowAvg(double[][] array){
		
		double sum = 0.0; 
		double avg = 0.0;
		
		for(int i = 0; i < array.length; i++){
				
			for(int j = (array[i].length-2); j < array[i].length; j++){
							
				sum = sum + array[i][j]; 
		
			}avg = sum / (array.length * 2.0);
		} 
		
		return avg;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Enter the number of rows: ");
		int rows = input.nextInt();
		
		
		System.out.println("Enter the number of columns: ");
		int columns = input.nextInt();
		
		if(columns > 8){
			System.out.println("The column size is too large. Please reinput column size.");
			columns = input.nextInt();
		}
		
		double[][] m = new double[rows][columns];
		
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				
				m[i][j] = rand.nextInt(10)+3.0;
				
			}
		}System.out.println();
		
		double[][] m2 = {{1,1,1,},{2,0,2}};
	
		
		System.out.println(minCol(m));
		System.out.println(minCol(m2));
		System.out.println(returnLast2RowAvg(m));
		System.out.println(returnLast2RowAvg(m2));
		

	}
	
}
