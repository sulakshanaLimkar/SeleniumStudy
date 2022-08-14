package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickStudy {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//1.to take mouse actions ,need to create object of actions class and pass the webdriver object as parameter
		
		Actions act = new Actions(driver);
		
		//2. find element to be act
		
		WebElement alertbutton = driver.findElement(By.id("alertbtn"));
		
		act.moveToElement(alertbutton).doubleClick().build().perform();
		
		

	}

}
