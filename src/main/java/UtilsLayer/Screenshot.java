package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Baseclass.Baseclass;

public class Screenshot extends Baseclass{

	public static String getScrensotofTC(String screenShotName){
	String dateName=new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String Dist=System.getProperty("user.dir")+"/ScreenShot/"+screenShotName+dateName+".png";
	File finalDist = new File(Dist);
	try {
		FileUtils.copyFile(source, finalDist);
	} catch (IOException e) {
		e.printStackTrace();
	}
	return Dist;
}



}