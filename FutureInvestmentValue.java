import java.util.Scanner;

public class FutureInvestmentValue{

public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter investment amount: ");
	double investmentAmount = input.nextDouble();


	System.out.print("Enter annual interest rate in percentage: ");
	double annualInterestRate = input.nextDouble();

	double monthlyInterestRate = ((annualInterestRate)/100) / 12;

	System.out.print("Enter number of years: ");
	double years = input.nextDouble();


	double accumulatedValue = investmentAmount * Math.pow((1 + monthlyInterestRate),(years * 12));
	
	System.out.printf("Accumulated value is $%.2f",accumulatedValue);
	

}















}