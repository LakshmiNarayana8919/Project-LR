package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.ShopByPlantType;

public class TC_013_ShopByPlantType2 extends Base1 {
@Test
	public void sbp1() throws InterruptedException {
		ShopByPlantType sbpt=new ShopByPlantType(driver);
		sbpt.shopbplant1();
		log.info("Shop By Plants Type 1 is successfully executed");
	}
}
