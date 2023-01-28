package Keyword_driven_framework;

import java.io.IOException;

import org.openqa.selenium.By;

public class test_orangeHRM_valid extends BaseTestHRM {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTestHRM bth = new BaseTestHRM();
		bth.OpenBrowser();
		Thread.sleep(2000);
		Flib lib = new Flib();
		String usr = lib.readPropertyData(PROP_PATH, "UserHRM");
		String pass = lib.readPropertyData(PROP_PATH, "PassHRM");
		
		driver.findElement(By.name("username")).sendKeys(usr);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		Thread.sleep(2000);
		bth.closeBrowser();

	}

}
