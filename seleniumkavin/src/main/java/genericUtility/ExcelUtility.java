package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getStringDataFromExcel(String sheetname,int rowindex,int colindex) throws EncryptedDocumentException, IOException {
		FileInputStream fil=new FileInputStream("./src/test/resources/TestScriptData.xlsx");
		Workbook workbook=WorkbookFactory.create(fil);
		return workbook.getSheet(sheetname).getRow(rowindex).getCell(colindex).getStringCellValue();
		
	}
	public double getNumericDataFromExcel(String sheetname,int rowindex,int colindex) throws EncryptedDocumentException, IOException {
		FileInputStream fil=new FileInputStream(".src/test/resources/TestScriptData.xlsx");
		Workbook workbook=WorkbookFactory.create(fil);
		return workbook.getSheet(sheetname).getRow(rowindex).getCell(colindex).getNumericCellValue();
		
	}
	public boolean getBooleanDataFromExcel(String sheetname,int rowindex,int colindex) throws EncryptedDocumentException, IOException {
		FileInputStream fil=new FileInputStream(".src/test/resources/TestScriptData.xlsx");
		Workbook workbook=WorkbookFactory.create(fil);
		return workbook.getSheet(sheetname).getRow(rowindex).getCell(colindex).getBooleanCellValue();
		
	}
	
	
}
