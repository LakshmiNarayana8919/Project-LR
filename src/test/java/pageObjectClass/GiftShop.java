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
	
	@FindBy(xpath="(//a[@class='site-nav__link site-nav__link--underline'])[2]")WebElement giftshoplink;
	
	
	@FindBy(xpath="//a[@class='hero__slide-link']")WebElement getstarted;
	
	@FindBy(xpath="(//img[@loading='lazy'])[12]")WebElement moneyplantingiftshop;
	
	@FindBy(xpath="(//img[@loading='lazy'])[13]")WebElement calathearattlesnakeplantingiftshop;
	
	public void clickgetstarted() throws InterruptedException {
		// click on the get started in gift shop
		
		
		giftshoplink.click();
		Thread.sleep(3000);
		getstarted.click();
		Thread.sleep(3000);
	}
	
	
	public void moneyplantingiftshop() throws InterruptedException {
		// click on the money tree plant
		
		giftshoplink.click();
		Thread.sleep(3000);
		moneyplantingiftshop.click();
		Thread.sleep(3000);
		
		
		
		
	}
	
	public void calathearattlesnakeplantingiftshop() throws InterruptedException {
		
		// calathea rattle snake plant in giftshop
		giftshoplink.click();
		Thread.sleep(3000);
		
		calathearattlesnakeplantingiftshop.click();
		
		
		
		Thread.sleep(3000);
		
	}
	
	
	
	
}
