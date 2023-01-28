package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_rect_method_using_milton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.milton.in/");
		WebElement text = driver.findElement(By.id("logo"));
		Rectangle rect = text.getRect();
		int height = rect.getHeight();
		int width = rect.getWidth();
		int xaxis = rect.getX();
		int yaxis = rect.getY();
		System.out.println(height+": height of text");
		System.out.println(width+": width of text");
		System.out.println(xaxis+": xaxis of text");
		System.out.println(yaxis+": yaxis of text");
	}

}
