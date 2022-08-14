package verificationUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PaytmRecharge {
  @Test
  public void PaytmTest()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
	  
	  WebDriver driver =new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://paytm.com/");
	  
	  //use implisit wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	  
	 driver.findElement(By.xpath("(//div[@class='_3vgAs'])[1]")).click();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	WebElement prepaidButton = driver.findElement(By.xpath("(//i[@class='_3DxO'])[1]"));
	
	
	if (prepaidButton.isDisplayed())
	{
		Reporter.log("TC is pass", true);
	}
	else
	{
		Reporter.log("TC is fail", true);
	}
	
	
  }
}
