package select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselect_by_value_using_actiTime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.get("file:///C:/Users/91992/OneDrive/Desktop/WCSA4/multiple_select_dropdown.html");
		
		WebElement dropdown = driver.findElement(By.id("i1"));
		Select sel = new Select(dropdown);
		Thread.sleep(3000);
		sel.selectByValue("v3");
		Thread.sleep(3000);
		sel.deselectByValue("v3");

	}

}
