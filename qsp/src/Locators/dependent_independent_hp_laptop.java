package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependent_independent_hp_laptop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hp laptop");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Core i7']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Brand']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='HP']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Operating System']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Windows 11']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='3★ & above']")).click();
		Thread.sleep(2000);
		
		String laptop = driver.findElement(By.xpath("//div[contains(text(),'HP Victus Intel Core i7')]/../following-sibling::div[@class='col col-5-12 nlI3QM']//div[@class='_30jeq3 _1_WHN1']")).getText();
		Thread.sleep(2000);
		
		System.out.println(laptop+"Price of Laptop");
		
		driver.close();

	}

}
