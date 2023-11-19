import java.util.Scanner;

public class FeetToMeters{

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a value for feet: ");
	double feet = input.nextDouble();

	double footMeter = 0.305;
	double meters  = feet * footMeter;

	System.out.printf("%.1f feet is %.4f meters",feet,meters);









}












}