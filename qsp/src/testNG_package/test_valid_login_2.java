package testNG_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test_valid_login_2 {
	static WebDriver driver;
  @Test
  @Parameters({"browser","Url","usn","pass"})
  public void setUp(String browserValue, String URL, String usr, String pass) throws InterruptedException {
	  if(browserValue.equals("chrome")) {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get(URL);
	  
	  driver.findElement(By.name("username")).sendKeys(usr);
	  Thread.sleep(2000);
	  driver.findElement(By.name("pwd")).sendKeys(pass);
	  Thread.sleep(2000);
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
  }
  
  else if(browserValue.equals("firefox"))
  {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get(URL);
	  
	  driver.findElement(By.name("username")).sendKeys(usr);
	  Thread.sleep(2000);
	  driver.findElement(By.name("pwd")).sendKeys(pass);
	  Thread.sleep(2000);
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
  }
}
  
  @AfterMethod
  public void close() {
	  driver.quit();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}