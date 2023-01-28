package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class steelBird {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.steelbirdhelmet.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("i[class='userico']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("LoginForm_email")).sendKeys("9876543210");
		Thread.sleep(2000);
		
		driver.findElement(By.id("LoginForm_password")).sendKeys("password");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class='btn login100-form-btn m-b-16']")).click();
		Thread.sleep(2000);
		
		driver.close();

	}

}



