package webdriver_Package;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_parent_and_child_window_without_quit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String PW = driver.getWindowHandle();
		System.out.println(PW);
		System.out.println("--------------");
		
		Set<String> PandCW = driver.getWindowHandles();
		for(String all:PandCW)
		{
			System.out.println(all);
			driver.switchTo().window(all).close();
		}

	}

}
