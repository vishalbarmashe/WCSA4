package scenario_assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop_action_using_jqueryui_webpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
        WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		//Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions act = new Actions(driver);
		//Thread.sleep(2000);
		act.dragAndDrop(src, target).perform();

	}

}
