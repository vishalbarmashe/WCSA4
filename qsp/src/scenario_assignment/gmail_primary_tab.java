package scenario_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail_primary_tab {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("vishalbarmashe19@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();

	}

}
