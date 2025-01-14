package Utilis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SKillIndiaExcel {

	 public ArrayList<String> getData(String testcaseName) throws IOException
	 {
	 //fileInputStream argument
	 ArrayList<String> a=new ArrayList<String>();
	 Properties prop=new Properties();
	 FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Excelfiles\\Testdata.xlsx");
	 XSSFWorkbook workbook=new XSSFWorkbook(fis);

	 int sheets=workbook.getNumberOfSheets();
	 for(int i=0;i<sheets;i++)
	 {
	 if(workbook.getSheetName(i).equalsIgnoreCase("Skill India"))
	 {
	 XSSFSheet sheet=workbook.getSheetAt(i);
	 //Identify Testcases column by scanning the entire 1st row

	 Iterator<Row>  rows= sheet.iterator();// sheet is collection of rows
	 Row firstrow= rows.next();
	 Iterator<Cell> ce=firstrow.cellIterator();//row is collection of cells
	 int k=0;
	 int coloumn = 0;
	 while(ce.hasNext())
	 {
	 Cell value=ce.next();

	 if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
	 {
	 coloumn=k;

	 }

	 k++;
	 }
	// System.out.println(coloumn);


	 while(rows.hasNext())
	 {

	 Row r=rows.next();

	 if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName))
	 {



	 Iterator<Cell>  cv=r.cellIterator();
	 while(cv.hasNext())
	 {
	 Cell c= cv.next();
	 if(c.getCellType()==CellType.STRING)
	 {

	 a.add(c.getStringCellValue());
	 }
	 else{

	 a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

	 }
	 }
	 }


	 }

	 }
	 }
	 return a;

	 }
}
