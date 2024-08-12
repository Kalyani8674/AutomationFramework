package genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String getStringDataFromExcel(String sheetname,int rowindex,int colindex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook Workbook=WorkbookFactory.create(fis);
		return Workbook.getSheet(sheetname).getRow(rowindex).getCell(colindex).getStringCellValue();
		
	}
	
	public double getNumberDataFromExcel(String sheetname,int rowindex,int colindex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook Workbook=WorkbookFactory.create(fis);
		return Workbook.getSheet(sheetname).getRow(rowindex).getCell(colindex).getNumericCellValue();
		
	}
	
	public boolean getbooleanDataFromExcel(String sheetname,int rowindex,int colindex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook Workbook=WorkbookFactory.create(fis);
		return Workbook.getSheet(sheetname).getRow(rowindex).getCell(colindex).getBooleanCellValue();
		
	}
}
