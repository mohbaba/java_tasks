import java.util.Scanner;
import java.util.Random;

public class Guess{

	public static void main(String[] args){
	int i = 0;
	Random randomNumber = new Random();
	int num = randomNumber.nextInt(11);

	while(true){
		Scanner input = new Scanner(System.in);
		System.out.println("Type your number");
		int guess = input.nextInt();
		i++;
		
		if (guess < num){
		System.out.println("Low");
		}
		if (guess > num){
		System.out.println("High");
		}
	
		if(guess == num){
			
			System.out.printf("You tried %d times",i);
			break;
		}





	}
	
	
	
	}



}