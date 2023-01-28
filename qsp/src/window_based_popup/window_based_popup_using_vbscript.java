package window_based_popup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class window_based_popup_using_vbscript {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://desktop-einln9q/login.do");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");//User name text field
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");//password TextField
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='initial']")).click();//Click on login button
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//td[@class='navItem relative'])[6]")).click();
		
		driver.findElement(By.xpath("(//a[@class='item'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		WebElement brows = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act = new Actions(driver);
		act.doubleClick(brows).perform();
		
		Runtime.getRuntime().exec("C:\\Users\\Vishal Barmashe\\OneDrive\\Desktop\\WCSA4 Workspace\\qsp\\autoIT\\auto1.exe");
		Thread.sleep(2000);
		

	}
	
}
