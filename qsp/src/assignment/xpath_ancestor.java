package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_ancestor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.lexus.com/");
		Thread.sleep(2000);
		
		String car = driver.findElement(By.xpath("(//button[@class='sc-jRQBWg hIcqQX sc-llYSUQ zrefG'])[1]/ancestor::div[@class='sc-cxpSdN kPZzpJ']")).getText();
		Thread.sleep(2000);
		
		System.out.println(car);

		driver.close();

	}

}
