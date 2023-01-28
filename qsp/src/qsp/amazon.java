package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Which browser you want to open!!");
		String browserValue = sc.nextLine();
		
		if (browserValue.equalsIgnoreCase("Chrome"))
        {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// To avoid IllegalStateException																						 
		WebDriver driver = new ChromeDriver();// to Launch chrome Browser
		//driver.manage().window().maximize();// to max the browser
		driver.manage().window().fullscreen();// to fullscreen browser
		Thread.sleep(6000);// to provide delay for 6 seconds to script
		driver.get("https://www.amazon.com/");// Launch the web application
		driver.manage().window().fullscreen();// to fullscreen browser
		Thread.sleep(6000);// to provide delay for 6 seconds to script
		driver.close();
	    }

	else if (browserValue.equalsIgnoreCase("Firefox"))
        {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\WCSA4 Workspace\\qsp\\drivers\\geckodriver.exe");//To avoid IllegalStateException			
	    WebDriver driver= new FirefoxDriver();// Launch firefox browser
		//driver.manage().window().maximize();// to maximize browser
		driver.manage().window().fullscreen();// to fullscreen browser
		Thread.sleep(6000);// to provide delay for 6 seconds to script
		driver.get("https://www.amazon.com/");// Launch the web application
		driver.manage().window().fullscreen();// to fullscreen browser
		Thread.sleep(6000);// to provide delay for 6 seconds to script
		driver.close();
	    }
      
        else
        {
		System.out.println("Enter valid input");
	    }
	}
}
