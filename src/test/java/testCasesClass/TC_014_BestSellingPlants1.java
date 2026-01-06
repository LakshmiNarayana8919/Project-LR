package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.BestSellingPlants;

public class TC_014_BestSellingPlants1 extends Base1 {

	@Test
	public void bsplants() throws InterruptedException {
		BestSellingPlants bsp=new BestSellingPlants(driver);
		bsp.bestsellingplants();
		log.info("Money plant image link is successfully executed");
	}
}
