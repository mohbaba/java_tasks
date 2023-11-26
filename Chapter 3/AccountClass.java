public class AccountClass{

	private int id;
	private double balance;
	private double annualInterestRate;
	private String dateCreated;


	public AccountClass(){
	}

	public AccountClass(int id, double balance){
		this.id = id;
		this.balance = balance;
		
	} 

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setBalance(int balance){
		this.balance = balance;
	}

	public double getBalance(){
		return balance; 
	}
	

	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}

	public double getAnnualInterestRate(){
		return annualInterestRate;
	}

	public String getDateCreated(){
		return dateCreated;
	}

	public double getMonthlyInterestRate(){
		return annualInterestRate / 1200;
	}
		

	public double getMonthlyInterest(){
		return balance * (annualInterestRate / 1200);
	}
	
	public void withdraw(double amount){
		if(amount > balance){
		System.out.println("Withdraw amount exceeded balance");
		System.out.println();
		}

		if(amount <= balance){
		balance = balance - amount;
		System.out.println("Withdrawal successful!");
		System.out.println();
		}
	}

	public void deposit(double amount){
		balance = balance + amount;
	}


}