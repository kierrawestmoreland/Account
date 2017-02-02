package bankAccount;

public class Main {

	public static void main(String[] args) {
		CheckingAccount checking = new CheckingAccount(120, "Kierra", "11111", "Checking");
		SavingAccount savings = new SavingAccount(100, "Kierra", "22222", "Savings");
		Credit credit = new Credit(100, "Kierra", "33333", "Credit");
		
		checking.sendToSavings(20);
		
	}
}
