import java.util.Scanner;

public class SeparatingDigitsInteger{

	public static void main(String[]args){
	Scanner input = new Scanner(System.in);	

	System.out.print("Enter a five digit number: ");
	int number = input.nextInt();

	int num1 = number / 10000;
	int number2 = number % 10000;
	int num2 = number2 / 1000;
	int number3 = number2 % 1000;
	int num3 = number3 / 100;
	int number4 = number3 % 100; 
	int num4 = number4 / 10;
	int num5 = number4 % 10;

	System.out.printf("%d   %d   %d   %d   %d ",num1,num2,num3,num4,num5);
















}












}