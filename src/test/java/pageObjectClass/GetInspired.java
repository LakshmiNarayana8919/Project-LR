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
	
	@FindBy(xpath="//button[@class='hotspot__button hotspot__button--product_eEY4Py']")WebElement catpalmplussymbol2;
	
	@FindBy(xpath="//button[@class='hotspot__button hotspot__button--product_yUwcby']")WebElement zzplusbutton;
	
	
	
	@FindBy(xpath="//button[@class='hotspot__button hotspot__button--product_TpPWbc']")WebElement bostonfernplant;
	
	
	
	@FindBy(xpath="//div[@class='hotspots__buttons']/child::button[contains(@class,'hotspot__button hotspot__button--product_iBT7Wr')]")WebElement getinspiredsideindoorplantlink;
	
	public void getinspiredplussymbols() throws InterruptedException {
		// botton golden phomos plant
		
       JavascriptExecutor je=(JavascriptExecutor)driver;
		
		
		je.executeScript("arguments[0].scrollIntoView()",buttongoldenphomosplant);
		
		je.executeScript("arguments[0].click()",buttongoldenphomosplant);
		//Thread.sleep(3000);
		Thread.sleep(3000);
		
		
	}
	
	
	public void getinspiredplussymbols1() throws InterruptedException {
		// cat palm plant
		 JavascriptExecutor je=(JavascriptExecutor)driver;
			
			
			je.executeScript("arguments[0].scrollIntoView()",buttongoldenphomosplant);
			je.executeScript("arguments[0].click()",catpalmplussymbol2);
			//Thread.sleep(3000);
			Thread.sleep(3000);
			
			
	}
	
	public void getinspiredplussymbols2() throws InterruptedException {
		// zz plant in plus button plant
		 JavascriptExecutor je=(JavascriptExecutor)driver;
			
			
			je.executeScript("arguments[0].scrollIntoView()",buttongoldenphomosplant);
			je.executeScript("arguments[0].click()",zzplusbutton);
			//Thread.sleep(3000);
			Thread.sleep(3000);
			
			Thread.sleep(2000);
			
	}
	
	public void getinspiredplussymbols3() throws InterruptedException {
		// boston fern plant in plus button plant element xpath--> //button[@class='hotspot__button hotspot__button--product_TpPWbc']
		 JavascriptExecutor je=(JavascriptExecutor)driver;
			
			
			je.executeScript("arguments[0].scrollIntoView()",buttongoldenphomosplant);
			je.executeScript("arguments[0].click()",bostonfernplant);
			//Thread.sleep(3000);
			Thread.sleep(3000);
			
			Thread.sleep(2000);
	
	
	}
	
	
	// //button[@class='hotspot__button hotspot__button--product_ytjcgQ']  peacelilly element path in get inspired 
	   // -->  dd shop plants - best sellers-- > (//p[@class='group-title small--hide'])[1]/following-sibling::ul//li
	
	
	// indoor plants in get inspired plus button 2nd image
	// 1button element xpath axes --> //div[@class='hotspots__buttons']/child::button[contains(@class,'hotspot__button hotspot__button--product_iBT7Wr')]
	
	public void getinspiredsideindoorplantlink() throws InterruptedException {
		// getinspired side indoorplant link plant  button plant element xpath
		 JavascriptExecutor je=(JavascriptExecutor)driver;
			
			
			je.executeScript("arguments[0].scrollIntoView()",getinspiredsideindoorplantlink);
			
			
			je.executeScript("arguments[0].click()",getinspiredsideindoorplantlink);
			//Thread.sleep(3000);
			Thread.sleep(3000);
			
			Thread.sleep(2000);
	}
	





}
	
	
	

