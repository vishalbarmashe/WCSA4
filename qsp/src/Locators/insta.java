package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("admin@123");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div[class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm']")).click();
		Thread.sleep(2000);
		
		//driver.close();
	}

}
