package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.GetInspired;

public class TC_023_IndoorPlantLinkLeftSideOfGetInspired extends Base1 {

	@Test
	public void indoorplantsidetogetinspired() throws InterruptedException {
		GetInspired gn=new GetInspired(driver);
		gn.getinspiredsideindoorplantlink();
	    log.info("indoor plant link beside the get inspired section button is successfully executed");
			
			Thread.sleep(3000);
	}
}
