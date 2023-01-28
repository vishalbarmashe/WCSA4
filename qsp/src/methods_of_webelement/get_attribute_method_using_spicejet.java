package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_attribute_method_using_spicejet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.spicejet.com/");
		WebElement hotel = driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8'])[1]"));
		String attirbuteValue = hotel.getAttribute("style");
		System.out.println(attirbuteValue);

	}

}
