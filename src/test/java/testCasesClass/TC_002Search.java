package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.Header1;

public class TC_002Search extends Base1{
	@Test
		public void clicksearch() throws InterruptedException {
			Header1 l=new Header1(driver);
			l.clickonsearchbutton();
		}
	}
