package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_case7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.dhl.com/in-en/home.html?locale=true");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@id='onetrust-accept-btn-handler'])[1]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@class='has-icon  '])[2]")).click();
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		//driver.findElement(By.xpath("(//a[@class='c-nav--logo '])[1]")).click();
		//Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@class='has-icon  '])[1]")).click();
		Thread.sleep(4000);
	}
}




