import java.util.Scanner;

public class Positive{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter first number");
	int num1 = scanner.nextInt();

	System.out.println("Enter second number");
	int num2 = scanner.nextInt();

	System.out.println("Enter third number");
	int num3 = scanner.nextInt();

	System.out.println("Enter fourth number");
	int num4 = scanner.nextInt();

	System.out.println("Enter fifth number");
	int num5 = scanner.nextInt();
	
	
	int positive = 0;
	int negative = 0;
	int zero = 0;

	if(num1 > 0 ){positive = positive + 1;}
	if(num1 < 0 ){negative += 1;}
	if(num1 == 0){zero +=1;}

	if(num2 > 0 ){positive += 1;}
	if(num2 < 0 ){negative += 1;}
	if(num2 == 0 ){zero += 1;}

	if(num3 > 0 ){positive += 1;};
	if(num3 < 0 ){negative += 1;};
	if(num3 == 0 ){zero += 1;};

	if(num4 > 0 ){positive += 1;};
	if(num4 < 0 ){negative += 1;};
	if(num4 == 0 ){zero += 1;};

	if(num5 > 0 ){positive += 1;};
	if(num5 < 0 ){negative += 1;};
	if(num5 == 0 ){zero += 1;};

	System.out.printf("Number of positive numbers=%d%n",positive);
	System.out.printf("Number of negative numbers=%d%n",negative);
	System.out.printf("Number of zeros=%d%n",zero);

}







}