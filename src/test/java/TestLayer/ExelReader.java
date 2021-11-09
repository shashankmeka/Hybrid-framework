package TestLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Baseclass.Baseclass;
import PageLayer.LoginPage;
import UtilsLayer.ExcelReader;

public class ExelReader extends Baseclass{
	LoginPage loginpage;
	@Test (dataProvider="OrangeHRM",priority=1)
	public void setup(String username, String password) throws InterruptedException {
		Baseclass.initialization();
		loginpage=new LoginPage();
		loginpage.typeUsername(username);
		loginpage.typePassword(password);
		Thread.sleep(2000);
	}
	
	

	@DataProvider(name="OrangeHRM")
	public Object [][] testData() {
		
		ExcelReader obj=new ExcelReader("C:\\Users\\admin\\eclipse-workspace\\HybridFramework1\\src\\main\\java\\TestdataLayer\\abc.xlsx");
		
		int totalRows=obj.getRows(0);
		
		Object [][] data =new Object[totalRows][2];
		
		for(int i=0;i<totalRows;i++)
		{
				data[i][0]=obj.getData(0, i, 0);
				data[i][1]=obj.getData(0, i, 1);
		}
		
		return data;
				
	}





}
