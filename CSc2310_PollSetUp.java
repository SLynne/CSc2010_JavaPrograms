//Stephanie Wyckoff
//DATE
//Poll3
//Explanation
//
//
//
public class PollSetUp {
	//	String[] headerRow;
	public int[][] pollNumArr; 
	public String[][] issues;
	double[][] avgRating;
	int issueNum;
	double avg;
	int newSum;
	int maxRating;
	int minRating;
	int maxIssueCt;
	int minIssueCt;
	int ratingValueMax;
	int socialIssueMax;
	//int someNum = ratingValueMax+2;
	
	public PollSetUp(){
		//headerRow = new String[someNum];
		pollNumArr = new int[socialIssueMax][ratingValueMax];
		issues = new String[socialIssueMax][1];
		avgRating = new double[socialIssueMax][1];
		createBoard();
	}
	
	
	
	public void createBoard(){ 
		String[] headerRow = new String[12];	
		
		headerRow[0] = "Social Issues: ";
		headerRow[11] = "Average: ";
		
		for(int i = 1; i < headerRow.length; i++){
						
			for(int j = 1; j <= socialIssueMax; j++){
				
				if(i > 0 && i <= ratingValueMax){
					
					headerRow[i] = i+1 + "";
				}
												
				issues[j][0] = "-";
				
				if(j > 0 && j <= socialIssueMax){
					
					pollNumArr[i][j] = 0;
				}
				else if(j >= socialIssueMax+1){
					
					avgRating[i][j] = 0.0;
				}
			
			}
		}
	}
	
	public void printBoard(){ 
		String[] headerRow = new String[12];	
		
		
		for(int i = 0; i < headerRow.length; i++){
			
			System.out.print("| ");
			System.out.print(headerRow[i] + " | \n");
			
			for(int j = 0; j <= ratingValueMax; j++){
							
				System.out.print(issues[j][0] + " | ");
				System.out.print(avgRating[i][j] + " | ");
			}
			
			System.out.println();
		
		}
	}
	
	public void socialIssues(String issue, int num){ //social consciousness issues
		
		for(int i = 0; i < socialIssueMax; i++){
			
			issues[num].equals(issue);
		}	
	}
	
	public boolean opinion(int issueNum, int RatingNum){ //user selects rating, rating updates that array location
		
			
		if((issueNum > 0) && (issueNum <= issues.length)){ 
			 										
			if((RatingNum > 0) && (RatingNum <= pollNumArr.length)){
			
				if(pollNumArr[issueNum][RatingNum] == 0){
				
					pollNumArr[issueNum][RatingNum] = 1;
					
					return true;
				}
			}	
		}return false;
			
	}
	
	public void MaxMin(int ratingNum, int issNum){
														
			maxRating = Math.max(maxRating, ratingNum);
			minRating = Math.min(minRating, ratingNum);
											
			if(ratingNum == maxRating){
				maxIssueCt = issNum+1;
			}
			else if(ratingNum == minRating){
				minIssueCt = issNum+1;
			}	
				
	}
							
	public void Sum(int sum, int num){
		
		newSum += sum;
		Average(sum, num);
	}
	
	public double Average(int sum, int num){
		return avg = newSum / num;
	}
}

		
	

	
