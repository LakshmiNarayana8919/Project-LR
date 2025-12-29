package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.Header1;

public class TC_006DropdownGiftsplants extends Base1{

	@Test
	public void giftplants() throws InterruptedException {
		Header1 l=new Header1(driver);
		Thread.sleep(3000);
		l.giftsdropdown();
		
	}
	
	
}
