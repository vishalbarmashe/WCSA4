package data_drivern_framework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalidcred_test_orangeHRM_using_excel_sheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		flib lib = new flib();
		int inv = lib.invalid_data("./data/orangeHRMTestData.xlsx", "invalidcred");
		for(int i=1; i<=inv; i++)
		{
			String username = lib.read_data("./data/orangeHRMTestData.xlsx", "invalidcred", i, 0);
			
			String password = lib.read_data("./data/orangeHRMTestData.xlsx", "invalidcred", i, 1);
			
			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[.=' Login ']")).click();
			Thread.sleep(2000);
		}
		driver.close();

	}

}
