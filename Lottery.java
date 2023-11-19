import java.util.Scanner;
import java.util.Random;

public class Lottery{

	public static void main(String...args){

	Scanner scanner = new Scanner(System.in);
	Random randomNumber = new Random();

	int random = randomNumber.nextInt(999);

	

	int randomNum1 = random / 100;
	int result = random - (randomNum1 * 100);
	int randomNum2 = result / 10;
	int randomNum3 = result - (randomNum2 * 10);

	


	System.out.print("Enter a 3  digit number: ");
	int userGuess = scanner.nextInt();


	int userGuessNum1 = userGuess / 100;
	int result1 = userGuess - (userGuessNum1 * 100);
	int userGuessNum2 = result1 / 10;
	int userGuessNum3 = result1 - (userGuessNum2 * 10);



	if(userGuess == random)
	{System.out.print("Congratulations you have won $10,000");}

	

	else
	
	if(((randomNum1 == userGuessNum1) || (randomNum1 == userGuessNum2) || (randomNum1 == userGuessNum3)) &&
	 ((randomNum2 == userGuessNum1) || (randomNum2 == userGuessNum2) || (randomNum2 == userGuessNum3)) && 
	(randomNum3 == userGuessNum1) || (randomNum3 == userGuessNum2) || (randomNum3 == userGuessNum3))
	{System.out.print("Congratulations you have won $3,000");}

	else

	if(((randomNum1 == userGuessNum1) || (randomNum1 == userGuessNum2) || (randomNum1 == userGuessNum3)) ||
 	((randomNum2 == userGuessNum1) || (randomNum2 == userGuessNum2) || (randomNum2 == userGuessNum3)) ||
	((randomNum3 == userGuessNum1) || (randomNum3 == userGuessNum2) || (randomNum3 == userGuessNum3)))
	{System.out.print("Congratulations you have won $1,000");}

	
	else

	if(((randomNum1 != userGuessNum1) || (randomNum1 != userGuessNum2) || (randomNum1 != userGuessNum3)) ||
 	((randomNum2 != userGuessNum1) || (randomNum2 != userGuessNum2) || (randomNum2 != userGuessNum3)) ||
	((randomNum3 != userGuessNum1) || (randomNum3 != userGuessNum2) || (randomNum3 != userGuessNum3)))
	{System.out.print("Sorry, Try again");}



}

}