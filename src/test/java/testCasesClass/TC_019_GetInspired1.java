package testCasesClass;



import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.GetInspired;

public class TC_019_GetInspired1 extends Base1{

	@Test
	public void getinspired() throws InterruptedException {
		GetInspired gn=new GetInspired(driver);
		
		gn.getinspiredplussymbols();
		Thread.sleep(3000);
		log.info("bottom golden plant plus button is successfully executed");
	}
}
