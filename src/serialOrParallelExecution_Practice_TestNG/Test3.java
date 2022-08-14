package serialOrParallelExecution_Practice_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void VctcLaunche() throws InterruptedException 
  {
 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
	  
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/");
	  
	  Reporter.log("VctcLaunched", true);
	  Thread.sleep(2000);
	  driver.close();
	  
  }
}
