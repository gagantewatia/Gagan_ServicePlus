package Utilis;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class InternationalCertExceldata 

{
	 @DataProvider(name="excelData")
	    public Object[][] userFormData() throws IOException
	    {
	 Object[][] data = getExcelData("C:\\Users\\SD329EZ\\OneDrive - EY\\Documents\\Babita\\Testing\\Testdata\\Registerationpage.xlsx", "InternationalCert");
	        return data;
	    }

	   

	    public String[][] getExcelData(String fileName, String sheetName) throws IOException {
			String[][] data = null;
			try {
				
				FileInputStream fis = new FileInputStream(fileName);
				@SuppressWarnings("resource")
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheet(sheetName);
				XSSFRow row = sheet.getRow(0);
				int noOfRows = sheet.getPhysicalNumberOfRows();
				int noOfCols = row.getLastCellNum();
				XSSFCell cell;
				data = new String[noOfRows - 1][noOfCols];

				for (int i = 1; i < noOfRows; i++) {
					for (int j = 0; j < noOfCols; j++) {
						row = sheet.getRow(i);
						cell = row.getCell(j);
					if(cell.getCellType()==CellType.NUMERIC)
					{
						DataFormatter dataformatter=new DataFormatter();
						String value=dataformatter.formatCellValue(cell);
						data[i - 1][j] = value;
						
					}
					else if(cell.getCellType()==CellType.STRING)
					{
					
						data[i - 1][j] = cell.getStringCellValue();
					}
				}
				}
			}
			catch (Exception e)
			{
				System.out.println("The exception is: " + e.getMessage());
			}
			return data;
		}
	    
}
	    
	   

