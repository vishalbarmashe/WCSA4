package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class send_keys_method_using_flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hp laptop");
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//Thread.sleep(2000);

	}
	
	

}
