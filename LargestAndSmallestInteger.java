 import java.util.Scanner;

public class Compare{

public static void main(String[] args){

	System.out.println("Enter first number: ");
	Scanner scanner = new Scanner(System.in);
	
	int num1 = scanner.nextInt();
	System.out.println("Enter second number: ");
	
	int num2 = scanner.nextInt();
	System.out.println("Enter third number");
	int num3 = scanner.nextInt();

	System.out.println("Enter fourth number: ");
	int num4 = scanner.nextInt();

	System.out.println("Enter fifth number");
	int num5 = scanner.nextInt();
	int largest = 0;
	int smallest = num1;
	if (num1 > largest){
	largest = num1;
	}
	if (num2 > largest){
	largest = num2;
	}
	if(num3 > largest){
	largest = num3;
	}
	if(num4 > largest){
	largest = num4;
	}
	if(num5 > largest){
	largest = num5;
	}
	if(num2 < smallest){
	smallest = num2;
	}
	if(num3 < smallest){
	smallest = num3;
	}
	if(num4 < smallest){
	smallest = num4;
	}
	if(num5 < smallest){
	smallest = num5;
	}
	System.out.printf("The largest number is %d%n",largest);
	System.out.printf("The smallest number is %d",smallest);

	

}



}