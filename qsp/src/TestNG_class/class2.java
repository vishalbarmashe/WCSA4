package TestNG_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class2 {
	static WebDriver driver;
	  @Test
	  public void mt() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.google.com");
		  
		  driver.switchTo().activeElement().sendKeys("Manual Testing");
	  }
}
