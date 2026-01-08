package testCasesClass;

import baseclass.Base1;
import pageObjectClass.GetInspired;

public class TC_021_GetInspired3 extends Base1{

	
	public void getinspiredzzplant() throws InterruptedException {
		GetInspired gn=new GetInspired(driver);
		gn.getinspiredplussymbols2();
	    log.info("zz plant in plus button is successfully executed");
			
			Thread.sleep(3000);
	}
}
