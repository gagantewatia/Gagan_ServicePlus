package UMANG.Cowintest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;


public class testngdynamic {

	@Test
	 public static void TestSuite() throws IOException 
	{
		XmlSuite suite = new XmlSuite();
		suite.setName("TmpSuite");
		 
		XmlTest test = new XmlTest(suite);
		test.setName("TmpTest");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		  
		String[][] data = null;
		 Properties prop=new Properties();
		 FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Excelfiles\\Testclasses.xlsx");
		 XSSFWorkbook workbook=new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheet("Testclass");
			XSSFRow row = sheet.getRow(0);
			int noOfRows = sheet.getPhysicalNumberOfRows();
			int noOfCols = row.getLastCellNum();
			XSSFCell cell;
		
			data = new String[noOfRows - 1][noOfCols];
			XSSFCell x;
			XSSFCell y;
	
		
			for (int i = 1; i < noOfRows; i++) {
				
					row = sheet.getRow(i);
					x= row.getCell(0); //fetch class
					y=row.getCell(1); //fetch yes/no
				String	t=y.getStringCellValue();
				if(t.equalsIgnoreCase("Yes"))
				{
			     String x1;
					x1 = x.getStringCellValue();
					classes.add(new XmlClass(x1));
					test.setXmlClasses(classes);
				}
				}
		
			
			
			
	
		//classes.add(new XmlClass("UMANG.Cowintest.GSTNSearchtaxpayertestcases"));


		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		suite.addListener("UMANG.Cowintest.Listeners");
		TestNG tng = new TestNG();
	
		tng.setXmlSuites(suites);
		tng.run();

	}
		}

	

