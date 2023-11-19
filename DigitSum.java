import java.util.Scanner;

public class DigitSum{

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number between 0 and 1000: ");
	int number = input.nextInt();


	int num1 = number / 100;
	int result = number - (num1 * 100);
	int num2 = result / 10;
	int num3 = result - (num2 * 10);

	int sum = num1 + num2 + num3;

	System.out.printf("The sum of the digits is %d",sum);



















}













}