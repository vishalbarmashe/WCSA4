package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_elements_youtube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@aria-label='Show more']")).click(); // show more
		Thread.sleep(1000);
		
       List<WebElement> view = driver.findElements(By.xpath("//a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']")); // entire video name and view adddress
		for (WebElement s:view) {
			String opt=s.getText();
			Thread.sleep(2000);
			System.out.println(opt);
		}
		
		driver.close();
		
	}

}



