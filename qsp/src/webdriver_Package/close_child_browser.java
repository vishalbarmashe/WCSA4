package webdriver_Package;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_child_browser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Thread.sleep(2000);
		
		String PW = driver.getWindowHandle();
		System.out.println(PW);
		
		Set<String> allW = driver.getWindowHandles();
		for(String all:allW)
		{
			System.out.println(all);
			if(!PW.equals(all))
			{
				driver.switchTo().window(all).close();
				System.out.println("IF BLOCK EXECUTED");
			}
			else
			{
				System.out.println("ELSE BLOCK EXECUTED");
			}
		}

	}

}
