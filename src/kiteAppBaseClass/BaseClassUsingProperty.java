package kiteAppBaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import kiteAppUtility.UtilityUsingPropertyFile;

public class BaseClassUsingProperty 
{
	protected static WebDriver driver;
	//Browser setup
	
	public void OpenBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(UtilityUsingPropertyFile.readDataFromProperty("URL"));

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	public void takeScreenshot(String TCName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\chromedriver\\Screenshots\\snapshot"+TCName+".png");
		
		FileHandler.copy(src, dest);
	}

}
