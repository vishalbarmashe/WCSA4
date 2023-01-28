package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vishal%20Barmashe/OneDrive/Desktop/WCSA4/alert%20popup.html");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
		
		a1.accept();
		
		//a1.dismiss();
		
		//String txt = a1.getText();
		//System.out.println(txt);
		
		//a1.sendKeys("admin");     //it is working only for if the textbox in the popup
	}

}
