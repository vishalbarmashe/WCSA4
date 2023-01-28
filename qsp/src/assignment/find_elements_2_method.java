package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_elements_2_method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("lexus");
		Thread.sleep(2000);
		
		List<WebElement> car = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		Thread.sleep(2000);
		
		for(int i=0; i<car.size(); i++) {
			WebElement c = car.get(i);
			Thread.sleep(1000);
			System.out.println(c.getText());
		}
	}
}
