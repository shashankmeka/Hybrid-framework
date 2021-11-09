package TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Baseclass.Baseclass;
import UtilsLayer.JSMethod;
import UtilsLayer.Screenshot;

public class JSmethodTest extends Baseclass{

	Screenshot ss;
	LoginPagetest lpt;
	JSMethod js;
	
	@BeforeClass
	public void setUp() {
		Baseclass.initialization();
		ss=new Screenshot();
		lpt=new LoginPagetest();
		js=new JSMethod();
	}
	
	@Test(priority=1)
	public void LoginFunction() throws InterruptedException {
		lpt.LoginFunctionality();
	}
	
	@Test(priority=2)
	public void jsmethods() throws InterruptedException {
		JSMethod.alertPop();
		Thread.sleep(4000);
		JSMethod.captureTitle();
		JSMethod.captureUrl();
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		System.out.println("Loginpage test done");
		Thread.sleep(3000);
		driver.close();
}
}