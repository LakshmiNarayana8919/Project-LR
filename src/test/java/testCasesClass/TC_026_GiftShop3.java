package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.GiftShop;

public class TC_026_GiftShop3 extends Base1{
	
	
	
	@Test
	public void goldenpothos() throws InterruptedException {
		GiftShop gs=new GiftShop(driver);
		Thread.sleep(3000);
		gs.godenpothosplantingiftshop();
		log.info("Click action successful in gift shop golden pothos  plant");
	}

}
