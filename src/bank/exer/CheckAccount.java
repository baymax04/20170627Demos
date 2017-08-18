package bank.exer;

public class CheckAccount extends Account{

	private double overdraft;
	
	public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft=overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amt) {
		if (amt<=balance) {
			balance-=amt;
		}else {
			
			if (overdraft>=amt-balance) {
			
				overdraft-=(amt-balance);
				setBalance(0);
			}else {
				System.out.println("³¬³öÍ¸Ö§½ð¶î");
			}
		}
	}
}
