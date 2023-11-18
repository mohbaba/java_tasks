import java.util.Scanner;


public class DayOfWeek{

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter year: ");
	int year = input.nextInt();

	System.out.print("Enter month: 1-12: ");
	int month = input.nextInt();


	System.out.print("Enter the day of the month: 1-31: ");
	int day = input.nextInt();
	
	int calculation1 = 26 * (month + 1)/10;
	int calculation2 = (year % 100 );
	int calculation3 = (year % 100)/4;
	int calculation4 = (year / 100)/4;
	int calculation5 = 5*(year / 100);

	int dayOfWeek = (day + calculation1 + calculation2 + calculation3 + calculation4 + calculation5) % 7;

	if (dayOfWeek == 0){System.out.println("Day of the week is Saturday");}
	if (dayOfWeek == 1){System.out.println("Day of the week is Sunday");}
	if (dayOfWeek == 2){System.out.println("Day of the week is Monday");}
	if (dayOfWeek == 3){System.out.println("Day of the week is Tuesday");}
	if (dayOfWeek == 4){System.out.println("Day of the week is Wednesday");}
	if (dayOfWeek == 5){System.out.println("Day of the week is Thursday");}
	if (dayOfWeek == 6){System.out.println("Day of the week is Friday");}
}







}