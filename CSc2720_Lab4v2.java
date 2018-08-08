
//Program Name: Lab4
//Name: Stephanie L. Wyckoff
//Date: 2/3/2017
//Course: Data Structures Lab
//Professor: Duan
//TA: Pelin Icer, Shubin Wu

//Description: Program determines if two words are anagrams or not.

//Input: The input to the program is a list of words read from an input file, the name of the file must be typed from keyboard by users. 


//Output: On screen: The output is a list containing the same words, but with anagrams displayed on the same line and should be displayed both on the screen as well 
//as an output file name output.txt.
//On file: This output file name must be built into the program.


import java.util.*;
import java.io.*;

public class Lab4v2 {

	public static void main(String[] args) throws IOException{
		//takes in file name from user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		
		String input = s.nextLine();
		
		File file = new File(input);
		
		Scanner inputFile = null;
		
		try { //reads from file
			inputFile = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String m[] = new String[10];
		
		int count = 0;
		
		if(!inputFile.hasNext()){
			System.out.println("The input file is empty.");
		}
		else{ //if the file is not empty
			while(inputFile.hasNext()){
				m[count] = inputFile.next();
				count++;
			}
			
			//output to file set up
			BufferedWriter bw = null;
			try{
				File f = new File("output.txt");
				FileWriter fw = new FileWriter(f);
				bw = new BufferedWriter(fw);
				
				
				for(int j = 0; j < 8; j++){ 
					String s1 = m[j]; //s1 is the jth index of the array
					String s2;
					
					for(int k = 0; k < 8; k++){ //checks each word string individually against all other word strings in the array
						s2 = m[k]; //s2 is the kth word in the array
						String s3 = s2; //s3 equals s2
						
						if(m[j] == m[k]){
							System.out.print("\n" + s1 + " "); //to screen
							bw.write("\n" + s1 + " "); //to file
						}
						else if(m[j] != m[k]){ //if index is not same
							
							if(s1.length() == s2.length()){ //if string lengths are equal
								
															
								char s1A[] = s1.replaceAll("\\s",  "").replaceAll("[^a-zA-Z ]", "").toLowerCase().toCharArray(); 
								char s2A[] = s2.replaceAll("\\s",  "").replaceAll("[^a-zA-Z ]", "").toLowerCase().toCharArray();
								
								Arrays.sort(s1A); //array sorted from a to z
								Arrays.sort(s2A);
									
								if(Arrays.equals(s1A, s2A)){
									System.out.print(s3 + " "); //to screen
									bw.write(s3 + " "); // to file
								}								
							}
						}						
					}
				}
			} 
			catch (IOException ioe) {
				   ioe.printStackTrace();
			}
			finally
			{ 
			     if(bw!=null)
				 bw.close();	
			}
		}
	}
}