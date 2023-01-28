package data_drivern_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class flib {

	public String read_data(String excelpath, String sheetname, int rowcount, int cellcount) throws EncryptedDocumentException, IOException {
		// use to store only the Generic Reusable Methods
		
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
	    String data = cell.getStringCellValue();
	    return data;

	}
    
    public int invalid_data(String excelPath, String sheetName) throws EncryptedDocumentException, IOException {
    	FileInputStream fis = new FileInputStream(excelPath);
    	Workbook wb = WorkbookFactory.create(fis);
    	Sheet sheet = wb.getSheet(sheetName);
    	int lrn = sheet.getLastRowNum();
    	return lrn;
    	
    }

}
