public class Sum {

	public static void main(String[] args){
		
		int sum = 0;
		int sum2 = 0;
		
		for(int k = 0; k < 1000; k++){
		
			if(k%3==0 || k%5==0){
				sum = sum + k;
			}		
			
			else if(k%3==0 && k%5==0){
				sum2 = sum2 + k;
			}
		}	
		
		System.out.println(sum+sum2);
	}
}