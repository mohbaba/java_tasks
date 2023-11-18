
import java.util.Scanner;

public class Multiples{
	
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int num1 = input.nextInt();

	System.out.println("Enter second number");
	int num2 = input.nextInt();

	int num1Trip = num1 *3;
	int num2Dub = num2 *2;

	if(num2Dub % num1Trip == 0){System.out.printf("%d is a multiple of %d", num1Trip, num2Dub);}
	if(num2Dub % num1Trip != 0){System.out.printf("%d is not a multiple of %d", num1Trip, num2Dub);}





}







}