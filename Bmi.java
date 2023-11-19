import java.util.Scanner;

public class Bmi{

	public static void main(String...args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight: ");
	double weight = input.nextDouble();

	System.out.print("Enter height: ");
	double height = input.nextDouble();

	double kilogram = 0.4535;
	double metres = 0.0254;

	double newWeight = weight * kilogram;
	double newHeight = height * metres;
	double newHeightSquared = newHeight * newHeight;
	double bmi = newWeight / newHeightSquared;

	System.out.printf("Your BMI is %.2f",bmi);










}






}