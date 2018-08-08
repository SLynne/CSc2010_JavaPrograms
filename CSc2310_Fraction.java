//Stephanie Wyckoff
//7/10/2016
//Fraction
//Fraction Class allows users to create programs which add, divide and scale fractions up or down. 

public class Fraction {

		  // Instance variables
	private int numerator;    // Numerator of fraction
	private int denominator;  // Denominator of fraction
	
	  // Constructors
	public Fraction(int num, int denom) { //am I supposed to call this? 
		
		numerator = num;
		denominator = denom;	
	}
	
	  // Instance methods
	public int getNumerator() {
		
	//	numerator = num;
		return numerator;
	}
	  
	public Fraction(int numerator){ 
		
		this(numerator,1);
	}
	  
	public Fraction(){ //initializes here at new Fraction();
		
		numerator = 0;
		denominator = 1;
	}
	
	public int getDenominator() {
		
		//denominator = denom;
		return denominator;
	}
	
	public Fraction add(Fraction f) {
		
		int num = numerator * f.denominator + 
				  f.numerator * denominator;
		int denom = denominator * f.denominator;
		return new Fraction(num, denom);
	}
	  
	
	public Fraction divide(Fraction f){ 
		 //multiply current fraction by new fraction 
		int num = numerator * f.denominator;
		int denom = denominator * f.numerator;
		  
		return new Fraction (num,denom); 
	  }
	  
	public String scaleUp(int factor){
		  //multiply numerator by factor
		return ""+(numerator*factor)+"/"+denominator;
	}
	  
	public String scaleDown(int factor){
		  //multiply denominator by factor
	  //check if factor is 0, if zero, warning message, re-input factor
		if(factor != 0){
			
			return ""+numerator+"/"+(denominator*factor);
		}
	
		return "WARNING: You have selected an improper scale factor. Please reinput scale factor. ";
	}
	  
	public String scale(int factor, boolean flag){
		  //if flag is true, scale up, else scale down
	  //check if factor is 0, if zero, warning message, re-input factor
		while(factor == 0){
			
			return "WARNING: You have selected an improper scale factor. Please reinput scale factor. ";			  
		}
		
		if(flag == true){
			
			return scaleUp(factor);
		}
		else{
			
			return scaleDown(factor);
		}  
	}

 
			 
		  
}

	

