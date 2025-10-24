package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header1 {

public static WebDriver	driver;

	public  Header1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[text()='New Smart Watering Plants Added']")WebElement newsmartplants;
	@FindBy(xpath="//p[text()='30 Day Happiness Guarantee']")WebElement HappinessGuarantee;
	
	
	public void clickonNewSmartWateringPlantsAdded() {
		newsmartplants.click();
		//yudriver.navigate().back();
	}
	
	public void clickonHappinessGuarantee() {
		 HappinessGuarantee.click();
	}
	
}
