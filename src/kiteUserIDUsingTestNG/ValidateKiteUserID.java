package kiteUserIDUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteUserID {
 
	
	 WebDriver driver;
	 File myfile;
	 Sheet mySheet;
	 KiteLoginPage login;
	 KitePinPage pin;
	 KiteHomePage home;
	
	@BeforeClass
   public void LaunchBrowser() throws EncryptedDocumentException, IOException
	{
	  
	 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe") ;
	 
	  driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://kite.zerodha.com/");
	 
	 Reporter.log("Launching Kite APP", true);
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 
	  myfile =new File("E:\\Apache_Poi\\TestData.xlsx");
	 
	 mySheet= WorkbookFactory.create(myfile).getSheet("Sheet6");
	
	 login =new KiteLoginPage(driver);
	 pin =new KitePinPage(driver);
	 home=new KiteHomePage(driver);
	 
	 }
	@BeforeMethod
	public void loginToKite()
	{
		login.sendUserID(mySheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Entering user ID ", true);
		
		login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("entering password", true);
		
		login.clickOnLoginButton();
		Reporter.log("clicking on login button", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
		
		pin.clickOnContinueButton();
		Reporter.log("clicking on continue button",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	@Test
	public void validateUserID()
	{
		String expectedUserID=mySheet.getRow(0).getCell(0).getStringCellValue();
		String actualUserID=home.getActualUserID();
		
		Reporter.log("Validating actual and expected user ID", true);
		
		Assert.assertEquals(actualUserID, expectedUserID,"TC is failed actual and expected are not matching");
	
	Reporter.log("Validating actual and expected user ID TC is PASSED", true);
	
	}
	
	@AfterMethod
	public void logOutKiteApp() throws InterruptedException
	{
		home.clickOnLoginButton();
		Reporter.log("clicking on logout button", true);
		
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closing Browser", true);
		
		driver.close();
	}
	
	
	
	
}
