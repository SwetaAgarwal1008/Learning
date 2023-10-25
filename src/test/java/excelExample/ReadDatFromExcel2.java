package excelExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatFromExcel2 {
	
	
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegisterStudent.xls");
		
//		String fileType = "";
//		
//		if(fileType.equalsIgnoreCase("xls")) {
//			
//			HSSFWorkbook workbook = new HSSFWorkbook(fis);
//			
//		}
		
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		
		//Sheet --- index ----- start from 0
//		workbook.getSheetAt(0);
		
		//Sheet - name ----- smokeTest
		HSSFSheet sheet =  workbook.getSheet("Student");
		
//		HSSFSheet sheet =  workbook.getSheet("smokeTest");
		
		
		int rowCount = sheet.getLastRowNum();
		int ColumnCount = sheet.getRow(0).getLastCellNum();
		
		
		
		System.out.println("Row Count: " + rowCount);
		System.out.println("Column Count: " + ColumnCount);
		
		
		
		for (int i = 1; i <=rowCount; i++) {
			
			//if header info are there ---- i = 1
			
			
			String fname = sheet.getRow(i).getCell(0).toString();
			String address  = sheet.getRow(i).getCell(4).toString();
			
			System.out.println("--------------------------------------");
			System.out.println("Details are: " + fname + " : " + address);
			
		}
		
		
		
		
	}

}
