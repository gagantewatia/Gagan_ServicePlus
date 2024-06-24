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

	public class Exceldataforascheduleappointmnets{


	    
	    @DataProvider(name="excelData")
	    public Object[][] userFormData() throws IOException
	    {
	 Object[][] data = getExceldatapin("C:\\Users\\SD329EZ\\OneDrive - EY\\Documents\\Babita\\Testing\\Testdata\\Registerationpage.xlsx", "PIN");
	        return data;
	    }

	   

	    public String[][] getExceldatapin(String fileName, String sheetName) throws IOException {
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
			catch (Exception e) {
				System.out.println("The exception is: " + e.getMessage());
			}
			return data;
		}
	    
	    // for District
	    
	    
	    @DataProvider(name="excelDataDistrict")
	    public Object[][] userFormDataDistrict() throws IOException
	    {
	 Object[][] data = getExcelDataDistrict("C:\\Users\\SD329EZ\\OneDrive - EY\\Documents\\Babita\\Testing\\Testdata\\Registerationpage.xlsx", "SlotSchedulebyDistrict");
	        return data;
	    }

	   

	    public String[][] getExcelDataDistrict(String fileName, String sheetName) throws IOException {
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
			catch (Exception e) {
				System.out.println("The exception is: " + e.getMessage());
			}
			return data;
	    }
	    //Stateselectmap
	    
	    
	    @DataProvider(name="excelDatamap")
	    public Object[][] userFormDatamap() throws IOException
	    {
	 Object[][] data = excelDatamap("C:\\Users\\SD329EZ\\OneDrive - EY\\Documents\\Babita\\Testing\\Testdata\\Registerationpage.xlsx", "Stateselectmap");
	        return data;
	    }

	   

	    public String[][] excelDatamap(String fileName, String sheetName) throws IOException {
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
			catch (Exception e) {
				System.out.println("The exception is: " + e.getMessage());
			}
			return data;
	    }
	    
	    //filters
	    
	    @DataProvider(name="excelDatafilter")
	    public Object[][] userFormData1() throws IOException
	    {
	 Object[][] data = getExcelDatafilter("C:\\Users\\SD329EZ\\OneDrive - EY\\Documents\\Babita\\Testing\\Testdata\\Registerationpage.xlsx", "FilteronCentersearch");
	        return data;
	    }

	  



		public String[][] getExcelDatafilter(String fileName, String sheetName) throws IOException {
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
			catch (Exception e) {
				System.out.println("The exception is: " + e.getMessage());
			}
			return data;
		}
	    
	}

