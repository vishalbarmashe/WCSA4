package mock_01;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class eliminate_duplicate_using_treeset {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/91992/OneDrive/Desktop/WCSA4/single_select_dropdown.html");
		
		WebElement drop = driver.findElement(By.id("menu"));
		Select sel = new Select(drop);
	      List<WebElement> allOptions = sel.getOptions();
	      
	              TreeSet<String> s = new TreeSet<String>();
	              for(int i=0;i<allOptions.size();i++)
	              {
	            	  WebElement opts = allOptions.get(i);
	            	  String values = opts.getText();
	            	  s.add(values);
	            	  
	              }
	              
	              for(String options:s)
	              {
	            	  System.out.println(options);
	              }
	}

}
