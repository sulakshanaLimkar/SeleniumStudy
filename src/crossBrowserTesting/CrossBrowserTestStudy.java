package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestStudy {
	@Parameters("browserName")
  @Test
  public void myMethod(String Bname) 
  {
	  WebDriver driver=null;    //declared driver here
	
	  if(Bname.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		  driver =new ChromeDriver();
	 }
	  
	 else if(Bname.equals("firefox"))
	 {
	  
	   System.setProperty("webdriver.gecko.driver", "E:\\geckodriver\\geckodriver.exe");
	    driver =new FirefoxDriver();
	 }
	  
	  
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	 // Reporter.log("kite launched successfully");
	  
	//  driver.close();
  }
}
