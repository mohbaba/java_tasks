import java.util.Random;
import java.util.Scanner;

public class CoinFlipper{

	public static void main(String[]args){

	Random randomBool = new Random();
	Scanner scanner = new Scanner(System.in);

	int coinFlip = randomBool.nextInt(2);
		

	System.out.print("Enter a guess, head = 0 or tail = 1: ");
	int guess = scanner.nextInt();
	
	

	if((coinFlip == 0) && guess == 0 ){ System.out.println("Correct"); }
	if((coinFlip == 1) && guess == 0 ){ System.out.print("Incorrect");}
	if((coinFlip == 1) && guess == 1){ System.out.print("Correct"); }
	if((coinFlip == 0) && guess == 1){ System.out.print("Incorrect");}
	







}










}
