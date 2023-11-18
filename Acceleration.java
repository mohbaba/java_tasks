import java.util.Scanner;

public class Acceleration{

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Initial Velocity: ");
		double initialVelocity = scanner.nextDouble();
		
		System.out.println("Enter Final Velocity: ");
		double finalVelocity = scanner.nextDouble();

		System.out.println("Enter the time taken: ");
		double time = scanner.nextDouble();


		double acceleration = (finalVelocity - initialVelocity)/time;

		System.out.printf("The average acceleration is %f", acceleration);




	}







}