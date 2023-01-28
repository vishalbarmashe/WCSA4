package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click_using_html_file {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91992/OneDrive/Desktop/ass1.html");
		
		WebElement brows = driver.findElement(By.name("fileipload"));
		
		Actions act = new Actions(driver);
		act.doubleClick(brows).perform();

	}

}
