package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_location_method_using_intex {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.intex.in/");
		
		WebElement Waste = driver.findElement(By.xpath("//span[.=' E-Waste Managment']"));
		Point loc = Waste.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		System.out.println(xaxis);
		System.out.println(yaxis);

	}

}
