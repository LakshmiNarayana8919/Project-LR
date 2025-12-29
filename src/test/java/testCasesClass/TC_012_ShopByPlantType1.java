package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.ShopByPlantType;

public class TC_012_ShopByPlantType1 extends Base1{

	@Test
	public void sbp() {
		ShopByPlantType sbpt=new ShopByPlantType(driver);
		sbpt.shopbplant();
		log.info("shop by plant feature executed successfully");
	}
}
