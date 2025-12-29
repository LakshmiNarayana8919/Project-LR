package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.Header1;
import pageObjectClass.HomePage2;

public class TC_010ViewAllShopHolidayDecor extends Base1{
    @Test
	public void viewallshopholiday() throws InterruptedException {
		HomePage2 hp2=new HomePage2(driver);
		hp2.Viewallshopdecor();
		
		Thread.sleep(5000);
		Header1 l=new Header1(driver);
		l.clickimgtextlivelyroot();
	}
}
