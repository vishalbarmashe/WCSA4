package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime_using_related_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://dell/login.do");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");//User name text field
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");//password TextField
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='initial']")).click();//Click on login button
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();//click on task tab
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/project/customers_projects.do']")).click();//click on project & customers tab
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();//click on create customers tab
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");//select on text field
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();//click on submit button
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/project/customers_projects.do']")).click();//click on create project tab
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[@value='5']")).click();//click on drop down button
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@name='selectedCustomer']")).click();//click on select customer tab
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Create New Project']")).click();//click on new project 
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//select[@name='customerId']")).click();//click on customer id drop down
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[@value='5']")).click();//click on drop down
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("");//select text field
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='createProjectSubmit']")).click();//click on submit button
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='content users']")).click();//click on users tab
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();//click on create new user tab
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("");//select user name text field
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("");//select password text field
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("");//select retype password text field
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("");//select first name text field
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("");//select last name text field
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();//click on check box
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@id='ext-gen20']")).click();//click on calendar
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='ext-gen52']")).click();//click on change date button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='ext-gen52']")).click();//click on change date button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='ext-gen52']")).click();//click on change date button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='ext-gen52']")).click();//click on change date button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='ext-gen52']")).click();//click on change date button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='ext-gen52']")).click();//click on change date button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='ext-gen52']")).click();//click on change date button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='ext-gen52']")).click();//click on change date button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='ext-gen52']")).click();//click on change date button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='ext-gen52']")).click();//click on change date button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='ext-gen52']")).click();//click on change date button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='ext-gen52']")).click();//click on change date button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='ext-gen82']")).click();//click on OK button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@for='right12']")).click();//click on check box
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@for='right1']")).click();//click on check box
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='rightGranted[2]']")).click();//click on check box
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='rightGranted[13]']")).click();//click on check box
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@for='right5']")).click();//click on check box
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@for='right7']")).click();//click on check box
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@for='right10']")).click();//click on check box
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='rightGranted[2]']")).click();//click on check box
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@for='right11']")).click();//click on check box
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();//click on submit button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='content tt']")).click();//click on task tab
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Cancel the process']")).click();//click on cancel the process button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();//click on logout
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manager");//select user name text field
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager123");//select password text field
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='initial']")).click();//click on login button
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();//click on task tab
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();//click on logout
		Thread.sleep(1000);
		
		driver.close();

	}

}
