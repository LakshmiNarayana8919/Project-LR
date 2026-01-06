package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.Header1;

public class TC_008DropdownCorporateGifting extends Base1 {
	@Test
	public void corporategift() throws InterruptedException {
		Header1 l=new Header1(driver);
		Thread.sleep(3000);
	
	l.corporategifting();
	Thread.sleep(3000);
	l.clickimgtextlivelyroot();

}}
