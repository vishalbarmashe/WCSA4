package webdriver_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_page_source_code {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String SourceCode = driver.getPageSource();
		System.out.println(SourceCode);
		Thread.sleep(2000);
		driver.close();
		

	}

}
