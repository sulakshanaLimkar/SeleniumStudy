package kiteBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import kiteUtility.UtilityNew;

public class BaseNew {
         
	protected WebDriver driver;
	
	public void OpenApplication() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
	     driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(UtilityNew.readDataFromPropertyFile("URL"));
		
		Reporter.log("Open kite Application", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	
	
	
	
	
	
	
	
}
