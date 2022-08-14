package selenium_Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Study {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe")	;
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://vctcpune.com/");
	
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   //syntax for before selenium 4
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //latest syntax after selenium 4
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
