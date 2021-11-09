package TestLayer;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Baseclass.Baseclass;
import PageLayer.LoginPage;
import UtilsLayer.Alertpopup;
import UtilsLayer.JSMethod;
import UtilsLayer.Screenshot;

public class LoginPagetest extends Baseclass{
	static JSMethod j;
	LoginPage loginpage;
	Screenshot ss;
	Alertpopup alp;
	
	@BeforeClass
	public void setUp() {
		Baseclass.initialization();
	}
	
	@Test(priority=1)
	public void LoginFunctionality() throws InterruptedException {
		loginpage=new LoginPage();
		loginpage.typeUsername(prop.getProperty("username"));
		loginpage.typePassword(prop.getProperty("password"));
//		ss.passedScreenshot("loginpage");
		Thread.sleep(2000);
		
		loginpage.clickOnLoginButton();
	}
	
	@Test(priority=2)
	public void alertpopupFunctionality() throws InterruptedException {
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("alert('Welcome');");
		j=new JSMethod();
		JSMethod.alertPop();
		JSMethod.captureTitle();
		Thread.sleep(3000);
		Alertpopup.validateAlertAccept();

	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		System.out.println("---	Loginpage test done	---");
		Thread.sleep(2000);
		driver.close();
	}
}
