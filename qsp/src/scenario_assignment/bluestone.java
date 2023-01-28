package scenario_assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAiA76-dBhByEiwAA0_s9VAjiWCircnVntXMuR5bs9Pe6_9_PUrYwWK2cR5T-8-yWxRITHCOPxoCjRUQAvD_BwE");
		Thread.sleep(3000);
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement Target = driver.findElement(By.xpath("//a[.='Rings ']"));
		Actions act = new Actions(driver);
		act.moveToElement(Target).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@title='Diamond Rings'])[2]")).click();
		
		List<WebElement> popPrice = driver.findElements(By.xpath("//span[@class='b-price-left']"));
		for(WebElement p:popPrice)
		{
			String first = p.getText();
			System.out.println("Before apply filter price   :  "+first);
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='icon-ion-chevron-down'])[8]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
		
		
		List<WebElement> lowtohighPrice = driver.findElements(By.xpath("//span[@class='b-price-left']"));
		for(WebElement p1:lowtohighPrice)
		{
			String secound = p1.getText();
			System.out.println("After apply filter price   :  "+secound);
		}
		
		driver.close();

	}

}


