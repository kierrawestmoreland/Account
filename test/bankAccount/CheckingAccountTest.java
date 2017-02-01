package bankAccount;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest {

	CheckingAccount underTest;
	
	@Before
	public void setUp(){
		underTest = new CheckingAccount(120, "Kierra", "11111", "Checking");
	}
	
	@Test
	public void shouldDecreaseBalanceByWritingCheck(){
		int remainingBalance = (int) underTest.writeCheck(20);
		Assert.assertEquals(remainingBalance, 100);
	}
	
	@Test
	public void shouldSendFriendMoney(){
		int remainingBalance = (int) underTest.payAFriend(50);
		Assert.assertEquals(remainingBalance, 70);
	}
}
