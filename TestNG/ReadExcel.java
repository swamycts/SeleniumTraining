package testcase;

import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] excelData(String excelName) throws IOException {
		// TODO Auto-generated method stub

		//to get into work book
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+excelName+".xlsx/");
	
		//to get into the sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//to get the right sheet using index
		//XSSFSheet sheet = wb.getSheetAt(0);
		
		//to get into the right row
		//XSSFRow row = sheet.getRow(1);
		
		//to get into the cell
		//XSSFCell cell = row.getCell(0);
		
		//to read a data from the cell
		//String stringCellValue = cell.getStringCellValue();
		
		//System.out.println(stringCellValue);
		
		int rowCount = sheet.getLastRowNum();
		
		short cellCount = sheet.getRow(0).getLastCellNum();

		//declare 2d array
		//String[][] data = new String[2][3]; taken by Data Provider - from Create Lead
		
		String[][] data = new String[rowCount][cellCount];
		
		for (int i = 1; i <= rowCount; i++) {
		
			for (int j = 0; j < cellCount; j++) {
				
		 
		String CellValue = sheet.getRow(i).getCell(j).getStringCellValue();
		data[i-1][j] = CellValue;
		System.out.println(CellValue);
		
		
		
		}
		}
		
		
		wb.close();
		return data;
		
		
		
	}

}
