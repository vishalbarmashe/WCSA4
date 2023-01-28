package PageObjectModel;

import java.io.IOException;

public class actiTime_Logout extends BaseTest   {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		flib lib = new flib();
		
		login_page lp = new login_page(driver);
		
		lp.actiTime_valid_login(lib.readPropertyData(PROP_PATH, "Username"),lib.readPropertyData(PROP_PATH, "Password"));
        Thread.sleep(2000);
        
        home_page hp = new home_page(driver);
        
        hp.getUsersTab();
        
        Thread.sleep(2000);
        
        hp.getLogoutButton();
        
        
        bt.closeBrowser();
        
        
        
	}

}
