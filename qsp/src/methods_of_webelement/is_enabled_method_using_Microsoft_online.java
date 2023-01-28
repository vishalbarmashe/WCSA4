package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_enabled_method_using_Microsoft_online {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://login.microsoftonline.com/common/oauth2/v2.0/authorize?client_id=4765445b-32c6-49b0-83e6-1d93765276ca&redirect_uri=https%3A%2F%2Fwww.office.com%2Flandingv2&response_type=code%20id_token&scope=openid%20profile%20https%3A%2F%2Fwww.office.com%2Fv2%2FOfficeHome.All&response_mode=form_post&nonce=638074049408641836.MThjZDM3MWUtMjFiYy00OTZhLWJkNjItZGI4NmYxYjBlNGVkYTI4NzY5Y2ItYmY0NC00YWI0LWI1MzQtYWE5MzIwMjc1OTFj&ui_locales=en-US&mkt=en-US&client-request-id=9568941f-a32e-4994-973d-e97827c9e728&state=aW5K6RV5cuyWdFfWPFjMscexIlcsMNXObz-LxJp1tp_yDsEXg4B7N3MoB_J1hNvMOYAaRRKHEZ7yyxmL7RuXJLDGtPEN1lwQVl1HuRbGP3aNoN0U7AiPssBYWiB7tRd3Ne0sZKf2H1edRt-PeftWw5zMO-AnNWy2HbLcKHmdeG-LvtCeYD6rsRlaekpy-O-gNagJkmvIl-KOUTBHT_Lxbh4STT4I5omouZSSjqvflJYDtcqPFP4qMG3XIO_za3eMitJQvM1R6Luuiw-NLL00noxbUwUN_KQFoOo2tb899E4&x-client-SKU=ID_NETSTANDARD2_0&x-client-ver=6.16.0.0");
		WebElement button = driver.findElement(By.id("idSIButton9"));
		boolean check = button.isEnabled();
		System.out.println(check);

	}

}
