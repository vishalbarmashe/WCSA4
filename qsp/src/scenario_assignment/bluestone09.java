package scenario_assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone09 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAiA76-dBhByEiwAA0_s9VAjiWCircnVntXMuR5bs9Pe6_9_PUrYwWK2cR5T-8-yWxRITHCOPxoCjRUQAvD_BwE");
		Thread.sleep(3000);
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement alljewellery = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(alljewellery).perform();
		
		driver.findElement(By.xpath("//a[.='Gold Coins']")).click();
		Thread.sleep(2000);
		
		List<WebElement> Price = driver.findElements(By.xpath("//span[@class='b-price-wrapper']"));
		for(WebElement p:Price)
		{
			String first = p.getText();
			System.out.println("Before apply 2GM filter price is   :  "+first);
		}
		
		WebElement weight = driver.findElement(By.xpath("//span[.='weight (Gram)']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(weight).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[.='2 Gram']")).click();
		Thread.sleep(2000);
		
		List<WebElement> lowPrice = driver.findElements(By.xpath("//span[@class='b-price-wrapper']"));
		for(WebElement p:lowPrice)
		{
			String first = p.getText();
			System.out.println("after apply 2GM filter price is   :  "+first);
		}
		
		driver.close();

	}

}
