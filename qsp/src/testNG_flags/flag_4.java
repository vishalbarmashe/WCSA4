package testNG_flags;


import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag_4 {
	
	static WebDriver driver;
	  @Test
	  public void oilStation() {
		  
		  Reporter.log("This is Oil Station method");
	  }
	  
	  
	  @Test (dependsOnMethods = "oilStation")
	  public void petrol() {
		  
		  Reporter.log("This is Petrol method");
	  }
	  
	  
	  @Test
	  public void diesel() {
		  
		  Reporter.log("This is Diesel method");
	  }
}
