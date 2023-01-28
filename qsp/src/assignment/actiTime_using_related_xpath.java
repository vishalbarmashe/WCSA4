package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime_using_related_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://dell/login.do");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");//User name text field
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");//password TextField
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='initial']")).click();//Click on login button
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();//click on logout
		Thread.sleep(1000);
		
		driver.close();

	}

}
