package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_tagname_method_using_britannia {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://britannia.co.in/");
		WebElement text = driver.findElement(By.xpath("//li[@data-subnav='products']"));
		String product = text.getTagName();
		System.out.println(product);
	}
}
