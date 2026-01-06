package pageObjectClass;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header1 {

public static WebDriver	driver;

	public  Header1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	JavascriptExecutor je=(JavascriptExecutor)driver;
	

	
	@FindBy(xpath="//a[text()='New Smart Watering Plants Added']")WebElement newsmartplants;
	
	@FindBy(xpath="//p[text()='30 Day Happiness Guarantee']")WebElement HappinessGuarantee;
	
	@FindBy(xpath="//input[@id='Search']")WebElement searchbutton;
	
	@FindBy(xpath="//img[@class='small--hide image-element']")WebElement imgtextlivelyroot;
	
	@FindBy(xpath="(//span[@class='site-nav__icon-label small--hide'])[1]")WebElement account;
	
	@FindBy(xpath="(//input[@type='email'])[2]")WebElement email;
	
	@FindBy(xpath="//input[@type='checkbox']")WebElement checkboxemail;
	
	@FindBy(xpath="//input[@type='submit']")WebElement signupbutton;
	
	@FindBy(xpath="(//div[@class='rivo-footer-nav-text'])[1]")WebElement foryou;
	
	@FindBy(xpath="(//div[@class='rivo-footer-nav-text'])[2]")WebElement orders;
	
	@FindBy(xpath="//div[text()='Profile']")WebElement profile;
	
	@FindBy(xpath="(//a[@class='rivo-collection-item'])[1]")WebElement bestsellingplants;
	
	@FindBy(xpath="(//a[@class='rivo-collection-item'])[2]")WebElement plantgifts;
	
	@FindBy(xpath="(//a[@class='rivo-collection-item'])[2]")WebElement allplants;
	
	@FindBy(xpath="(//img[@loading='lazy'])[71]")WebElement Recentlyviewimg1;
	
	@FindBy(xpath="(//a[text()='Having issues? Click here to try again.'])[1]")WebElement havingissues;
	
	@FindBy(xpath="//a[text()='privacy policy']")WebElement privacypolicy;
	
	public void clickonNewSmartWateringPlantsAdded() {
		newsmartplants.click();
		 
	}
	 
	 
	public void clickonHappinessGuarantee() {
		 HappinessGuarantee.click();
	}
	
	public void clickonsearchbutton() throws InterruptedException {
		Actions ac=new Actions(driver);
		searchbutton.click();
		
		searchbutton.sendKeys("Best Selling");
		ac.keyDown(Keys.ENTER).perform();
		Thread.sleep(3000);
		//searchbutton.clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='small--hide image-element']")).click();
		
	;
	}
	
	public void clickimgtextlivelyroot() {
		imgtextlivelyroot.click();
	}
	
	
	public void clickaccount() {
		account.click();
	}
	
	public void enteremail() {
		email.sendKeys("arjun@gmail.com");
	}
	
	public void clickcheckboxemail() {
		checkboxemail.click();
	}
	
	public void clicksignupbutton() {
		signupbutton.click();
	}
	public void clickorders() {
		orders.click();
	}
	
	public void clickprofile() {
		profile.click();
	}
	
	public void clickbestsellingplants() {
		bestsellingplants.click();
	}
	
	public void clickplantgifts() {
		plantgifts.click();
	}
	
	public void clickallplants() {
		allplants.click();
	}
	public void clickRecentlyviewimg1() {
		Recentlyviewimg1.click();
		
	}
	public void clickforyou() {
		foryou.click();
	}
	public void havingissues() {
		havingissues.click();
	}
	
	public void privacypolicy() {
		privacypolicy.click();
		
	}
	
	public int dropdownshopplants() {
		
		WebElement we=driver.findElement(By.xpath("//summary[@data-link='/collections/all-plants']"));
		we.click();
	List<WebElement>we2=driver.findElements(By.xpath("//summary[@data-link='/collections/all-plants']//following-sibling::div//child::div//child::div//child::div[1]//child::div[1]//child::div//a"));
		int length=we2.size();
		 System.out.println(length);
		 
		 for(int i=0;i<length;i++) {
			String linksofshopplants= we2.get(i).getText();
			System.out.println(linksofshopplants);
			//- drop down all plants xpath->(//a[@class='site-nav__dropdown-link'])[5]
			
			//- popular collection  --> (//parent::div[@class="megamenu__col-title"]//a)[1]
			if(linksofshopplants.contains("\r\n"
					+ "                          All Plants\r\n"
					+ "                        ")) {
				we2.get(i).click();
				
			
			}
			
			
		 }
		 
		return length;
	}
	
	public void giftsdropdown() throws InterruptedException {
//	WebElement giftselect=	driver.findElement(By.xpath("(//summary[@class=\\\"site-nav__link site-nav__link--underline site-nav__link--has-dropdown\\\"])[2]"));
//	
//	giftselect.click();
//	
//	List<WebElement>giftproducts=driver.findElements(By.xpath("(//summary[@class=\"site-nav__link site-nav__link--underline site-nav__link--has-dropdown\"])[2]//following-sibling::div//child::ul//child::li"));
//	
//	int totalgiftp=giftproducts.size();
//	System.out.println(totalgiftp);
//	System.out.println(giftproducts.get(totalgiftp).getText());
//	
//	for(int j=0;j<totalgiftp;j++) {
//		String listofitems=giftproducts.get(j).getText();
//		
//		System.out.println(listofitems);
//		if(listofitems.equals("\r\n"
//				+ "                  Plants as Gifts")) {
//			giftproducts.get(j).click();
//			//   gifts subscription--> //a[@class="site-nav__dropdown-link site-nav__dropdown-link--second-level"]
//			}
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//summary[@class='site-nav__link site-nav__link--underline site-nav__link--has-dropdown'])[2]")));

		WebElement giftsdropdown=driver.findElement(By.xpath("(//summary[@class='site-nav__link site-nav__link--underline site-nav__link--has-dropdown'])[2]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(giftsdropdown).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"site-nav__dropdown-link site-nav__dropdown-link--second-level\"]")).click();
		Thread.sleep(3000);
		
			
	}
	
	
	public void subscripitions() throws InterruptedException {
		
		WebElement subscribe=driver.findElement(By.xpath("(//summary[@class='site-nav__link site-nav__link--underline site-nav__link--has-dropdown'])[3]"));	
		Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac.moveToElement(subscribe).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='site-nav__dropdown-link site-nav__dropdown-link--second-level'])[7]")).click();
		Thread.sleep(3000);
		}
	
	public void corporategifting() throws InterruptedException {
		
		WebElement corgift=driver.findElement(By.xpath("(//summary[@class='site-nav__link site-nav__link--underline site-nav__link--has-dropdown'])[4]"));
		Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac.moveToElement(corgift).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='site-nav__dropdown-link site-nav__dropdown-link--second-level'])[11]")).click();
		Thread.sleep(3000);
		// After Navigating To Corporate Gifts To Clients
		// Company name
		driver.findElement(By.xpath("(//input[@class='input-full'])[1]")).sendKeys("VTech");
		Thread.sleep(3000);
		// Email Address
		driver.findElement(By.xpath("(//input[@class='input-full'])[2]")).sendKeys("arjun89@gmail.com");
		Thread.sleep(3000);
		// First Name
		driver.findElement(By.xpath("(//input[@class='input-full'])[3]")).sendKeys("KL");
		Thread.sleep(3000);
		// Last Name
		driver.findElement(By.xpath("(//input[@class='input-full'])[4]")).sendKeys("Arjun");
		Thread.sleep(3000);
		// Phone Number
		driver.findElement(By.xpath("(//input[@class='input-full'])[5]")).sendKeys("8234676543");
		Thread.sleep(3000);
		// Number of plants needed(Select drop down)
		WebElement noofpn=driver.findElement(By.xpath("//select[@id='plants']"));
		Thread.sleep(3000);
		
		Select s=new Select(noofpn);// select the dropdown
		s.selectByValue("30 to 40");
		// s.selectByVisibleText("20 to 30");
		Thread.sleep(3000);
		// Earliest Date
		driver.findElement(By.xpath("(//input[@class='input-full'])[6]")).sendKeys("02/02/2025");
		Thread.sleep(3000);
		// Latest Date
		driver.findElement(By.xpath("(//input[@class='input-full'])[7]")).sendKeys("04/08/2026");
		Thread.sleep(3000);
		// Additional Notes
		driver.findElement(By.xpath("//textarea[@class='input-full']")).sendKeys("Enter Any Data That is Needed");
		Thread.sleep(3000);
		// Submit
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(9000);
		
		
	}



}
		
	
	
	
	
	
	

