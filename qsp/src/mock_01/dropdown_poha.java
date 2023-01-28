package mock_01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_poha {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(2000);
		List<WebElement> option = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for (int i=0; i<option.size(); i++)
		{
			WebElement all = option.get(i);
			String opt = all.getText();
			Thread.sleep(2000);
			System.out.println(opt);
		}

	}

}
 