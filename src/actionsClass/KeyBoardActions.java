package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?");
		
		Actions act=new Actions(driver);
		
	    WebElement day = driver.findElement(By.id("day"));
	    
	    act.click(day).perform();
	    
	    Thread.sleep(1000);
	    
	    act.sendKeys(Keys.ARROW_UP).perform();
	    
	      Thread.sleep(1000);
	      
	      act.sendKeys(Keys.ARROW_DOWN).perform();
	      
	      Thread.sleep(1000);
	      
	      act.sendKeys(Keys.ENTER).perform();
	      
	      Thread.sleep(5000);
	      
	    WebElement month = driver.findElement(By.id("month"));
	    
	 //   act.click(month).perform();
	    
	 //   Thread.sleep(1000);
	    
	//    act.sendKeys(Keys.ARROW_UP).perform();
	    
	//    Thread.sleep(1000);
	    
	//    act.sendKeys(Keys.ARROW_DOWN).perform();
	    
	//    act.sendKeys(Keys.ENTER).perform();
	    
	    act.click(month).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();
	      
	    
	  
	      
	    

	}

}
