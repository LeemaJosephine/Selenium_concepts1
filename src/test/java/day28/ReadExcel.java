package day28;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
  
  public static String[][] readExcel(String excelfile) throws IOException {
	  
	  XSSFWorkbook book=new XSSFWorkbook("./data/"+excelfile+".xlsx");  // open work book
		XSSFSheet sheet = book.getSheetAt(0);
		int rowcount = sheet.getLastRowNum(); 
		short columnCount = sheet.getRow(0).getLastCellNum(); 
		
		String [][] data= new String[rowcount][columnCount]; 
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				//System.out.println(cell.getStringCellValue());
				data[i-1][j]=cell.getStringCellValue();   
				
			}
		}
		book.close();
		return data;
  }
}
