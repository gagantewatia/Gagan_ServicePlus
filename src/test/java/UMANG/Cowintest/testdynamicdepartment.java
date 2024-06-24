package UMANG.Cowintest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class testdynamicdepartment {
	@Test
		 public static void TestSuitedepartment() throws IOException 
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
			 XSSFSheet sheet = workbook.getSheet("Testdepartment");
				XSSFRow row = sheet.getRow(0);
				int noOfRows = sheet.getPhysicalNumberOfRows();
				int noOfCols = row.getLastCellNum();
				XSSFCell cell;
			
				data = new String[noOfRows - 1][noOfCols];
				XSSFCell x;
				XSSFCell y;
		
			
				for (int i = 1; i < noOfRows; i++) {
					
						row = sheet.getRow(i);
						x= row.getCell(0); //fetch department
						y=row.getCell(1); //fetch yes/no
					 
					  String ts=y.getStringCellValue();
					if(ts.equalsIgnoreCase("Yes"))
					{     
						 String t=x.getStringCellValue();
					
						 XSSFSheet sheet2 = workbook.getSheet("Testdepartmentandclasses");
							XSSFRow row1 = sheet2.getRow(0);
							int noOfRows1 = sheet2.getPhysicalNumberOfRows();
							int noOfCols1 = row1.getLastCellNum();
							XSSFCell cell1;
							String[][] data1 = null;
							data1 = new String[noOfRows1 - 1][noOfCols1];
							XSSFCell x1;
							XSSFCell y1;
					
						 
							for (int i1 = 1; i1 < noOfRows1; i1++) 
							{
								
									row1 = sheet2.getRow(i1);
									x1= row1.getCell(1); //fetch class
									y1=row1.getCell(0); //fetch department
								String	t1=y1.getStringCellValue();
								if(t1.equalsIgnoreCase(t))
								{
							     String x2;
									x2 = x1.getStringCellValue();
									classes.add(new XmlClass(x2));
									test.setXmlClasses(classes);
								}
						}
						
						
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
			
		

