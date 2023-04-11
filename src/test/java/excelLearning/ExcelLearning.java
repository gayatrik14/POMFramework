package excelLearning;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelLearning {
	
	@Test
	public void excelLearning() throws IOException {
		
		String projPath = System.getProperty("user.dir"); 
		System.out.println(projPath);
		
		XSSFWorkbook workBook = new XSSFWorkbook(projPath+"/excel/keywords.xlsx");
		XSSFSheet workSheet = workBook.getSheetAt(0);
		int rowCount = workSheet.getPhysicalNumberOfRows(); 	//how many rows has value
		System.out.println(rowCount);
		
		String keyword;
		int result;
		
		for(int i =1;i<rowCount;i++) {
			keyword=workSheet.getRow(i).getCell(0).getStringCellValue();
			result = (int) workSheet.getRow(i).getCell(1).getNumericCellValue();
			System.out.println(keyword + "\t \t" + result);
		}
		workBook.close();
	}
	
	
	@Test
	public void excelLearn() throws Exception {
		String path = System.getProperty("user.dir");
		XSSFWorkbook workbook = new XSSFWorkbook(path+"/excel/keywords.xlsx");
		XSSFSheet worksheet = workbook.getSheetAt(0);
		int rows = worksheet.getPhysicalNumberOfRows(); 
		
		String keyword;
		int result;
		for(int i=1;i<rows;i++) {
			keyword=worksheet.getRow(i).getCell(0).getStringCellValue();
			result=(int) worksheet.getRow(i).getCell(1).getNumericCellValue();
			
			System.out.println(keyword + "\t \t" + result);
			
		}
		workbook.close();
	}

}
