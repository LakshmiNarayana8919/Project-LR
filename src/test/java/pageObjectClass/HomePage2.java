package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {

	
	public static WebDriver	driver;

	public HomePage2 (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="(//h2[@class='section-header__title h3'])[1]")WebElement shopholidaydecor;
	
	@FindBy(xpath="(//img[@loading='lazy'])[14]")WebElement freshcutholidaywreath;
	
	@FindBy(xpath="(//label[@class='variant__button-label '])[3]")WebElement style;
	
	@FindBy(xpath="//button[@id='ProductSubmitButton-template--15515883700306__main']")WebElement addtocartbt;
	
	@FindBy(xpath="//button[@class='collapsible-trigger collapsible-trigger-btn collapsible--auto-height collapsible-trigger-btn--borders']")WebElement description;
	
	@FindBy(xpath="//a[@href='#product-reviews']")WebElement customerreview;
	
	
	@FindBy(xpath="(//a[@class='section-header__link'])[1]")WebElement viewallshopdec;
	
	@FindBy(xpath="(//p[@class='group-title small--hide'])[1]")WebElement shopbycollection;
	
	@FindBy(xpath="(//img[@loading='lazy'])[14]")WebElement rosemarychristmastree;
	
	@FindBy(xpath="(//a[@href='/collections/all-plants'])[4]")WebElement allplants;
	
	@FindBy(xpath="(//img[@loading='lazy'])[26]")WebElement sbcpetfriendly;
	
	@FindBy(xpath="(//img[@loading='lazy'])[17]")WebElement calathearattlesnake;
	
	
	//@FindBy(xpath="(//img[@loading='lazy'])[34]")WebElement airplants;
	
	public void shopholidaydec() throws InterruptedException {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView()",shopholidaydecor);
		Thread.sleep(3000);
		//freshcutholidaywreath.click();
	js.executeScript("arguments[0].click()",freshcutholidaywreath);
		Thread.sleep(3000);
		style.click();
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView()",addtocartbt);
		Thread.sleep(3000);
		description.click();
		Thread.sleep(3000);
		customerreview.click();
		Thread.sleep(3000);
		
	}
	
	
	public void Viewallshopdecor() throws InterruptedException {
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView()",shopholidaydecor);
//		Thread.sleep(6000);
		viewallshopdec.click();
		
	}
	
	public void shopbyplants() throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",shopbycollection);
		Thread.sleep(3000);
		// (//a[@href='/collections/all-plants'])[4]
		
		
		//rosemarychristmastree.click();
	}
	
	
	
	public void shopbycolections() throws InterruptedException {
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
//	public void shopbyplanttype() throws InterruptedException {
//	// shop by plants type -->  (//h2[@class='section-header__title h2'])[2]
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		WebElement sbpt=driver.findElement(By.xpath("(//h2[@class='section-header__title h2'])[2]"));
//		js.executeScript("arguments[0].scrollIntoView()",sbpt);
//		Thread.sleep(3000);
//		
//		// air plants -->  (//img[@loading='lazy'])[34]
//		
//		
//		
//	}
	
}
