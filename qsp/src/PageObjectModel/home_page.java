package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class home_page {
	
	//to avoid stallRefrenceException
	
	@FindBy(xpath = "//a[.='Logout']") private WebElement LogoutButton;
	@FindBy(xpath = "//a[@class='content users']") private WebElement UsersTab;
	@FindBy(name = "usersSelector.selectedUser") private WebElement EnterTimeTrackDropDown;
	@FindBy(id = "SubmitTTButton") private WebElement SaveLeaveTimeButton;
	
	//initialization
	
	public home_page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Utilization
	
	public WebElement getLogoutButton() {
		return LogoutButton;
	}

	public WebElement getUsersTab() {
		return UsersTab;
	}

	public WebElement getEnterTimeTrackDropDown() {
		return EnterTimeTrackDropDown;
	}

	public WebElement getSaveLeaveTimeButton() {
		return SaveLeaveTimeButton;
	}
	
	//Operational Method
	
	public void LogoutButton() {
		LogoutButton.click();
	}
	
	public void UsersTab() {
		UsersTab.click();
	}
	
	public void EnterTimeTrackDropDown(int index) {
        Select sel = new Select(EnterTimeTrackDropDown);
		
		sel.selectByIndex(index);
	}
	
	public void SaveLeaveTimeButton() {
		SaveLeaveTimeButton.click();
	}
	
	

}
