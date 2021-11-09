package TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Baseclass.Baseclass;
import PageLayer.LoginPage;
import PageLayer.Myinfopage;

public class myinfopagetest extends Baseclass{
	
	LoginPage loginpage;
	Myinfopage myinfopage;
	
	@BeforeClass
	public void setup() {
		Baseclass.initialization();
		loginpage=new LoginPage();
		myinfopage=new Myinfopage();
	}
	
	@Test(priority=1)
	public void loginpagefunctionality() throws InterruptedException {
		loginpage.typeUsername(prop.getProperty("username"));
		loginpage.typePassword(prop.getProperty("password"));
		loginpage.clickOnLoginButton();
	}
	
	@Test(priority=2)
	public void myinfofunctionality() {
		myinfopage.clickonMyinfo();
		myinfopage.clickonEdit();
		myinfopage.typefirstname("Shashank");
		myinfopage.typemiddlename("Sanjay");
		myinfopage.typelastname("Meka");
		
		
	}
	
	@AfterClass
	
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
