package kiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityNew {

	
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		
		Properties prop =new Properties();  //create object of properties class
		
		FileInputStream myfile=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SeleniumStudy\\src\\myProperty.properties");
	
		Reporter.log("reading data from properties file", true);
	    prop.load(myfile);     //loaded the file
	
	    String value = prop.getProperty(key);
	
	    return value;
	} 
	
	public static void TakeScreenShot(WebDriver driver,String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\chromedriver\\Screenshots\\TC"+TCID+".png");
		
		FileHandler.copy(src, dest);
		
		Reporter.log("taken screenshot", true);
	}
	
	
	
	
	
	
	
	
	
	
	
}
