import java.util.Scanner;

public class AccountClassTest{

	public static void main(String[]args){

	Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome to Maverick Bank ");

	System.out.println("Enter your id: ");
	int id = scanner.nextInt();

	System.out.println("Enter your initial balance: ");
	double balance = scanner.nextDouble();

	System.out.println("Enter annual interest rate: ");
	double annualInterestRate = scanner.nextDouble();
	

	System.out.println("Enter date created: ");
	String dateCreated = scanner.next();


	AccountClass account = new AccountClass(id,balance);

	account.setAnnualInterestRate(annualInterestRate);
	System.out.println("Would you like to withdraw?, yes or no ");
	String withdrawAnswer = scanner.next();

	if(withdrawAnswer.equals("yes")){
		System.out.println("Enter withdraw amount: ");
		double amount = scanner.nextDouble();
		account.withdraw(amount);


		if(account.getBalance() < amount){

			System.out.println("Would you like to deposit?, yes or no");
			String depositAnswer = scanner.next();

	if(depositAnswer.equals("yes")){
		System.out.println("Enter deposit amount: ");
		double depositAmount = scanner.nextDouble();
		account.deposit(depositAmount);
		System.out.printf("Your new balance is %.3f%n ",account.getBalance());
		System.out.println();
		System.out.printf("Your monthly interest is %.3f%n", account.getMonthlyInterest());
		}

if(depositAnswer.equals("no")){
		System.out.printf("Your new balance is %.3f%n ",account.getBalance());
		System.out.println();
		System.out.printf("Your monthly interest is %.3f%n", account.getMonthlyInterest());
		}
	
		}
		
		System.out.println("Would you like to deposit?, yes or no");
			String depositAnswer = scanner.next();

	if(depositAnswer.equals("yes")){
		System.out.println("Enter deposit amount: ");
		double depositAmount = scanner.nextDouble();
		account.deposit(depositAmount);
		System.out.printf("Your new balance is %.3f%n ",account.getBalance());
		System.out.println();
		System.out.printf("Your monthly interest is %.3f%n", account.getMonthlyInterest());
		}

	if(depositAnswer.equals("no")){
		System.out.printf("Your new balance is %.3f%n ",account.getBalance());
		System.out.println();
		System.out.printf("Your monthly interest is %.3f%n", account.getMonthlyInterest());
		}

		System.out.printf("Your new balance is %.3f%n ",account.getBalance());
	}
	

	if(withdrawAnswer.equals("no")){

		System.out.println("Would you like to deposit?, yes or no");
		String depositAnswer = scanner.next();

	if(depositAnswer.equals("yes")){
		System.out.println("Enter deposit amount: ");
		double depositAmount = scanner.nextDouble();
		account.deposit(depositAmount);
		System.out.printf("Your new balance is %.3f%n ",account.getBalance());
		System.out.println();
		System.out.printf("Your monthly interest is %.3f%n", account.getMonthlyInterest());
		}

	if(depositAnswer.equals("no")){
		System.out.printf("Your new balance is %.3f%n ",account.getBalance());
		System.out.println();
		System.out.printf("Your monthly interest is %.3f%n", account.getMonthlyInterest());
		}





	}

	System.out.println("Thank you for banking with us");
	
















}



















}