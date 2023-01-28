package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();// to Launch chrome Browser
		driver.manage().window().fullscreen();// to fullscreen browser
		Thread.sleep(6000);// to provide delay for 6 seconds to script
		driver.close();// close the browser
	}
}
