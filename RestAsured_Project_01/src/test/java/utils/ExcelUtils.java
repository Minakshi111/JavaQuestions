package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	String project_path= System.getProperty("user.dir");
	String excel_path= project_path+"/data/Data.xlsx";
	
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	
	static String path= "./data/Data.xlsx";    // Relative path
	
	public void ExcelUtils(String path, String sheetName) throws IOException
	{
		 book= new XSSFWorkbook(path);
		 sheet= book.getSheet(sheetName);
	}
	
	
	public static void getRowCount() throws IOException
	{		
			
		 book= new XSSFWorkbook(path);
		 sheet= book.getSheet("Sheet1");	
		
		int totalRow= sheet.getPhysicalNumberOfRows();
		System.out.println(totalRow);
		
		// If want to take the cell values in Object so that any data type can be taken
		
		
	}
	
	
	public static void getCellValue() throws IOException
	{
		
		 book= new XSSFWorkbook(path);
		 sheet= book.getSheet("Sheet1");	
		String value= sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		DataFormatter formatter= new DataFormatter();
		Object obj= formatter.formatCellValue(sheet.getRow(1).getCell(1));
		System.out.println("Object value is : "+obj);
		
	}
	
	public static void main(String[] str) throws IOException
	{
	
		getRowCount();
		getCellValue();
		
	}

}
