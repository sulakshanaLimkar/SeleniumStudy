package serialOrParallelExecution_Practice_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void FacebookLaunch() throws InterruptedException 
  {
 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
	  
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
	  Reporter.log("FacebookLaunched", true);
	  Thread.sleep(2000);
	  driver.close();
  }
}
