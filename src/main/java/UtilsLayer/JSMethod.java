package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Baseclass.Baseclass;

public class JSMethod extends Baseclass{
public static JavascriptExecutor js;
	
	public static void clickOnElement(WebElement wb) {
		js.executeScript("arguments[0].click();", wb);
	}

	public static void alertPop() {
		js.executeScript("alert('Welcome');");
	}
//	public void alertPop(String message) {
//		js.executeScript("alert('"+message+"');");
//	}

	public static void sendData(String data, WebElement wb) {
		js.executeScript("arguments[0].value='" + data + "';", wb);
	}

	public static void scrollDownUptoElement(WebElement wb) {
		js.executeScript("arguments[0].scrollIntoView(true);", wb);
	}

	public static void openApplication(String url) {
		js.executeScript("window.location='" + url + "'");
	}

	public static String captureTitle() {

		String actualTitle = js.executeScript("return document.title;").toString();

		return actualTitle;
	}

	public static String captureUrl() {

		String actualUrl = js.executeScript("return document.URL;").toString();
		return actualUrl;
	}

	public static void highLightElement(WebElement wb) {
		js.executeScript("arguments[0].style.border='3px solid red';", wb);
	}

	public static void refreshPage() {
		js.executeScript("history.go(0);");
	}


}
