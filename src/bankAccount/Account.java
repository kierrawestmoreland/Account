package bankAccount;

public class Account {

	protected int balance;
	private String customerName;
	private String accountNumber;
	private String accountType;
	
	
	public Account(int balance, String customerName, String accountNumber, String accountType) {
		this.balance = 100; //bank promo - receive $100 when opening up account
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.accountType= accountType;
	}

	public int getBalance() {
		return balance;
	}

	public int deposit(int transaction) {
		balance += transaction;
		System.out.println("Your balance is now "+ balance);
		return balance;
	}

	public int withdraw(int transaction) {
		
		if (balance >= transaction){
			balance -= transaction;
			System.out.println("Your remaining balance is "+ balance);
		}else{
			System.out.println("Please withdraw amount less than or equal to available balance of "+ balance);
		}
		
		return balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int sendToSavings(int transaction) {
		balance -= transaction;
		return balance;
	}


}
