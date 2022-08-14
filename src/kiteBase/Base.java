package kiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {

	protected WebDriver driver;
	
	public void OpenApplication()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Reporter.log("Launching kite APP", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	
}
