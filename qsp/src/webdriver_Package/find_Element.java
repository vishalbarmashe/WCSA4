package webdriver_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class find_Element {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver ();
		//WebDriver driver = new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(10000);
		driver.close();
	}
}