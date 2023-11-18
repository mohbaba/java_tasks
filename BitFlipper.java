import java.util.Scanner;


public class BitFlipper{

public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number 0 or 1");
	int num = scanner.nextInt();
	System.out.println("The character equivalent of A is "+ (int)'A');

	if( num == 0){
	System.out.print(1);

	}
	if( num == 1){
	System.out.print(0);
	}


}



}