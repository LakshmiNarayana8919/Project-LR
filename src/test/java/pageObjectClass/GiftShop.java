package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftShop {
	public static WebDriver	driver;
	
	public GiftShop(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[@class='hero__slide-link']")WebElement getstarted;
	
	@FindBy(xpath="(//img[@loading='lazy'])[12]")WebElement moneyplantingiftshop;
	
	
	public void clickgetstarted() {
		// click on the get started in gift shop
		
		getstarted.click();
	}
	
	
	public void moneyplantingiftshop() {
		// click on the money tree plant
		moneyplantingiftshop.click();
		
		
	}
}
