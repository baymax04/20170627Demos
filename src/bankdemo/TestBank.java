package bankdemo;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer=new Customer("Jane", "Smith");

		Account a=new Account(1000,2000,0.0123);
	
		customer.setAccount(a);
		customer.getAccount().deposit(100);
		customer.getAccount().withdraw(960);
		customer.getAccount().withdraw(2000);
	
		System.out.println("customer["+customer.getFirstName()+
				customer.getLastName()+"\tbalanc:"+customer.getAccount().getBalance());
	
	}

}
