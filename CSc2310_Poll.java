import java.util.Scanner;
import java.util.Random;

public class Poll {
	
	public static void buildArray(String[] headerRow, String[][] issues, int[][] pollNumArr, double[][] avgRating ){ //user selects rating, rating updates that array location
		
		for(int i = 0; i < headerRow.length; i++){
			if(i == 0){
				
			System.out.printf("%40s",headerRow[i]);
			System.out.print(" | ");
			}
			else if(i > 0 && i < headerRow.length-1){
				System.out.printf("%2s",i);
				System.out.print(" | ");
			}
			else if(i == headerRow.length-1){
				System.out.printf("%2s",headerRow[i]);
			}
		}
		System.out.println();
		for(int i = 0; i < 5; i++){
		
			System.out.printf("%40s",issues[i][0]);
			System.out.print(" | ");
			
			for(int x = 0; x < 10; x++){
				
				System.out.printf("%2s",pollNumArr[i][x]);
				System.out.print(" | ");
				
			}System.out.printf("%7s", avgRating[i][0]);
			System.out.println();
		}		
		
			
	}
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		String[] headerRow = new String[12];
		int[][] pollNumArr = new int[5][10];
		String[][] issues = new String[5][1];
		double[][] avgRating = new double[5][1];
		
		int maxRating = 0;
		int minRating = 10;
		int maxIssueCt = 1;
		int minIssueCt = 1;
				
		
		
		issues[0][0] = "How do you feel about Donald Trump?";
		issues[1][0] = "How do you feel about Hillary Clinton?";
		issues[2][0] = "How do you feel about gun control?";
		issues[3][0] = "How do you feel about gay rights?";
		issues[4][0] = "How do you feel about abortion?";
		
		headerRow[0] = "Social Issues";
		headerRow[11] = "Average";
		
		System.out.println("This survey will ask you 5 questions about current social coniousness issues. Please answer using the 1-10 scale.\n");
		System.out.println(" 1 is \"I do not support this issue.\"");
		System.out.println(" 5 is \"I have no opinion or I am neutral about this issue.\"");
		System.out.println("10 is \"I support this issue.\"\n");
	
		buildArray(headerRow, issues, pollNumArr, avgRating);
		
		for(int i = 1; i <= 5; i++){
			int sum =  0;
			double avg = 0.0;
			System.out.println("Please rate your opinion of issue " + (i) + ": ");
			
			int rating = input.nextInt();
								
								
			if((i > 0) && (i <= 5)){ 
					
				if((rating > 0) && (rating <= 10)){
				
					if(pollNumArr[i-1][rating-1] == 0){
					
						pollNumArr[i-1][rating-1] = 1;
					}
				}	
			}
			maxRating = Math.max(maxRating, rating);
			minRating = Math.min(minRating, rating);
											
			maxIssueCt = i;
			minIssueCt = i;
				
			
			for(int j = 0; j < 10; j++){
				if(pollNumArr[i-1][j] > 0){
					sum = Math.max(sum, pollNumArr[i-1][j]);
				}
			}
			for(int y = 0; y < 10; y++){
				if(pollNumArr[i-1][y] == sum){
				avg = (y+1);
				}
			}
			
			avgRating[i-1][0] = avg;
			
			buildArray(headerRow, issues, pollNumArr, avgRating);
			
		}							
		int extraPers = rand.nextInt(9)+5;
		while(extraPers > 0){
			
			for(int j = 1; j <= 5; j++){	
				int sum = 0;
				double avg = 0.0;
				int rating = rand.nextInt((10)+1);
													
				if((j > 0) && (j <= 5)){ 
					
					if((rating > 0) && (rating <= 10)){
															
						pollNumArr[j-1][rating-1] = pollNumArr[j-1][rating-1] + 1;
					
					}	
				}
				
				maxRating = Math.max(maxRating, rating);
				minRating = Math.min(minRating, rating);
										
				if(rating == maxRating){
					maxIssueCt = j;
				}
				if(rating == minRating){
					minIssueCt = j;
				}	
				for(int i = 0; i < 10; i++){
					if(pollNumArr[j-1][i] > 0){
						sum = Math.max(sum, pollNumArr[j-1][i]);
					}
				}	
				for(int y = 0; y < 10; y++){
					if(pollNumArr[j-1][y] == sum){
					avg = (y+1);
					}
				}
				
				avgRating[j-1][0] = avg;
				extraPers--;
					
			}		
		}
		System.out.println();
		buildArray(headerRow, issues, pollNumArr, avgRating);		
		System.out.print("\nThe issue with the greatest rating is Issue: " + maxIssueCt + ". ");
		System.out.println("And the value is: " + maxRating + ". " );
		System.out.print("The issue with the lowest rating is Issue: " + minIssueCt + ". ");
		System.out.println("And the value is: " + minRating + ". " );
	}

private static String printf(String string, double avg) {
	// TODO Auto-generated method stub
	return null;
}
}