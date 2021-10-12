package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Baseclass.Baseclass;

public class Adminpage extends Baseclass{

	@FindBy(xpath="//*[text()='Admin']")
	WebElement clickonAdmin;
	
	@FindBy(id="btnAdd")
	WebElement clickonAdd;
	
	@FindBy(xpath="//*[@alt='OrangeHRM']")
	WebElement logo;
	
	@FindBy(id="systemUser_userType")
	WebElement clickonuserrole;
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement employeename;
	
	@FindBy(id="systemUser_userName")
	WebElement username;
	
	@FindBy(id="systemUser_status")
	WebElement status;
	
	public Adminpage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean logo() {
		boolean logostatus=logo.isDisplayed();
		return logostatus;
	}
	public void clickonAdmin() {
		clickonAdmin.click();
	}
	public void clickonAdd() {
		clickonAdd.click();
	}
	public void clickonuserrole() {
		Select obj=new Select(clickonuserrole);
		obj.selectByVisibleText("Admin");
	}
	public void employeename(String ename) {
		employeename.sendKeys(ename);
	}
	public void userename(String uname) {
		username.sendKeys(uname);
	}
	public void status() {
		Select obj=new Select(status);
		obj.selectByVisibleText("Disabled");
		
	}
}
