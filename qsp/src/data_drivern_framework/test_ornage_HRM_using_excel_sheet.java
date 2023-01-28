package data_drivern_framework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_ornage_HRM_using_excel_sheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		flib lib = new flib();
		
	    String username = lib.read_data("./data/orangeHRMTestData.xlsx", "validcred", 1, 0);
	    
	    String password = lib.read_data("./data/orangeHRMTestData.xlsx", "validcred", 1, 1);
	    
	    driver.findElement(By.name("username")).sendKeys(username);
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys(password);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[.=' Login ']")).click();
	    
	    driver.close();

	}

}
