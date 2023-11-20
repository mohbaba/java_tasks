import java.util.Scanner;

public class DiameterCircumferenceAreaCircle{

	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);

	double pi = 3.14159;
	
	System.out.println("Enter radius of circle");
	double radius = scanner.nextDouble();

	

	System.out.printf("The diameter of the cirlce is %f%n", 2*radius);
	System.out.printf("The circumference of the circle is %f%n", 2*radius*pi);
	System.out.printf("The area of the circle is %f%n", pi*radius*radius);
	







}








}