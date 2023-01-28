package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_elements_dominos {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://pizzaonline.dominos.co.in/menu?src=affiliate_DangleAds_099&utm_source=affiliate&utm_medium=DangleAds&utm_campaign=128&gclid=Cj0KCQiAqOucBhDrARIsAPCQL1a1if88teKedTkuTpTA6hwKbx2Kxus7zOAUZKEiHegLC_VSM3shaFQaAidrEALw_wcB");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='ng-binding']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='hamburger']")).click();
		Thread.sleep(1000);
		
		List<WebElement> List = driver.findElements(By.xpath("//li[@class='trck-odr-pntr']")); // side bar list
		for (WebElement L:List) {
			String opt = L.getText();
			Thread.sleep(2000);
			System.out.println(opt);
		}
	}
}



