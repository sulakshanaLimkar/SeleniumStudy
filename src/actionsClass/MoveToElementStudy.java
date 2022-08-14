package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		//1. To take mouse actions ,need to create object of actions class and pass webdriver object as parameter
		
		Actions act = new Actions(driver);
		
		//2. find element to be act
		
	WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		//3. now take action and perform
		
		act.moveToElement(aboutus).perform();
		
		//aboutus.click();   //using webelement method
		
		//click method by using action class
		
		//act.click().perform();
		
		Thread.sleep(1000);
		
		//i want to click on radio button
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
	//	act.moveToElement(radio1).perform();
		
		//act.click().perform();
		
	//	act.moveToElement(radio1).click().build().perform();
		
		
		act.click(radio1).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
