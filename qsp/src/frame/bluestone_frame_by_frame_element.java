package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bluestone_frame_by_frame_element {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fc_widget")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("frame element");
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-email")).sendKeys("frameelement@xyz.com");
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='fc-button']")).click();
		
	}

}
