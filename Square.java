import java.util.Scanner;

public class Square{

	public static void main(String[] args){
	Scanner inputNum = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = inputNum.nextInt();
	int square = num * num;
	int result = num * square; 
	if( result > 100){
	System.out.printf("The %d and %d is greater than 100", num ,square );
	}
	if( result == 100){
	System.out.printf("The %d and %d is equal to 100", num , square);
	}
	if( result < 100){
	System.out.printf("The %d and %d is less than 100", num, square);
	}
	


	}


}