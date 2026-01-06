package pageObjectClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetInspired {
	public static WebDriver	driver;

	public GetInspired(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//h2[@class=\"hotspots__title h1 text-left\"]")WebElement getinspiredheadin;
	
	@FindBy(xpath="//button[@class='hotspot__button hotspot__button--product_FzRdJB']")WebElement buttongoldenphomosplant;
	
	
	
	public void getinspiredplussymbols() throws InterruptedException {
		
		
       JavascriptExecutor je=(JavascriptExecutor)driver;
		
		
		je.executeScript("arguments[0].scrollIntoView()",buttongoldenphomosplant);
		
		je.executeScript("arguments[0].click()",buttongoldenphomosplant);
		//Thread.sleep(3000);
		Thread.sleep(3000);
		
		
	}
}
