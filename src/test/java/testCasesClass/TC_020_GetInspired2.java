package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.GetInspired;

public class TC_020_GetInspired2 extends Base1{

	@Test
	public void getinspired2() throws InterruptedException {
     GetInspired gn=new GetInspired(driver);
		
     gn.getinspiredplussymbols1();
	    log.info("cat palm in plus button is successfully executed");

		Thread.sleep(3000);
	}
}
