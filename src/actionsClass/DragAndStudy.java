package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndStudy {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//1. create the object of action class and pass driver as a parameter
		
		Actions act=new Actions(driver);
		
		//2.find the element to be worked and store it in referance variable
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		//3. take required actions
		
	    act.dragAndDrop(source, dest).perform();
	    //act.clickAndHold(source).moveToElement(dest).release().build().perform();
	    
	   WebElement source1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	   WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	   
	  // act.dragAndDrop(source1, dest1).perform();
	   
	   act.clickAndHold(source1).moveToElement(dest1).release().build().perform();
		
		
		


	}
}
