//Stephanie Wyckoff
//7/19/2016
//Date
//constructor class

public class Date {
	
	private int year;
	private int month;
	private int day;
		
	public Date(int year, int month, int day){ //user input creates new Date and sets year, month, day to given parameters
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	private int calendar(){
		//returns number of days in each month
			
		if(month == 4 || month == 6 || month == 7 || month == 11){
			return 30;			
		}
		else if(month == 1 || month == 3 || month == 5 || month == 8 || month == 9 || month == 10 || month == 12){
			return 31;
		}
		else if(month == 2){
			
			if(isLeapYear() == true){
				return 29;	
			}
		}
		return 28; //if no other condition is met, month is 2 and leap year is false, day count is 28
	}		

	
	public void addDays(int days){
		//moves set date forward in time by given number of days
		
		int dc1 = calendar();//to get days in this.month
		
		if(days > 365){		//need to account for leap years
			
			int yearCt = days/365; //yields total years
			days = days - (yearCt * 365);//subtracts whole years from total days
			
			for(int i = 1; i <= yearCt; i++){//Iterates through years to add, adds years one at a time and checks if any year is a leap year, if leap year, adds 1 day to days
				
				year = year + i; //increases year by 1 until all years from yearCt have been added
				
				if(isLeapYear() == true){ //checks if any year is leap year, if yes, adds 1 to days
					days += 1;
				}
			}
			
		}	
		
		if(days > (dc1 - day)){//if days to move by is greater than days left in month (days in month minus this.day), subtract days left in month from days to add
			
			days = days - (dc1 - day); //days to add minus days left in month, yields days left to add
			
			do{
			
				month = month++; //changes to next month
				dc1 = calendar();//calls calendar to get total days in new month
				days = days - dc1;//removes another month from days to add
			
			}while(days >= dc1);//while days to add is bigger than or equal to days in month
			
		}//if days to move by is less than days left in month, days equals days new Day
			day = days; //new date is d/month/year
			
		
	}
	
	public void addWeeks(int weeks){
		//moves set date forward in time by number of seven-day weeks
				
		int days = (weeks * 7); //multiplies number of weeks by 7 days in week to get number of days to add
		addDays(days); //uses addDays method to calculate date
				
	}
	
	public int daysTo(Date other){
		//takes in new Date object, returns the number of days from set date to new Date
		int dc1 = calendar();//to get dayCt in this.month
		int day2 = other.day;//to get total days in other.month
		
		int count = 0;
		
		if(year == other.year){ //if same year
			
			if(month == other.month){ //if same month
			
				while(day < other.day){
				
					day++; //iterates through until i is equal to other.day, does not increase this.day
					count++; //counts daysTo other.day
			
				}
				
				return count;//returns days from this.day to other .day
			}
			else if(month != other.month){
				
				dc1 = dc1 - day;//total days in month minus current day equals days left in this.month
				
				count = count + dc1; //adds days left in this.month
			
				int m = month;
				m++;
								
				for(int i = m; i < other.month; i++){
				
					month = month++; //goes to next month
					
					dc1 = calendar();//dayCt for new month
					
					count = count + dc1;//adds days for next month to count
					
				}
				count = count + day2; //when months are same, adds in days from other.month to count		
			} return count;
		
		}
		else if(year != other.year){
			
			int yearCt = other.year - year; //yields total years moved
			
			for(int i = 1; i <= yearCt; i++){//Iterates through years to add, adds years one at a time and checks if any year is a leap year, if leap year, adds 1 day to days
				
				year = year + i; //increases year by 1 until all years from yearCt have been added
				
				if(isLeapYear() == true){ //checks if any year is leap year, if yes, adds 1 to days
					day += 1;
				}
			}
			
			if(month == other.month){ //if same month
				
				while(day < other.day){
				
					day++; //iterates through until i is equal to other.day, does not increase this.day
					count++; //counts daysTo other.day
				}
				
				return count;//returns days from this.day to other .day
			}
			else if(month != other.month){
				
				dc1 = dc1 - day;//total days in month minus current day equals days left in this.month
				
				count = count + dc1; //adds days left in this.month
			
				int m = month;
				m++;
								
				for(int i = m; i < other.month; i++){
				
					month = month++; //goes to next month
					
					dc1 = calendar();//dayCt for new month
					
					count = count + dc1;//adds days for next month to count
					
				}
				count = count + day2; //when months are same, adds in days from other.month to count		
			} 
		}return count;
	}
	
	public int getDay(){
		return day;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getYear(){
		return year;
	}
	
	public boolean isLeapYear(){
		//returns true if year is leap year ... divisible by 4, not multiple of 100 unless multiple of 400
		if(year %4 == 0 && year %400 == 0){
			return true;
			
		}return false;
	}
	
	public String toString(){
		//returns string representation of this date in year/month/day order "2006/07/22"
		return year + "/" + month + "/" + year;
	}
	

}
