import java.util.Scanner;

public class SortThreeIntegers{

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int num1 = input.nextInt();	

	System.out.print("Enter second number: ");
	int num2 = input.nextInt();

	System.out.print("Enter third number: ");
	int num3 = input.nextInt();	

	int largest = 0;
	int smallest = num1 ;
	int middle = 0; 

	

	if(num1 > largest){largest = num1;}
	if(num2 > largest){largest = num2;}
	if(num3 > largest){largest = num3;}

	     

	if(num1 < smallest){smallest = num1;}
	if(num2 < smallest){smallest = num2;}
	if(num3 < smallest){smallest = num3;}

	


	if(num1 != largest && num1 != smallest){middle = num1;}
	if(num2 != largest && num2 != smallest){middle = num2;}
	if(num3 != largest && num3 != smallest){middle = num3;}

	System.out.printf("%d,%d,%d",smallest,middle,largest);












}









}