package read_excel_data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read_excel_data_using_for_loop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		for(int i=0; i<=11; i++)
		{
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");  //provide the excel sheet
		
		Workbook wb = WorkbookFactory.create(fis);  //make the file for row
		Sheet sheet = wb.getSheet("IPL");  //take sheet name
		Row row = sheet.getRow(i);  //get the value of row
		Cell cell = row.getCell(0);  //get the value of cell
		String data = cell.getStringCellValue();  //it will give the value present in cell
		Thread.sleep(1000);  //delay 1 secound
		System.out.println(data);  //print the value
		}

	}

}
