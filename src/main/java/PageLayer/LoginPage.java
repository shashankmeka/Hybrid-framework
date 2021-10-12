package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class LoginPage extends Baseclass{

	//we created Object repositories with the help of POM with Page Factory
		@FindBy(name="txtUsername")
		WebElement username;
		
		@FindBy(name="txtPassword")
		WebElement password;
		
		@FindBy(xpath="//*[@name='Submit']")
		WebElement loginbutton;
		
		//Initialize OR 
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		public String validatepageTitle() {
			String title=driver.getTitle();
			return title;
		}
		
		public void typeUsername(String uname) {
			username.sendKeys(uname);
		}
		
		public void typePassword(String pass)
		{
			password.sendKeys(pass);
		}
		
		public void clickOnLoginButton() {
			loginbutton.click();
		}
}
