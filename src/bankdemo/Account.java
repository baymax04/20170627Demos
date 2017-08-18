package bankdemo;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account(int id,double balance,double annualInterestRate){
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
	
	public void withdraw(double amt){
		if (balance>=amt) {
			System.out.println("ȡ������(balance-amt):"+(balance=amt));
		}else {
			System.out.println("�˻����㣡");
		}
	}
	
	public void deposit(double amt){
		System.out.println("�������(balance+amt):"+(balance+amt));
	}
}
