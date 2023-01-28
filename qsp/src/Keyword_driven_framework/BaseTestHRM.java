package Keyword_driven_framework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestHRM implements IAutoConstant {
	
	static WebDriver driver;
	
	public void OpenBrowser() throws IOException {
		
		Flib lib = new Flib();
		String browser = lib.readPropertyData(PROP_PATH, "Browser");
		String url = lib.readPropertyData(PROP_PATH, "URLOrange");
		
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}
		else
		{
			System.out.println("Choose valid Browser");
		}
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
