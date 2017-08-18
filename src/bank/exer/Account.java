package bank.exer;

public class Account {

	private int id;
	protected double balance;
	private double annualInterestRate;
	public Account(int id,double balance,double annualInterestRate) {
		super();
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterest(){
//		double interest=balance*annualInterestRate;
		return this.annualInterestRate/12;
	}
	
	public void withdraw(double amt){
		if (balance>=amt) {
			System.out.println("取了"+amt+"元");
			System.out.println("余额："+(balance-amt));
		}else {
			System.out.println("余额不足！");
		}
	}
	
	public void deposit(double amt){
		System.out.println("存了"+amt+"元");
		System.out.println("余额："+(balance+amt));
	}
}
