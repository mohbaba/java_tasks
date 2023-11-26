public class HeartRates{
	
	private String firstName;
	private String lastName;
	//private String dateOfBirth;
	private String month;  
	private int day;
	private int yearOfBirth; 


	public HeartRates(String firstName, String lastName, String month, int day, int yearOfBirth){

		this.firstName = firstName;
		this.lastName = lastName;
		//this.dateOfBirth = dateOfBirth;
		this.month = month;  
		this.day = day;
		this.yearOfBirth = yearOfBirth;
	
	
	}


	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	/**public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth = dateOfBirth; 
	}

	public String getDateOfBirth(){
		return dateOfBirth;
	} */
 
	public void setMonth(String month){
		this.month = month;
	}

	public String getMonth(){
		return month;
	}

	public void setDay(int day){
		this.day = day;
	}

	public int getDay(){
		return day;
	}

	public void setYearOfBirth(int yearOfBirth){
		this.yearOfBirth = yearOfBirth;
	}

	public int getYearOfBirth(){
		return yearOfBirth;
	}

	
	public int age(){
		return 2023 - yearOfBirth;
		
	}

	public double getMaxHeartRate(){
		return 220 - age();
	
	}

	public double getMinTargetHeartRate(){
		return 0.50 * getMaxHeartRate();
	}

	public double getMaxTargetHeartRate(){
		return 0.85 * getMaxHeartRate();
	}


	



}