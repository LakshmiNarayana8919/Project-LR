package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopByCollection {
	public static WebDriver	driver;

	public ShopByCollection (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
    @FindBy(xpath="(//img[@loading='lazy'])[26]")WebElement sbcpetfriendly;
	
	@FindBy(xpath="(//img[@loading='lazy'])[17]")WebElement calathearattlesnake;
	
	public void shopbycolections() throws InterruptedException {
		// for pet friendly
		// (//h2[@class='section-header__title h2'])[1]  -- scroll upto element
		//    (//img[@loading='lazy'])[26]
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement sbc=driver.findElement(By.xpath("(//h2[@class='section-header__title h2'])[1]"));
		js.executeScript("arguments[0].scrollIntoView()",sbc);
		Thread.sleep(3000);
		sbcpetfriendly.click();
	// (//img[@loading='lazy'])[17]  --calathea rattlesnake
		WebElement cr=	driver.findElement(By.xpath("(//img[@loading='lazy'])[17]"));
		js.executeScript("arguments[0].scrollIntoView()",cr);
		//driver.findElement(By.xpath("(//img[@loading='lazy'])[17]")).click();
		calathearattlesnake.click();		
		
	
	}
	
	public void shopbycollection1() {
		// for easy care plants
	}
}
