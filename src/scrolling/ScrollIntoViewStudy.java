package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewStudy {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//WebElement seleniumPractice = driver.findElement(By.xpath("//a[contains(text(),'Click to')]"));
		WebElement ourSocialMedia = driver.findElement(By.xpath("//h1[contains(text(),'Our Social')]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	//js.executeScript("arguments[0].scrollIntoView();", seleniumPractice);
		
		js.executeScript("arguments[0].scrollIntoView();", ourSocialMedia);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
