package webdriver_Package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_parent_and_child_window {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement child = driver.findElement(By.xpath("//a[.='Open a popup window']"));
		
		child.click();
		
		
		
		Set<String> all = driver.getWindowHandles();
		
		for (String a:all)
		{
			System.out.println(a);
		}
		driver.quit();

	}

}
