package bankAccount;

public class SavingAccount extends Account{

	protected static int savingsBalance;
	
	public SavingAccount(int balance, String customerName, String accountNumber, String accountType) {
		super(balance, "Kierra", accountNumber, "Savings");
		savingsBalance = balance;
	}
	
	public static int addToSavings(int transaction){
		savingsBalance += transaction;
		System.out.println("Your savings account balance is $" + savingsBalance);
		return savingsBalance;
	}
	
	@Override
	public int withdraw(int transaction) {
		savingsBalance -= transaction;
		System.out.println("Your savings account balance is now $" + savingsBalance);
		return savingsBalance;
	}
	
	public void payCreditBill(int transaction){
		savingsBalance -= transaction;
		System.out.println("Your savings account balance is now $" + savingsBalance);
		Credit.creditBillPaid(transaction);
	}

}
