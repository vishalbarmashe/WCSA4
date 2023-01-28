package java_script_executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Vishal%20Barmashe/OneDrive/Desktop/WCSA4/oneDisable%20and%20oneEnable%20webelement.html");
		
		  //typecasting of JavaScriptExecutor for handle Disable WebElement
		
		  JavascriptExecutor js =(JavascriptExecutor)driver;
		  Thread.sleep(2000);
		  js.executeScript("document.getElementById('i1').value='admin'");
		  Thread.sleep(2000);
		  js.executeScript("document.getElementById('i2').value='manager'");

	}

}
