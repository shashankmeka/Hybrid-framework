package TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Baseclass.Baseclass;
import PageLayer.Adminpage;
import PageLayer.LoginPage;

public class Adminpagetest extends Baseclass{
	
	LoginPage loginpage;
	Adminpage adminpage;
	
	@BeforeClass
	public void setup(){
		Baseclass.initialization();
		loginpage=new LoginPage();
		adminpage=new Adminpage();
	}
	
	@Test(priority=1)
	public void loginfuntion() {
		loginpage.typeUsername("Admin");
		loginpage.typePassword("admin123");
		loginpage.clickOnLoginButton();
	}
	
	@Test(priority=2)
	public void logoStatus() {
		boolean a=adminpage.logo();
		System.out.println("OrangeHRM logo is Display: "+a);
	}
	
	
	
	@Test(priority=3)
	public void adminpagefunction() throws InterruptedException {
		adminpage.clickonAdmin();
		adminpage.clickonAdd();
		adminpage.clickonuserrole();
		Thread.sleep(2000);
		adminpage.employeename("abcd");
		adminpage.userename("pqrs");
		adminpage.status();
		Thread.sleep(2000);
		
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}
	
	

}
