package bankAccount;

public class Credit extends Account{

	protected static int creditBalance;
	
	public Credit(int balance, String customerName, String accountNumber, String accountType) {
		super(balance, customerName, accountNumber, accountType);
		creditBalance = balance;
	}
	
	public static int creditBillPaid(int transaction){
		creditBalance -= transaction;
		System.out.println("Your credit balance is now $" + creditBalance);
		return creditBalance;
	}
	
	public int buyWithCredit(int transaction){
		creditBalance += transaction;
		System.out.println("Your credit balance is now $" + creditBalance);
		return creditBalance;
	}
	
	
}
