package testCasesClass;

import org.testng.annotations.Test;

import baseclass.Base1;
import pageObjectClass.Header1;

  public class TC_003LivelyRootImgText extends Base1 {
	
          	@Test
			public void clicklivelyrootimgtext() {
				Header1 l=new Header1(driver);
				l.clickimgtextlivelyroot();
			}
}
