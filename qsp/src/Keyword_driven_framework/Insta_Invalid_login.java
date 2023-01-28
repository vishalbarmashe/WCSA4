package Keyword_driven_framework;

import java.io.IOException;

import org.openqa.selenium.By;

public class Insta_Invalid_login extends BaseTestInsta {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTestInsta bt = new BaseTestInsta();
		bt.openBrowser();
		
		Flib lib = new Flib();
		int rc = lib.rowCount(EXCEL_PATH_INSTA, "invalidcred");
		
		for(int i=1; i<=rc; i++)
		{
			String username = lib.readExcelData(EXCEL_PATH_INSTA, "invalidcred", i, 0);
			String password = lib.readExcelData(EXCEL_PATH_INSTA, "invalidcred", i, 1);
			
			driver.findElement(By.tagName("input")).sendKeys(username);
			Thread.sleep(1000);
			
			driver.findElement(By.name("password")).sendKeys(password);
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("div[class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.tagName("input")).clear();
			//Thread.sleep(1000);
			driver.findElement(By.name("password")).clear();
			//Thread.sleep(1000);
		}
		bt.closeBrowser();

	}

}
