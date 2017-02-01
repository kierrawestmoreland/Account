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

	public int wireAFriend(String command, int transaction) {
		if (command == "send money"){
			balance -= transaction;
			System.out.println("You'll receive a notification once your request to send $" + transaction + " is complete. Thank you for using WireAFriend.");
		}else if(command == "request money"){
			balance += transaction;
			System.out.println("You'll receive a notification once your request to receive $" + transaction + " is complete. Thank you for using WireAFriend.");
		}else{
			System.out.println("Please enter in a valid command. \"send money\" to send money or \"request money\" to request to receive money.");
		}
		return balance;
	}
	
	

}
