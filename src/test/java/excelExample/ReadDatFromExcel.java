package excelExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatFromExcel {
	
	
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegistrationData.xlsx");
		
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		//Sheet --- index ----- start from 0
//		workbook.getSheetAt(0);
		
		//Sheet - name ----- smokeTest
//		XSSFSheet sheet =  workbook.getSheet("Student");
		
		XSSFSheet sheet =  workbook.getSheet("smokeTest");
		
		
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
