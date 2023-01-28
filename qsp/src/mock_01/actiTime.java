package mock_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-einln9q/login.do");
		
		WebElement webpage = driver.findElement(By.xpath("(//td[@align='center'])[1]"));
		boolean name = webpage.isDisplayed();
		
		System.out.println(name);
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("admin");
		
		Thread.sleep(2000);
		
		username.clear();

		driver.close();
	}

}
