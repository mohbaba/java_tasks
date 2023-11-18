import java.util.Scanner;

public class PerimeterOfTriangle{

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter side a: ");
	int sideA = input.nextInt();

	System.out.println("Enter side b: ");
	int sideB = input.nextInt();

	System.out.println("Enter side c: ");
	int sideC = input.nextInt();

	int perimeter = sideA + sideB + sideC;	

	if(sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB){System.out.printf("The perimeter is %d",perimeter );}

	if(sideA + sideB <= sideC || sideB + sideC <= sideA || sideC + sideA <= sideB ){System.out.println("Input is invalid" );}












}











}