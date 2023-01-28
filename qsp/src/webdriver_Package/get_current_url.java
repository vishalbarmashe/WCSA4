package webdriver_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_current_url {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String currentUrl = driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(currentUrl);
		driver.close();
	}

}
