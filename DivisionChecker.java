import java.util.Scanner;


public class DivisionChecker{

	public static void main(String[]args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter an integer: ");
	
	int number = scanner.nextInt();
	boolean seeker = false;
	if(number % 5 == 0 && number % 6 == 0){
		seeker = true; 
		System.out.printf("Is %d divisible by 5 and 6? %b%n",number,seeker);
		} 
		

	if(number % 5 != 0 || number % 6 != 0){
		seeker = false; 
		
		}
		
	
	if(number % 5 !=0 ^ number % 6 != 0){
		seeker = true;
		
		}



		
		System.out.printf("Is %d divisible by 5 or 6? %b%n",number,seeker);
		System.out.printf("Is %d divisible by 5 or 6, but not both? %b%n",number,seeker);



}










}