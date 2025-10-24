package baseclass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class Base1 {
	public static WebDriver driver;

	@BeforeSuite
	public void OPENURL() {
		
		driver=new EdgeDriver();
		
		driver.get("https://www.livelyroot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@AfterSuite
	public void CLOSEURL() {
		driver.close();

	}
	
	public String screenshots(String tname1) {
		
		String timestamp1=new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss"). format(new Date());
		TakesScreenshot ss= (TakesScreenshot) driver;
	    File src2=	ss.getScreenshotAs(OutputType.FILE);
	    String dest1=System.getProperty("user.dir")+"\\screenshot\\"+timestamp1+tname1+"ss1.png";
	    try {
	    	 FileUtils.copyFile(src2,new File(dest1));
		} catch (Exception e) {
			e.getMessage();
		}
	   
	  return dest1;
	  
	}

}
