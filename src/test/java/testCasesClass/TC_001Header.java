package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.Header1;

public class TC_001Header extends Base1 {

	@Test
	public void clickheader() throws InterruptedException {
		Header1 l=new Header1(driver);
		l.clickonNewSmartWateringPlantsAdded();
		
		l.clickonHappinessGuarantee();
		
		Thread.sleep(3000);
		//l.clickonsearchbutton();
	}
}
