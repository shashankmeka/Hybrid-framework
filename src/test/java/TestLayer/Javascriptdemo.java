package TestLayer;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Javascriptdemo {
	JavascriptExecutor js;
	WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium videos\\setup\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
//		js.executeScript("window.location='https://www.google.com';"); another way to open url
		 Thread.sleep(2000); 
		 WebElement wb=driver.findElement(By.id("btnLogin")); 
		 
		 js =(JavascriptExecutor)driver; 
		 js.executeScript("arguments[0].click();", wb); //click on element
		 String a=driver.findElement(By.xpath("//*[@style='color:red; font-weight:bold; z-index:100;']")).getText();
		 System.out.println(a);
		 
		 js.executeScript("document.getElementById('txtUsername').value='Admin';");
		 js.executeScript("document.getElementById('txtPassword').value='admin123';"); 
		 js.executeScript("arguments[0].value='New Login';", wb);
		 String title=js.executeScript("return document.title;").toString();
		 System.out.println(title);
		 
		 js.executeScript("arguments[0].click();",wb);
		 //Thread.sleep(2000); 
		 //js.executeScript("history.go(0);"); clear the entered history our refrash the window
		 js.executeScript("alert('Welcome to Homepage');");
		 Thread.sleep(2000); 
		 Alert alt = driver.switchTo().alert();
		 String alertMessage = alt.getText();
		 System.out.println("alert popup message: "+alertMessage);
		 alt.accept();
		 js.executeScript("alert('We are Going on Selenium Page');");
		 Thread.sleep(5000); 
		 Alert alt1 = driver.switchTo().alert();
		 alt1.accept();
	
	}
	@Test(priority=1)
	public void m1() throws InterruptedException {
		 
		 driver.navigate().to("https://www.selenium.dev/downloads/");
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); move end of the page
		 js.executeScript("alert('Welcome on selenium page we are scroll the page to middle');");
		 Thread.sleep(4000); 
		 Alert alt = driver.switchTo().alert();
		 alt.accept();
		 WebElement Article = driver.findElement(By.xpath("/html/body/div/main/div[5]/div[3]/div/div[1]/img")); //by using locator we move scroll page
		 js.executeScript("arguments[0].scrollIntoView(true);", Article);
		// js.executeScript("window.scollBy(0,900);"); //scroll by using pixel
		 Thread.sleep(2000); 
		 js.executeScript("alert('Now are Going on Facebook Page');");
		 Thread.sleep(4000); 
		 Alert alt1= driver.switchTo().alert();
		 alt1.accept();
	}
		 
	@Test(priority=2)
	public void m2() throws InterruptedException {
		 driver.navigate().to("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		
		 
		 WebElement fname= driver.findElement(By.name("firstname")); 
		 js.executeScript("arguments[0].style.border='4px dotted blue'", fname);
		 Thread.sleep(2000); 
		 
		 WebElement lname= driver.findElement(By.name("lastname")); 
		 js.executeScript("arguments[0].style.border='5px solid red'", lname); 
		 Thread.sleep(2000); 
		 
		 WebElement email= driver.findElement(By.name("reg_email__"));
		 String av = email.getCssValue("background-color");
		 js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", email); 
		 System.out.println(av);
		 Thread.sleep(2000); 
		
		 WebElement pass= driver.findElement(By.name("reg_passwd__"));
		 js.executeScript("arguments[0].style.background='pink'", pass);
		 Thread.sleep(2000); 
	}
		 @AfterClass
			public void teardown() throws InterruptedException {
			 js.executeScript("alert('Taking Screenshot.....');");
			 Thread.sleep(3000); 
			 Alert alt = driver.switchTo().alert();
			 alt.accept();
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File fs=ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\admin\\eclipse-workspace\\HybridFramework1\\Screenshot\\"+"JSmethod"+".png");
		 try {
			FileUtils.copyFile(fs,dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 js.executeScript("alert('Screenshot Take Successfully...');");
		 Thread.sleep(3000); 
		 Alert alt1 = driver.switchTo().alert();
		 alt1.accept();
		 
		 js.executeScript("alert('We close the browser now');");
		 Thread.sleep(3000); 
		 driver.quit();
		 
		}
}
