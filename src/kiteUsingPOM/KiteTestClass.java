package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		KiteLoginPage login =new KiteLoginPage(driver);
		
	    login.sendUserID();
		login.sendPassword();
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		
		KitePinPage pin = new KitePinPage(driver);
		
		pin.sendpin();
		pin.clickOnContinueButton();
		
		Thread.sleep(1000);
		
		
		KiteHomePage home =new KiteHomePage(driver);
		
		home.ValiteUserID();
		home.LogOut();
		
		driver.close();
		
		
		
				
		
		
		
		
		
		
		

	}

}
