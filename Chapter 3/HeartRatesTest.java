import java.util.Scanner;

public class HeartRatesTest{

	public static void main(String[]args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter Patients first name: ");
	String firstName = scanner.nextLine();
	
	System.out.print("Enter Patients last name: ");
	String lastName = scanner.nextLine();

	System.out.print("Enter Patients month birth: ");
	String birthMonth = scanner.nextLine();

	System.out.print("Enter Patients birth day: ");
	int birthDay = scanner.nextInt();

	System.out.print("Enter Patients birth year: ");
	int birthYear = scanner.nextInt();

	HeartRates heartRates = new HeartRates(firstName,lastName, birthMonth, birthDay , birthYear); 

	System.out.printf("The name of the patient is %s %s%n",heartRates.getFirstName() , heartRates.getLastName());

	System.out.printf("The patient was born on %d/%s/%d%n",heartRates.getDay(), heartRates.getMonth(),heartRates.getYearOfBirth());
	
	System.out.printf("The is patient is %d years old %n",heartRates.age());
	
	System.out.printf("The patient's maximum heart rate is %.0f%n ",heartRates.getMaxHeartRate());


	System.out.printf("The minimum target heart rate is %.2f%n",heartRates.getMinTargetHeartRate());

	System.out.printf("The maximum target heart rate range is %.2f%n",heartRates.getMaxTargetHeartRate());


}

}