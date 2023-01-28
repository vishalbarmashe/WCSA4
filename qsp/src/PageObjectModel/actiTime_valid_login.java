package PageObjectModel;

import java.io.IOException;

public class actiTime_valid_login extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		//for openbrowser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//for read the data from prop file
		flib lib = new flib();
		
		login_page lp = new login_page(driver);
		lp.actiTime_valid_login(lib.readPropertyData(PROP_PATH, "Username"),lib.readPropertyData(PROP_PATH, "Password"));

	}

}
