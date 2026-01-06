package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.Header1;


public class TC_004Account extends Base1{

	@Test
	public void clickaccount() throws InterruptedException {
		Header1 l=new Header1(driver);
		l.clickaccount();
		Thread.sleep(3000);
		l.enteremail();
		Thread.sleep(3000);
		l.clickcheckboxemail();
		Thread.sleep(3000);
//		l.clicksignupbutton();
//		Thread.sleep(3000);
		l.clickorders();
		Thread.sleep(3000);
		l.clickprofile();
		Thread.sleep(3000);
		l.clickforyou();
		Thread.sleep(3000);
		
		l.clicksignupbutton();
		Thread.sleep(3000);
		l.havingissues();
		Thread.sleep(3000);
		
		l.privacypolicy();
		Thread.sleep(9000);
		//l.clickimgtextlivelyroot();
//		l.clickplantgifts();
//		Thread.sleep(3000);
//		l.clickallplants();
//		Thread.sleep(3000);
//		l.clickRecentlyviewimg1();
//		Thread.sleep(3000);
	}
	
}
