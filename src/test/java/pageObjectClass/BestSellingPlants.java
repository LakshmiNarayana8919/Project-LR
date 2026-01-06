package pageObjectClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellingPlants {

	public static WebDriver	driver;

	public BestSellingPlants(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="(//h2[@class='section-header__title h3'])[2]")WebElement bsp;
	@FindBy(xpath="(//img[@loading='lazy'])[32]")WebElement moneytreeplant;
    @FindBy(xpath="(//label[@class='variant__button-label variant-button--potted-plant'])[4]")WebElement sizexlbsp;
	//@FindBy(xpath="//div[@class='js-modal-open-size-chart size-chart-trigger']")WebElement sizechartmp;
    
	@FindBy(xpath="(//img[@loading='lazy'])[36]")WebElement peacelily;
    @FindBy(xpath="(//label[@class='variant__button-label variant-button--potted-plant'])[4]")WebElement sizepeacelily;
	
    
    @FindBy(xpath="(//img[@loading='lazy'])[39]")WebElement zzplant;
    
    @FindBy(xpath="(//img[@loading='lazy'])[37]")WebElement flamingoflower;
    
    @FindBy(xpath="(//img[@loading='lazy'])[34]")WebElement indoorolivetree;
    
    
	public void bestsellingplants() throws InterruptedException {
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		
		je.executeScript("arguments[0].scrollIntoView()",bsp);
		
		Thread.sleep(3000);
		je.executeScript("arguments[0].click()",moneytreeplant);
		Thread.sleep(3000);
		je.executeScript("arguments[0].click()",sizexlbsp);
		
		Thread.sleep(3000);
		//sizechartmp.click();
		
		
	}
	
	public void bestselling() throws InterruptedException {
     JavascriptExecutor je=(JavascriptExecutor)driver;
		
		
		je.executeScript("arguments[0].scrollIntoView()",bsp);
		
		Thread.sleep(3000);
		je.executeScript("arguments[0].click()",peacelily);
		//peacelily.click();
		
		//sizepeacelily.click();
		Thread.sleep(3000);
	}
	
	public void bestsellingplants2() throws InterruptedException {
		// zz plant
		 JavascriptExecutor je=(JavascriptExecutor)driver;
			
			
			je.executeScript("arguments[0].scrollIntoView()",bsp);
			
			Thread.sleep(3000);
			je.executeScript("arguments[0].click()",zzplant);
	}
	
	public void bspflamino() throws InterruptedException {
		// famingo flower
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		
		je.executeScript("arguments[0].scrollIntoView()",bsp);
		
		Thread.sleep(3000);
		
		je.executeScript("arguments[0].click()",flamingoflower);
		

	}
	
	public void bspindoorolive() throws InterruptedException {
		// indoor olive plant
JavascriptExecutor je=(JavascriptExecutor)driver;
		
		
		je.executeScript("arguments[0].scrollIntoView()",bsp);
		
		Thread.sleep(3000);
		je.executeScript("arguments[0].click()",indoorolivetree);
	}
	
	
}
