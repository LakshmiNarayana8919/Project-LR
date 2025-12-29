package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.ShopByPlantType;

public class TC_013_ShopByPlantType2 extends Base1 {
@Test
	public void sbp1() {
		ShopByPlantType sbpt=new ShopByPlantType(driver);
		sbpt.shopbplant1();
		log.info("shop by plant snake plants feature executed successfully");
	}
}
