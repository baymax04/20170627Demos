package bank.exer;

public class TestAccount2 {

	public static void main(String[] args) {

		CheckAccount ca=new CheckAccount(1122, 20000, 0.045, 5000);
		ca.withdraw(5000);
		System.out.println("��"+ca.getBalance()+"��͸֧��"+ca.getOverdraft());
		
		System.out.println("-------------------");
		ca.withdraw(18000);
		System.out.println("��"+ca.getBalance()+"��͸֧��"+ca.getOverdraft());
		
		System.out.println("-------------------");
		ca.withdraw(3000);
		System.out.println("��"+ca.getBalance()+"��͸֧��"+ca.getOverdraft());
		
		
		
		
	}

}
