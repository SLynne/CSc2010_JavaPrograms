import java.util.Scanner;
public class ChrisTree {

	public static void buildTrees(int a, int b){ //b is number of segments, a is rows of segments
			
		
		for(int i = 0; i < b*2; i++){ //number of segments per tree
					
			for(int j = 0; j <= a*2; j++){ //rows per segment
				
				if(j%2!=0 && (j+i)%2!=0){	//first part ensures that only odd numbered segments and rows are used
					for(int x = a*2+(Math.max(a,b)+2); x > j+i; x-=2){ //ensures that greater of a,b is always used for spacing so that 
																		//you can have a tall skinny tree (a<b) or a short fat tree (a>b)
						System.out.print(" ");							//and that the trees bottom is 2 spaces from the edge of the page
						
					}											
					for(int k = 0; k < j+i; k++){ //dots per line
						System.out.print("*");
						
					}
					if((j+i)%2!=0){       //ensures that only odd numbered sections are shown
						System.out.println();
					}
				}							
			}
		}
		
		
		System.out.println("      *   ");
		System.out.println("      *   ");
		System.out.println("   *******");
	}
	
	
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This is a program to build Christmas Trees.\n");
		
		System.out.println("How many segments are in your tree?");
		int segment = input.nextInt();		
		
		System.out.println("How tall is each segment (rows per segment)?");
		int tall = input.nextInt();
		
			
		buildTrees(tall, segment);
		
		
		if (input != null){  
			input.close();
		}
	}
	
}
