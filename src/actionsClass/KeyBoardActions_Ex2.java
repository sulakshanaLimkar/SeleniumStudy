package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions_Ex2 {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?");
		
		//1.create object of actions class and pass driver object as parameter
		
		Actions act =new Actions (driver);
		
		//2.find the element to be worked and store it in referance variable
		
		WebElement day = driver.findElement(By.id("day"));
		
		//3.take the requird actions
		
		act.click(day).perform();
		
		for(int i=1; i<=9 ; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(1000);
		
		///////////////////////////////////////////////////////////
		WebElement month = driver.findElement(By.id("month"));
		
		act.click(month).perform();
		
		for(int i=1 ; i<=6 ; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		
		////////////////////////////////////////////////////////
		WebElement year = driver.findElement(By.id("year"));
		
		act.click(year);
		
		for(int i=1 ; i<=30 ; i++)
		{
		  act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
			
			
		
		

	}

}
