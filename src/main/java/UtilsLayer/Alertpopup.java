package UtilsLayer;

import org.openqa.selenium.Alert;

import Baseclass.Baseclass;

public class Alertpopup extends Baseclass{

	public static Alert alt;
	
	public static void validateAlertAccept() {
		alt=driver.switchTo().alert();
		alt.accept();
	}
	
	public static void validateAlertDismiss() {
		alt=driver.switchTo().alert();
		alt.dismiss();
	}
		
	public  static void validatepopupSendkeys(String text) {
		alt=driver.switchTo().alert();
		alt.sendKeys(text);
	}
	
	public static String getalertText() {
		alt=driver.switchTo().alert();
		String capturetext=alt.getText();
		return capturetext;
	}
	
	
	
}
