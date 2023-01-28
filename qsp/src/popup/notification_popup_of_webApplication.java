package popup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification_popup_of_webApplication {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		//Thread.sleep(2000);
		co.addArguments("--disable-notification");
		
		//co.addArguments("-start-maximize");
		
		
		co.addArguments("-start-maximize");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://in.puma.com/in/en?gclid=Cj0KCQiA5NSdBhDfARIsALzs2EATML2wgKSN-vOEUEDwgXzOhejcN9cfsIvSOFZhHSGf_FK627WHAE4aAiHfEALw_wcB&utm_aud=MULT&utm_campaign=AFF_OTH_CPO_MULT_OLC_iCubesWire_616&utm_medium=AFF&utm_obj=OLC&utm_source=OTH-CPO");
		//driver.manage().window().maximize();
	}

}
