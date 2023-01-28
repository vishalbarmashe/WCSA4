package radio_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone_using_action_radio_class{
	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAiA76-dBhByEiwAA0_s9VAjiWCircnVntXMuR5bs9Pe6_9_PUrYwWK2cR5T-8-yWxRITHCOPxoCjRUQAvD_BwE");
	Thread.sleep(3000);
	driver.findElement(By.id("denyBtn")).click();
	WebElement Target = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
	Actions act = new Actions(driver);
	act.moveToElement(Target).perform();
	WebElement band = driver.findElement(By.xpath("//a[.='Band']"));
	band.click();
	
	WebElement filter = driver.findElement(By.xpath("//span[@class='f-by']"));
	
	Actions act1=new Actions(driver);
    act1.doubleClick(filter).perform();
	
	
	Robot robo = new Robot();
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_C);
	
	robo.keyRelease(KeyEvent.VK_CONTROL);
	robo.keyRelease(KeyEvent.VK_C);
	
	driver.findElement(By.id("search_query_top_elastic_search")).click();
	
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	
	robo.keyRelease(KeyEvent.VK_CONTROL);
	robo.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	driver.findElement(By.name("submit_search")).click();
}


}
