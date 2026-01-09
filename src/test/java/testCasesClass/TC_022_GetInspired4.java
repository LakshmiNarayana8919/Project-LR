package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.GetInspired;

public class TC_022_GetInspired4 extends Base1 {

	@Test
	public void getinspiredbostonfern() throws InterruptedException {
		GetInspired gn=new GetInspired(driver);
		gn.getinspiredplussymbols3();
	    log.info("boston fern plant in plus button is successfully executed");
			
			Thread.sleep(3000);
	}
}
