import java.util.Scanner;

public class PoundsToKilo{
public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number in pounds: ");
	double pounds = input.nextDouble();

	double kilogram = 0.454;
	double result = pounds * kilogram;

	System.out.printf("%.1f pounds is %.3f kilograms",pounds, result);
	
			







}

}