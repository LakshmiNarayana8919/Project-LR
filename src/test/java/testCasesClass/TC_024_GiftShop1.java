package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.GiftShop;

public class TC_024_GiftShop1 extends Base1{

	
	 @Test
	public void getstarted1() throws InterruptedException {
		GiftShop gs=new GiftShop(driver);
		Thread.sleep(3000);
		gs.clickgetstarted();
		log.info("Click action successful in gift shop feature");
	}
}
