package kitePomWithExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTestWithExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
	 
	 ChromeOptions opt=new ChromeOptions();
	// opt.addArguments("--headless");
	//	opt.addArguments("--disable-notifications");
	    opt.addArguments("incognito");
		WebDriver driver = new ChromeDriver(opt);
				
		driver.get("https://kite.zerodha.com/");	
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		File myfile =new File("E:\\Apache_Poi\\TestData.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet6");
		
		String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();
		
		KiteLoginPage login = new KiteLoginPage(driver);
		
		login.sendUserID(UN);
		login.sendPassword(PWD);
		login.clickOnLoginButton();
     	Thread.sleep(1000);
		
		KitePinPage pin = new KitePinPage(driver);
		//pin.sendPin(mysheet.getRow(0).getCell(2).getStringCellValue());
		pin.sendPin("982278");
		pin.ClickOnContinueButton();
		
		Thread.sleep(1000);
		
		KiteHomePage home = new KiteHomePage(driver);
		home.ValidateuserID(mysheet.getRow(0).getCell(0).getStringCellValue());
		home.ClickOnLogOutButton();
		
		Thread.sleep(1000);
		driver.close();
				
		
		
				
		
		
		
		
		
		
		
		
		
		

	}

}
