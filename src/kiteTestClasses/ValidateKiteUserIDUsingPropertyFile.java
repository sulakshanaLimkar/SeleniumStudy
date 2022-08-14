package kiteTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBase.BaseNew;
import kitePOMClasses.KiteHomePage;
import kitePOMClasses.KiteLoginPage;
import kitePOMClasses.KitePinPage;
import kiteUtility.UtilityNew;

public class ValidateKiteUserIDUsingPropertyFile extends BaseNew{
  
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		OpenApplication();
		 
	    login=new KiteLoginPage(driver);
	    pin =new KitePinPage(driver);
	    home=new KiteHomePage(driver);
	}
	
	@BeforeMethod 
	public void LoginToKite() throws IOException
	{
		login.sendUserID(UtilityNew.readDataFromPropertyFile("UN"));
		
		login.sendPassword(UtilityNew.readDataFromPropertyFile("PWD"));
		
		login.ClickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(UtilityNew.readDataFromPropertyFile("PIN"));
		
		pin.clickOnContinueButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	@Test
	public void KiteUserValidation() throws IOException
	{
		String TCID="3017301";
		Assert.assertEquals(home.getActualUserID(), UtilityNew.readDataFromPropertyFile("UN"),"TC failed actual and expected not matching");
	
		UtilityNew.TakeScreenShot(driver, TCID);
	}
	
	@AfterMethod
	public void logOutFromKiteApp() throws InterruptedException
	{
		home.clickOnLogOutButton();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
