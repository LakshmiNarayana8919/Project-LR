package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.BestSellingPlants;

public class TC_017_BestSellingPlants4 extends Base1 {

	@Test
	public void clickflamingo() throws InterruptedException {
		BestSellingPlants bsp=new BestSellingPlants(driver);
        bsp.bspflamino();
        log.info("Flamingo Flower Plant in best selling plants is executed");
	}
}
