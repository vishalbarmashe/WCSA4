package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath_case4 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver ();
		WebDriver driver = new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en?gclid=Cj0KCQiA1sucBhDgARIsAFoytUtg91zhq64RuqJguIGl8vN396R-z0FsW33ctI22n-4gq64mIH88o-AaAva4EALw_wcB&utm_aud=OTH&utm_campaign=BS_GGL_SEA_TXT_OTH_Brand_New&utm_medium=BS&utm_obj=OLC&utm_source=GGL");
		Thread.sleep(2000);
		
		driver.findElement(By.id("icon")).clear();
		Thread.sleep(2000);

	}

}



