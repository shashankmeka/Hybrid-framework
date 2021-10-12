package TestLayer;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Baseclass.Baseclass;
import PageLayer.LoginPage;
import UtilsLayer.Screenshot;

public class LoginPagetest extends Baseclass{

	LoginPage loginpage;
	Screenshot ss;
	
	@BeforeClass
	public void setUp() {
		Baseclass.initialization();
	}
	
	@Test
	public void LoginFunctionality() throws InterruptedException {
		loginpage=new LoginPage();
		loginpage.typeUsername(prop.getProperty("username"));
		loginpage.typePassword(prop.getProperty("password"));
		Thread.sleep(3000);
		loginpage.clickOnLoginButton();
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		System.out.println("Loginpage test done");
		ss.getScrensotofTC("sreenshot");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
	}
}
