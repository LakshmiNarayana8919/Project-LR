package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.BestSellingPlants;

public class TC_018_BestSellingPlants5 extends Base1{

	
	@Test
	public void bspindoorolive() throws InterruptedException {
		BestSellingPlants bsp=new BestSellingPlants(driver);
        bsp.bspindoorolive();
        log.info("Indoor Olive Plant in best selling plants is executed");
	}
}
