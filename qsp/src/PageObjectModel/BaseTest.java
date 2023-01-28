package PageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements iAutoConstant {
	
	//to Open Browser
	static WebDriver driver;
	public void openBrowser() throws IOException {
		flib lib = new flib();
	    String browserValue = lib.readPropertyData(PROP_PATH, "Browser");
	    String url = lib.readPropertyData(PROP_PATH, "URL");
	    
	    if(browserValue.equals("chrome"))
	    {
	    	driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    	driver.get(url);
	    }
	    else if(browserValue.equals("firefox"))
	    {
	    	driver = new FirefoxDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    	driver.get(url);
	    }
	    else
	    {
	    	System.out.println("Choose Valid Browser");
	    }
	}
	
	//to close browser
	public void closeBrowser() {
		driver.quit();
	}

}
