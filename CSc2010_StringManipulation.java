import java.util.Scanner;

public class StringManipulation {
	
	public static String convertToPigLatin(String pigLatin){
		
		int i = findFirstVowel(pigLatin);
				
		if (i==0){
			String vowelAtZero = (pigLatin.substring(1,pigLatin.length())+pigLatin.substring(0,1)+"way");
			return vowelAtZero;
		}
		else{
			String vowelAfterZero =(pigLatin.substring(i,pigLatin.length())+pigLatin.substring(0,i)+"ay");
			return vowelAfterZero;
		}
				
	}
	
	public static int findFirstVowel(String firstVowel){
		
		int i;
		for(i = 0; i < firstVowel.length(); i++){
			char x = firstVowel.charAt(i);
			if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
				return i;
			}
		}	
		
		return 0;
	}
	
	public static char[] reverse(String reverse){ // It was'nt specifically stated what the return type was for this section.
												  // It says that the method must return the mirror image, and it does. 
		char[] esrever = reverse.toCharArray();	  // I did't see a point in converting via a for loop when you can do the same with less clutter. :)	
												  // esrever is the reverse of reverse :)
		for(int i = 0; i < esrever.length/2; i++){
					
			char temp = esrever[i];
			esrever[i] = esrever[esrever.length-1-i];
			esrever[esrever.length-1-i] = temp;
		}
			
		return esrever;
	}
	
	public static char[] encryption(char[] rapelcgvba){  // It wasn't specifically stated what the parameter and return types were for this section.  
														 // So I made it a bit easier than reverse() above and saved a line of code
		for(int i=0; i < rapelcgvba.length; i++){		 // by putting the .toCharArray() in the print statement that calls the method. :) 
														 // rapelcgvba is ROT13 for encryption :)	
			char x = rapelcgvba[i];
			
			if(x >= 'a' && x <= 'z'){
				
				if(x <= 'm'){
					x+=13;
				}
				else if(x > 'm'){
					x-=13;
				}
			}
			
			rapelcgvba[i] = x;
		}
		
		return rapelcgvba;	
	}
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		String userInput = s.nextLine();
		
						
		while(!userInput.equals("done")){
			
			userInput = (userInput.toLowerCase());	
			
			System.out.println(convertToPigLatin(userInput));
			
			System.out.println(reverse(userInput));
			
			System.out.println(encryption(userInput.toCharArray()));
			
			userInput = s.nextLine();
					
			
			if (userInput == "done"){
				System.exit(0);
			}
		}
		if (s != null){   // I kept getting an error that said Scanner was still open,
			s.close();	  // and I found this bit of code on Google to close out Scanner. 
		}				  // I'm not sure if this matters at all, or if it's the right way to do it,
	}					  // but it seems to work as the error has gone away. :)
	
	
	
}