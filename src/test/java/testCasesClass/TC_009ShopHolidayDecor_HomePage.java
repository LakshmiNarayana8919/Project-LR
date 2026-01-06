package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.HomePage2;

public class TC_009ShopHolidayDecor_HomePage extends Base1{

	@Test
	public void shopholiday() throws InterruptedException {
		HomePage2 hp2=new HomePage2(driver);
		hp2.shopholidaydec();
	}
}
