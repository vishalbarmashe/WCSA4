package Keyword_driven_framework;

import java.io.IOException;

import org.openqa.selenium.By;

public class test_insta_valid extends BaseTestInsta {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTestInsta bt = new BaseTestInsta();
		bt.openBrowser();
		
		Flib lib = new Flib();
		String usr = lib.readPropertyData(PROP_PATH, "UserInsta");
		String pass = lib.readPropertyData(PROP_PATH, "PassInsta");
		
		driver.findElement(By.tagName("input")).sendKeys(usr);
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div[class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm']")).click();
		Thread.sleep(2000);
		
		//bt.closeBrowser();

	}

}
