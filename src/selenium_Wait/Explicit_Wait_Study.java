package selenium_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Study {

	public static void main(String[] args) {
		
		//changes made by me
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe")	;
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		WebElement Reviews = driver.findElement(By.xpath("(//a[text()='Student Review'])[1]"));
		//WebElement clickToStart = driver.findElement(By.xpath("//a[contains(text(),'Click to')]"));
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));  //new Syntax
		
	//	w.until(ExpectedConditions.visibilityOf(Reviews));
		
		
		

	}

}
