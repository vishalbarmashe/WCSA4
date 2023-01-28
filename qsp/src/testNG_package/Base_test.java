package testNG_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test {
	static WebDriver driver;
  @BeforeMethod
  public void setUp() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("http://desktop-einln9q/login.do");
  }
  
  @AfterMethod
  public void clse() {
	  driver.quit();
  }
}
