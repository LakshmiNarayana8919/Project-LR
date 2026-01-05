package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.BestSellingPlants;

public class TC_015_BestSellingPlants2 extends Base1 {
@Test
	public void bsplants1() throws InterruptedException {
	BestSellingPlants bsp=new BestSellingPlants(driver);
	bsp.bestselling();
	log.info("Snake plants image link is successfully executed");
	}
}
