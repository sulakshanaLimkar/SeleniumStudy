package kiteAppTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClassUsingProperty;
import kiteAppUtility.UtilityUsingPropertyFile;
import kitePOMClasses.KiteHomePage;
import kitePOMClasses.KiteLoginPage;
import kitePOMClasses.KitePinPage;

public class KiteUNTestUsingProperty extends BaseClassUsingProperty {
 
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	
	@BeforeClass
	public void LaunchBrowser() throws IOException
	{
		OpenBrowser();
		
		login=new KiteLoginPage(driver);
	     pin=new KitePinPage(driver);
	     home=new KiteHomePage(driver);
	     
		}
	
	@BeforeMethod
	public void logintoKiteApp() throws IOException
	{
		login.sendUserID(UtilityUsingPropertyFile.readDataFromProperty("UN"));
		login.sendPassword(UtilityUsingPropertyFile.readDataFromProperty("PWD"));
	    login.ClickOnLoginButton();
	    
	    UtilityUsingPropertyFile.implicitWait(driver, 1000);
	    
	    pin.sendPin(UtilityUsingPropertyFile.readDataFromProperty("PIN"));
	    
	    pin.clickOnContinueButton();
	    
	    UtilityUsingPropertyFile.implicitWait(driver, 200);
	    
	}
	
	@Test
	public void ValidateUserName() throws IOException
	{
		String actualUserID=home.getActualUserID();
		String expectedUserID=UtilityUsingPropertyFile.readDataFromProperty("UN1");
		
		Assert.assertEquals(actualUserID, expectedUserID,"actualUserID and expectedUserID is not matching TC is FAILED");
		
	Reporter.log("Actual and Expected user id matching TC is PASSED", true);
	

	
	}
	
	@AfterMethod
	public void LogOutFromKite() throws InterruptedException
	{
		home.clickOnLogOutButton();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	
	 
	
	
	
	
	
	
	
	
	
}
