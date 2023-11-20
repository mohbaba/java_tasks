import java.util.Scanner;

public class ComparingIntegers{

	public static void main(String[]args){
	
	Scanner getInput = new Scanner(System.in);

	System.out.println("Enter one integer");
	int num = getInput.nextInt();

	int square = num * num;


	if(num > 100 ){System.out.printf("%d is greater than 100 %n", num);}
	if(num < 100 ){System.out.printf("%d is less than 100%n", num);}
	if(num == 100){System.out.printf("%d is equal to 100%n",num);}
	if(num != 100){System.out.printf("%d is not equal to 100%n%n",num);}



	if(square > 100 ){System.out.printf("%d is greater than 100 %n", square);}
	if(square < 100 ){System.out.printf("%d is less than 100%n", square);}
	if(square == 100){System.out.printf("%d is equal to 100%n",square);}
	if(square != 100){System.out.printf("%d is not equal to 100%n",square);}

	

}





}