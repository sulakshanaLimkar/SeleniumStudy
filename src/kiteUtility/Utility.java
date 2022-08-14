package kiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {

	public static String readDataFromExcel(int rowNom,int cellNum) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("E:\\Apache_Poi\\TestData.xlsx");
		
		String value = WorkbookFactory.create(myFile).getSheet("Sheet6").getRow(rowNom).getCell(cellNum).getStringCellValue();
	
	return value;
	}
	
	public static void captureScreenShot(WebDriver driver,String TCID) throws IOException
	
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\chromedriver\\Screenshots\\TC"+TCID+".png");
		
	    FileHandler.copy(src, dest);
	    
	    Reporter.log("Taken ScreenShot", true);
	}
	
	
	
	
	
	
	
}
