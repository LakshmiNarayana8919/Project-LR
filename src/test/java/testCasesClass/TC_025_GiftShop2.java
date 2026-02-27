package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.GiftShop;

public class TC_025_GiftShop2 extends Base1 {
	
	
	
	@Test
	public void clickonmoneytreeplant() throws InterruptedException {
		GiftShop gs=new GiftShop(driver);
		Thread.sleep(3000);
		gs.calathearattlesnakeplantingiftshop();
		log.info("Click action successful in gift shop moneytree plant");
	}

}
