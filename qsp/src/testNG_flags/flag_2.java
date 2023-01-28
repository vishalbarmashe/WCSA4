package testNG_flags;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag_2 {
	
	//In the enabled flag we pass either true or false
	//if we run this test case we pass true
	//if we don'trun this test case we pass true
	static WebDriver driver;
  @Test (enabled = true)
  public void science() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.google.com");
	  driver.switchTo().activeElement().sendKeys("Science");
	  
	  Reporter.log("This is science method");
  }
}
