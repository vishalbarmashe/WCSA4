package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime_login_loop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://dell/login.do");
		Thread.sleep(2000);
		
		
		
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='initial']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
