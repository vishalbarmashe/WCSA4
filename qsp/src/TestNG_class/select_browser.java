package TestNG_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class select_browser {
	WebDriver driver;

	
  @Parameters("browserValue")
	
  @Test
  public void openBrowser(String browser) {
	  if(browser.equals("chrome")) {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  }
  }
}
