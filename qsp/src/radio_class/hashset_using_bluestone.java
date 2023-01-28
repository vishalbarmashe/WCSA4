package radio_class;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hashset_using_bluestone {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/91992/OneDrive/Desktop/WCSA4/single_select_dropdown.html");
		
		WebElement option = driver.findElement(By.id("menu"));
		Select sel = new Select(option);
		
		List<WebElement> allOptions = sel.getOptions();
		
		HashSet<String> s = new HashSet<String>();
        for(int i=0;i<allOptions.size();i++)
        {
      	  WebElement opts = allOptions.get(i);
      	  String values = opts.getText();
      	  
      	  s.add(values);
  	  
        }
        
        for(String options:s)
        {
        	Thread.sleep(2000);
      	  System.out.println(options);
        }

	}

}


