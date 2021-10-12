package Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	public Baseclass(){
	prop=new Properties();
	
	try {
		fis=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\HybridFramework1\\src\\main\\java\\ConfigLayer\\config.properties");
		prop.load(fis);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		
	} catch (IOException e) {
		e.printStackTrace();
	}

}
public static void initialization() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium videos\\setup\\chromedriver.exe");
	driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
	
}
}
