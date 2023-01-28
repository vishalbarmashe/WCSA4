package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("9876543210");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		Thread.sleep(6000);
		
		driver.findElement(By.cssSelector("button[class^='_2KpZ6l _2HKlqd _3A")).click();
		Thread.sleep(6000);
		}
}
