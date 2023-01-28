package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_selected_method_using_actiTime {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://dell/login.do");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		WebElement Checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		boolean check = Checkbox.isSelected();
		System.out.println(check);

	}

}
