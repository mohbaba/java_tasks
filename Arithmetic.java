import java.util.Scanner;

public class Arithmetic{

	public static void main(String[] args){
	Scanner inputNum = new Scanner(System.in);

	System.out.println("Enter First number");
	int num1 = inputNum.nextInt();

	System.out.println("Enter Second number");
	int num2 = inputNum.nextInt();

	int num1Square = num1 * num1;
	int num2Square = num2 * num2; 

	int squareSum = num1Square + num2Square;
	int squareDiff = num1Square - num2Square;
	
	System.out.printf("The square of the first number is %d and the square of the second number is %d ", num1Square ,num2Square );

	System.out.printf("The difference of the squares is %d", squareDiff );
	
	


	}


}