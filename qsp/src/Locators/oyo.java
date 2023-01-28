package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oyo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.oyorooms.com/?utm_source=google&utm_medium=cpc&utm_device=c&utm_campaign=India_SEM_Brand_generic&utm_campaignid=1701551904&utm_adgroup=71982097371&utm_content=538023998106&utm_keyword=oyo&gclid=CjwKCAiAhKycBhAQEiwAgf19ejFLgep5hufaoXyQ8zwtPycDASM8XeDxoLfT9rJOzaBGDr91AEN-jhoCBa4QAvD_BwE");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[class='c-nn640c headerMDD__secondaryItem d-text14']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("autoComplete__header")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.close();

	}

}
