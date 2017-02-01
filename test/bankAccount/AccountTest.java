package bankAccount;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	Account underTest;
	
	@Before 
	public void setUp(){
		underTest = new Account(0, "Kierra", "12345", "checking");
	}
	
	@Test
	public void shouldReturnBalance(){
		int account = (int) underTest.getBalance();
		Assert.assertEquals(100, account); 
	}
	
	@Test
	public void shouldDepositAmount(){
		int deposit = (int) underTest.deposit(100);
		Assert.assertEquals(200, deposit);
	}
	
	@Test
	public void shouldWithdrawAmount(){
		int withdraw = (int) underTest.withdraw(50);
		Assert.assertEquals(50, withdraw);
	}
	
	@Test 
	public void shouldntWithdrawMoreThanAvailableBalance(){
		int withdraw = (int) underTest.withdraw(50);
		Assert.assertTrue(50 >= withdraw);
	}
	
	@Test
	public void shouldReturnCustomerName(){
		String customerName = underTest.getCustomerName();
		Assert.assertEquals("Kierra", customerName);
	}
	
	@Test
	public void shouldReturnAccountTypeAndNumber(){
		String accountNumber = underTest.getAccountNumber();
		Assert.assertEquals("12345", accountNumber);
		String accountType = underTest.getAccountType();
		Assert.assertEquals("checking", accountType);
		
	}
}
