package kite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageToMainPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		//kite: login page to main page
		
		WebElement UserID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UserID.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginButton.click();
		
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		pin.sendKeys("982278");
		continueButton.click();
		
		Thread.sleep(1000);
		
		
		WebElement UID = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		UID.click();
		
		String actualID = UID.getText();
		String exceptedID="ELR321";
		
		if(actualID.equals(exceptedID))
		{
			System.out.println("Test Case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		Thread.sleep(500);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
