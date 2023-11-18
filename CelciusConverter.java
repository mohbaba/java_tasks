import java.util.Scanner;

public class  CelciusConverter{

	public static void main(String[]args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.printf("Enter degree in celcius: %n");
	double celcius = scanner.nextDouble();

	double fahrenheit = (9.0/5) * celcius + 32;
	
	System.out.printf("The %S %f in fahrenheit is %f","value",celcius,fahrenheit);
}



}