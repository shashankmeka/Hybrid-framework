package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Baseclass.Baseclass;

public class ExcelReader extends Baseclass{
	
	public static FileInputStream fis;
	public static File f;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	public ExcelReader(String exelpath) {
		
		f=new File(exelpath);
		try {
			fis=new FileInputStream(f);
			workbook=new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		
	//capture excel sheet
		public String getData(int sheetindex, int row, int col)
		{
		sheet=workbook.getSheetAt(sheetindex);
			String data=sheet.getRow(row).getCell(col).getStringCellValue();
			return data;
		}
		
		//count the row in excel sheet
		public int getRows(int sheetindex) {
			int rowsno=workbook.getSheetAt(sheetindex).getLastRowNum();
			rowsno=rowsno+1;
			return rowsno;
		}
		
		//count the column in excel sheet
		public int getColumn(int sheetindex) {
			int column=workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
			return column;
		}

	
}
