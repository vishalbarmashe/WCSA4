package radio_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_inspect_option_on_silicon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.britannica.com/science/silicon");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@class='fancybox-item fancybox-close']")).click();

	}

}
