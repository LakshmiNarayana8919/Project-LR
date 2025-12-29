package testCasesClass;

import baseclass.Base1;
import pageObjectClass.ShopByCollection;

public class TC_011ShopByCollection extends Base1{

	
	public void shopbc() throws InterruptedException {
		ShopByCollection sbc=new ShopByCollection(driver);
		sbc.shopbycolections();
		log.info("shop by collection is executed");
		
		
	}
}
