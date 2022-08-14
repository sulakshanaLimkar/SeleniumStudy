package kiteAppUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class UtilityUsingPropertyFile 
{

	
	public static String readDataFromProperty(String key) throws IOException
	{
		Properties prop=new Properties();
		
		FileInputStream myprop=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SeleniumStudy\\src\\myProperty.properties");
	
	    prop.load(myprop);
	
        String value = prop.getProperty(key);
        
        return value;
       
	}
	
	public static void implicitWait(WebDriver driver, int timeUnit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
	}
	
	
}
