package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class context_click_using_radio_button {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91992/OneDrive/Desktop/WCSA4/radiobutton.html");
		
		WebElement radiobutton = driver.findElement(By.id("i4"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(radiobutton).perform();

	}

}
