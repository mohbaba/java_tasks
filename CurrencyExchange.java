import java.util.Scanner;

public class CurrencyExchange{

	public static void main(String[]args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter exchange rate from dollar to RMB: ");
	double exchangeRate =  scanner.nextDouble();

	System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
	int userInput = scanner.nextInt();
	
	
	
	if(userInput == 0){
	System.out.print("Enter the dollar amount: ");
	double dollarAmount = scanner.nextDouble();

	double result = dollarAmount * exchangeRate;
	System.out.printf("$%.1f is %.1f yuan%n",dollarAmount,result);
	}
	
	if(userInput == 1){
	System.out.print("Enter the RMB amount: ");
	double rmbAmount = scanner.nextDouble();

	double result = rmbAmount / exchangeRate;
	System.out.printf("%.1f yuan is $%.2f %n",rmbAmount,result);
	}

	





}









}