package actionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclickUse {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		//1.create object of actions class and pass driver object as parameter
		
		Actions act =new Actions(driver);
		
		//2. find the element to be worked and store it in referance variable
		
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//3.take the requried actions
		
		//act.moveToElement(rightclickbutton).perform();
	//	act.moveToElement(rightclickbutton).contextClick().build().perform();
		
		act.contextClick(rightclickbutton).perform();
		
		
		WebElement editoption = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']"));
		
		act.moveToElement(editoption).click().build().perform();
		
		//Switch focus on alert box and click on ok button
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
		
		//close the window
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
