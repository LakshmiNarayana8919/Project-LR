package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.BestSellingPlants;

public class TC_016_BestSellingPlants3 extends Base1{

	@Test
	public void bsp3() throws InterruptedException {
		BestSellingPlants bsp=new BestSellingPlants(driver);
             bsp.bestsellingplants2();
             log.info("ZZ Plant in best selling plants is executed");
	}
}
