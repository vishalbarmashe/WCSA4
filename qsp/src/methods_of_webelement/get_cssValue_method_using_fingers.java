package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_cssValue_method_using_fingers {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.fingers.co.in/");
		
		WebElement signatureSeries = driver.findElement(By.className("rubik_regular"));
		String cssProperty = signatureSeries.getCssValue("font-size");
		System.out.println(cssProperty);
	}

}
