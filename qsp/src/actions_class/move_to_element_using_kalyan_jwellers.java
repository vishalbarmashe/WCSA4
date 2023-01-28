package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class move_to_element_using_kalyan_jwellers {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.kalyanjewellers.net/?utm_campaign=Kalyan%20Brand%20Diwali%202021&AdGroup=&utm_device=c&utm_term=kalyan%20jwellers&matchtype=b&adposition=&utm_medium=cpc&utm_source=google&gclid=CjwKCAiAqaWdBhAvEiwAGAQltpQf");
		
		WebElement jwl = driver.findElement(By.xpath("//a[.='Jewellery']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(jwl).perform();
		
		driver.findElement(By.xpath("//a[.='Gold']")).click();
		
		
	}

}
