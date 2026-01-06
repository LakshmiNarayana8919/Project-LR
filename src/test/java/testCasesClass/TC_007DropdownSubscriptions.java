package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.Header1;

public class TC_007DropdownSubscriptions  extends Base1{
	@Test
	public void subscription() throws InterruptedException {
		Header1 l=new Header1(driver);
		Thread.sleep(3000);
		l.subscripitions();

}
}