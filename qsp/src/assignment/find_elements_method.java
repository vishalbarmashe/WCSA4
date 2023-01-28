package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_elements_method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("jalebi");
		Thread.sleep(2000);
		
		List<WebElement> suggetions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for (WebElement s:suggetions) {
			Thread.sleep(1000);
			System.out.println(s.getText());
		}
		driver.close();
	}
}
