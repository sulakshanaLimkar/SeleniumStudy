package serialOrParallelExecution_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void KiteLaunch() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://kite.zerodha.com/");
			  
  }
}
