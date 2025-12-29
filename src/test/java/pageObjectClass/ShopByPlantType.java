package pageObjectClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopByPlantType {
	public static WebDriver	driver;

	public ShopByPlantType (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="(//h2[@class='section-header__title h2'])")WebElement sbplant;
	@FindBy(xpath="(//img[@loading='lazy'])[32]")WebElement airplants;
	@FindBy(xpath="(//img[@loading='lazy'])[30]")WebElement snakeplants;
    @FindBy(xpath="(//img[@loading='lazy'])[10]")WebElement airplantgrabbag;
	
	public void shopbplant() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView()",sbplant);
		airplants.click();
		
		
		js.executeScript("arguments[0].scrollIntoView()",airplantgrabbag);
		
		airplantgrabbag.click();
		
	}
	
	
	
	public void shopbplant1() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView()",sbplant);
		
		
		snakeplants.click();
		
	}
}
