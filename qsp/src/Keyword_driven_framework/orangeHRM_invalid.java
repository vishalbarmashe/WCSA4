package Keyword_driven_framework;

import java.io.IOException;

import org.openqa.selenium.By;

public class orangeHRM_invalid extends BaseTestHRM {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	    BaseTestHRM bt = new BaseTestHRM();
	    bt.OpenBrowser();
	    
	    Flib lib = new Flib();
	    
	    int rc = lib.rowCount(EXCEL_PATH_HRM, "invalidcred");
	    
	    for(int i=1; i<=rc; i++)
	    {
	    	String username = lib.readExcelData(EXCEL_PATH_HRM, "invalidcred", i, 0);
	    	
	    	String pass = lib.readExcelData(EXCEL_PATH_HRM, "invalidcred", i, 1);
	    	
	    	driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys(pass);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[.=' Login ']")).click();
			Thread.sleep(2000);
	    }
	    
	    bt.closeBrowser();

	}

}
