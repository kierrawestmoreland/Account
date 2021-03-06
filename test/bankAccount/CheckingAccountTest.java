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
		Assert.assertEquals(100, remainingBalance);
	}
	
	@Test
	public void shouldSendFriendMoney(){
		int remainingBalance = (int) underTest.wireAFriend("send money", 50);
		Assert.assertEquals(70, remainingBalance);
	}
	
	@Test
	public void shouldReceiveMoneyFromFriend(){
		int remainingBalance = (int) underTest.wireAFriend("request money", 50);
		Assert.assertEquals(170, remainingBalance);
	}
}
