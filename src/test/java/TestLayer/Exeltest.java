package TestLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Baseclass.Baseclass;
import UtilsLayer.ExcelReader;
ExcelReader e;
public class Exeltest extends Baseclass{
	@Test
	public void setup() {
		
//		Baseclass.initialization();
		ExcelReader e=new ExcelReader("C:\\Users\\admin\\eclipse-workspace\\HybridFramework1\\src\\main\\java\\TestdataLayer\\abc.xlsx");
		e.getColumn(0);
		e.getRows(0);
	}
	
//			public Object[][] attachdata()	{
//				
//				int rowNo=obj.getRowsnumber(0);
//				Object [][]provide=new Object [rowNo][2];
//				for(int i=0; i<rowNo; i++) {
//					provide[i][0]=obj.getData(0,i,0);
//					provide[i][1]=obj.getData(0,i,1);
//				}
//			return provide;
//			}
			
		}



		
	


