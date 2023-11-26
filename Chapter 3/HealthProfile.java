import java.util.Calendar;

public class HealthProfile{

	private String firstName;
	private String lastName;
	private String monthOfBirth;  
	private int dayOfBirth;
	private int yearOfBirth;
	private double height;
	private double weight;


	public HealthProfile(){
	
	}

	public HealthProfile(String firstName, String lastName, String monthOfBirth, int dayOfBirth, int yearOfBirth){
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthOfBirth = monthOfBirth;
		this.dayOfBirth = dayOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.height = height;
		this.weight = weight;
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

	public void setMonthOfBirth(String monthOfBirth){
		this.monthOfBirth = monthOfBirth;
	}


	public String getMonthOfBirth(){
		return monthOfBirth;
	}

	public void setDayOfBirth(int dayOfBirth){
		this.dayOfBirth = dayOfBirth;
	}

	public int getDayOfBirth(){
		return dayOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth){
		this.yearOfBirth = yearOfBirth;
	}
	
	
	public int getYearOfBirth(){
		return yearOfBirth;
	}

	public void setHeight(double height){
		this.height = height;
	}

	public double getHeight(){
		return height;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}

	public double getWeight(){
		return weight;
	} 

	int year = Year.now().getValue();
 	public int age(){
		return  year - getYearOfBirth();
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