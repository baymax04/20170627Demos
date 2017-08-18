package bank.exer;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account=new Account(1122, 20000, 0.045);
		account.withdraw(30000);
		System.out.println("Óà¶î£º"+account.getBalance());
		
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Óà¶î£º"+account.getBalance()+
				"ÔÂÀûÂÊ£º"+account.getMonthlyInterest());
	}

}
