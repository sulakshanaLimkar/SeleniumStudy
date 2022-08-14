package excelReading_Apache_poi;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		File myfile=new File("E:\\Apache_Poi\\TestData.xlsx");
		
		String value = WorkbookFactory.create(myfile).getSheet("Sheet5").getRow(0).getCell(0).getStringCellValue();

		System.out.println(value);
		
		
		
	}

}
