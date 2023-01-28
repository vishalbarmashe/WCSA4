package scenario_assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone06 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAiA76-dBhByEiwAA0_s9VAjiWCircnVntXMuR5bs9Pe6_9_PUrYwWK2cR5T-8-yWxRITHCOPxoCjRUQAvD_BwE");
		Thread.sleep(3000);
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement Target = driver.findElement(By.xpath("//span[.='Offers ']"));
		Actions act = new Actions(driver);
		act.moveToElement(Target).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Up to 50% Off On Making Charges']")).click();
		
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='b-price-left']"));
		for(WebElement p:price)
		{
			String first = p.getText();
			System.out.println("Upto 50% Off On Making Charges     :  "+first);
		}
		
		driver.close();

	}

}


