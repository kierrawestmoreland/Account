package bankAccount;

import org.junit.Assert;
import org.junit.Test;

public class SavingAccountTest {

	@Test
	public void shouldSaveMoneyFromChecking(){
		SavingAccount underTest = new SavingAccount(50, "Kierra", "22222", "Checking");
		int savingBalanceAfterSaving = underTest.sendToSavings(100);
		Assert.assertEquals(200, savingBalanceAfterSaving);
	}
}
