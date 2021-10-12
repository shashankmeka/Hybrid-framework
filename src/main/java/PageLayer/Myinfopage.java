package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class Myinfopage extends Baseclass{

	@FindBy(xpath="//*[@id=\"menu_pim_viewMyDetails\"]/b")
	WebElement clickonMyinfo;
	
	@FindBy(id="btnSave")
	WebElement clickonEdit;
	
	@FindBy(id="personal_txtEmpFirstName")
	WebElement firstname;
	
	@FindBy(id="personal_txtEmpMiddleName")
	WebElement middlename;
	
	@FindBy(id="personal_txtEmpLastName")
	WebElement lastname;
	
	public Myinfopage() {
		PageFactory.initElements(driver, this);
	}
	
	public void typefirstname(String fname) {
		firstname.clear();
		firstname.sendKeys(fname);
	}
	
	public void typemiddlename(String mname)
	{
		middlename.clear();
		middlename.sendKeys(mname);
	}
	public void typelastname(String lname)
	{
		lastname.clear();
		lastname.sendKeys(lname);
	}

	public void clickonMyinfo() {
		clickonMyinfo.click();
		
	}

	public void clickonEdit() {
		clickonEdit.click();
		
	}
	
	
}
