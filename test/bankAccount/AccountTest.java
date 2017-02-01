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
		Assert.assertEquals(account, 100); 
	}
	
	@Test
	public void shouldDepositAmount(){
		int deposit = (int) underTest.deposit(100);
		Assert.assertEquals(deposit, 200);
	}
	
	@Test
	public void shouldWithdrawAmount(){
		int withdraw = (int) underTest.withdraw(50);
		Assert.assertEquals(withdraw, 50);
	}
	
	@Test 
	public void shouldntWithdrawMoreThanAvailableBalance(){
		int withdraw = (int) underTest.withdraw(50);
		Assert.assertTrue(50 >= withdraw);
	}
	
	@Test
	public void shouldReturnCustomerName(){
		String customerName = underTest.getCustomerName();
		Assert.assertEquals(customerName, "Kierra");
	}
	
	@Test
	public void shouldReturnAccountTypeAndNumber(){
		String accountNumber = underTest.getAccountNumber();
		Assert.assertEquals(accountNumber, "12345");
		String accountType = underTest.getAccountType();
		Assert.assertEquals(accountType, "checking");
		
	}
}
