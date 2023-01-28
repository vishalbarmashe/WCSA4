package testNG_flags;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag_1 {
	static WebDriver driver;
  @Test (description = "This Test Case For Mathematics")
  public void mathematics() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.google.com");
	  driver.switchTo().activeElement().sendKeys("Mathematics");
	  
	  Reporter.log("This is mathematics method",true);
	  
	  
  }
}
