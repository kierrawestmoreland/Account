package bankAccount;

public class CheckingAccount extends Account{

	public CheckingAccount(int balance, String customerName, String accountNumber, String accountType) {
		super(balance, customerName, accountNumber, accountType);
		this.balance = balance;
		
	}

	public int writeCheck(int checkAmount) {
		if (checkAmount <= balance){
			balance -= checkAmount;
			System.out.println("Your check has been processed. Your pending balance is "+ balance);
		}else{
			System.out.println("Your check has bounced. Please contact merchant.");
		}
		return balance;//is protected so that each of the accounts can access balance
	}

	public int payAFriend(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
