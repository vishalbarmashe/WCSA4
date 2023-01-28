package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confermation_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vishal%20Barmashe/OneDrive/Desktop/WCSA4/confermation%20popup.html");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(2000);
        
        Alert a2 = driver.switchTo().alert();
        
      //  a2.accept();
        
        a2.dismiss();

	}

}
