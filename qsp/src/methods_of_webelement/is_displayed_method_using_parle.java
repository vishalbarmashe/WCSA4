package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_displayed_method_using_parle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.parleproducts.com/");
		driver.findElement(By.xpath("//span[.='×']")).click();
		WebElement text = driver.findElement(By.xpath("//span[@data-hover='CAREERS']"));
		boolean careers = text.isDisplayed();
		System.out.println(careers);

	}

}
