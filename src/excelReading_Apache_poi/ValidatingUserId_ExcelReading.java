package excelReading_Apache_poi;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingUserId_ExcelReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe")	;
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().window().maximize();
	
	WebElement userID = driver.findElement(By.id("userid"));
	
	WebElement password = driver.findElement(By.id("password"));
	
	WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	
	
	//Excel object creation
	
	File myfile=new File("E:\\Apache_Poi\\TestData.xlsx");
	
	Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet6");
	
	String userIDExcel = mySheet.getRow(0).getCell(0).getStringCellValue();
	String passwordExcel = mySheet.getRow(0).getCell(1).getStringCellValue();
	// double pinExcel = mySheet.getRow(0).getCell(2).getNumericCellValue();
		
	
	userID.sendKeys(userIDExcel);
	password.sendKeys(passwordExcel);
	loginbutton.click();
	
	Thread.sleep(1000);
	
	WebElement pin = driver.findElement(By.id("pin"));
	
	WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
	 
	pin.sendKeys("982278");
	continueButton.click();
	
	Thread.sleep(1000);
	
	
	WebElement UID = driver.findElement(By.xpath("//span[@class='user-id']"));
	
	String actualResult = UID.getText();
	System.out.println("Actual user ID =" +actualResult);
	
	
	String Exceptedresult=userIDExcel;
	System.out.println("Excepted user ID="+ Exceptedresult);
	
	if(actualResult.equals(Exceptedresult))
	{
		System.out.println("Actual and Excepted result is matched ,My Test Case is Pass");
	}
	else {
		System.out.println("Actual and Excepted result is not matched ,My Test Case is Fail");
	}
	
	Thread.sleep(500);
	UID.click();
	
	Thread.sleep(500);
	
	WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
	
	logout.click();
	
	Thread.sleep(500);
	
	driver.close();
	
	
	
	
		
		
		
		
		
		
		
		
		
		

	}

}
