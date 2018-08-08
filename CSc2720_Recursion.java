/*
 * Program Name: Lab 9 / Recursion
 * Name: Stephanie L. Wyckoff
 * Date: 3/11/2017
 * Course: Data Structures Lab
 * Professor: Duan
 * TA: Pelin Icer, Shubin Wu
 * 
 * Description: Program takes in a string and checks if the substring "ABBB" is contained within and returns boolean value. 
 * 
 * Input: n/a
 * 
 * Output: Statement of whether or not the substring was in the string or not.
*/

public class Recursion {

	
	public static boolean IsIn(String w){
		
		
		String search = "ABBB"; //string to search for
		
		if(w.length() == 0){ //if string is empty, return true
			return true;
		}
		else if(w.length() != 0){
		
			if(w.contains(search)){ //if string is not empty and contains search string
				
				char[] ch = search.toCharArray(); //convert search string to ch char array
				
				for(int i = 0; i < ch.length; i++){ //iterate through ch char array
			
					String s = String.valueOf(ch); //change element ch[i] to string
					
					w = w.replace(s, ""); //replace part of string w with empty string, effectively removes the search string char by char
				}
				return IsIn(w); //because search string was found, return recursive method call with newly diminished string
			}
		}
		return false; //if string is not empty but does not contain AnB3n form throughout
	}
	
	public static void main(String[] args){
		
		String str = "AABBBBBB";
		
		if(IsIn(str)){
			System.out.println("The string " + str + " is in the language.");
		}
		else{
			System.out.println("The string " + str + " is NOT in the language");
		}
	}
}
