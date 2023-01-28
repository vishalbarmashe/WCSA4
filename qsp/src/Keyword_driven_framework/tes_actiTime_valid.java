package Keyword_driven_framework;

import java.io.IOException;

import org.openqa.selenium.By;

public class tes_actiTime_valid extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib lib = new Flib();
		String usr = lib.readExcelData(EXCEL_PATH, "validcred", 1, 0);
		
		String pass = lib.readExcelData(EXCEL_PATH, "validcred", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(usr);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginbutton")).click();
		
		bt.closeBrowser();
		
		

	}

}
