package scenario_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone02 {
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
		
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@target='_blank'])[17]")).click();
		//Thread.sleep(5000);
		
		
		//WebElement size = driver.findElement(By.xpath("//span[@class='size-box-overlay']"));
		
		//Actions act1 = new Actions(driver);
		//act1.moveToElement(size).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		//WebElement buy = driver.findElement(By.xpath("//div[@class='buynow-block col-xs-7']"));
		
		//Actions act1 = new Actions(driver);
		//act1.doubleClick(buy).perform();
	}

}
