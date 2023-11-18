import java.util.Scanner;

public class DayChecker{

	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number between 1 and 12: ");
	int month = input.nextInt();

	System.out.print("Enter any year: ");
	int year = input.nextInt();



	if(month == 1){System.out.printf("January %d had 31 days%n",year);}
	if(month == 2 && year % 4 !=0){System.out.printf("February %d had 28 days%n",year);}
	if(month == 2 && year % 4 ==0){System.out.printf("February %d had 29 days%n",year);}
	if(month == 3){System.out.printf("March %d had 31 days%n",year);}
	if(month == 4){System.out.printf("April %d had 30 days%n",year);}
	if(month == 5){System.out.printf("May %d had 31 days%n",year);}
	if(month == 6){System.out.printf("June %d had 30 days%n",year);}
	if(month == 7){System.out.printf("July %d had 31 days%n",year);}
	if(month == 8){System.out.printf("August %d had 31 days%n",year);}
	if(month == 9){System.out.printf("September %d had 30 days%n",year);}
	if(month == 10){System.out.printf("October %d had 31 days%n",year);}
	if(month == 11){System.out.printf("November %d had 30 days%n",year);}
	if(month == 12){System.out.printf("December %d had 31 days",year);}




}



}