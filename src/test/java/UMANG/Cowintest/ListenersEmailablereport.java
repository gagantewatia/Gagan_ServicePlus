package UMANG.Cowintest;



import java.io.File;
import java.io.IOException;

import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;


import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;


import Resources.Base2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;




public class ListenersEmailablereport extends Base2 implements ITestListener{

    //private ExtentReports extentReports;
  //  private ExtentTest extentTest;
    ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
    private List<String[]> failedTestInfoList = new ArrayList<>();
    private ExtentTest  Servicewisecount;
    private ExtentTest summaryTest;

    String previousClassName = null; 
    private Map<String, Integer> classPassCount = new HashMap<>();
    private Map<String, Integer> classFailCount = new HashMap<>();
    
    @Override
    public void onStart(ITestContext context) {
    	
    	 if (extentReports == null) {
			   
			   deleteOldReport();

			   String appName = System.getProperty("app.name");
				//System.out.println("Gagan :" +appName);
				if(appName==null)
			appName="index";		
    	 String fileSeparator = File.separator;
    	  String path1 = System.getProperty("user.dir") + fileSeparator + "reports" + fileSeparator + appName + ".html";
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(path1).viewConfigurer().viewOrder()
				.as(new ViewName[] {  ViewName.TEST, ViewName.CATEGORY,ViewName.DASHBOARD, ViewName.EXCEPTION,
		                ViewName.AUTHOR, ViewName.DEVICE, ViewName.LOG })
				.apply();

    	
       // htmlReporter.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
      
      
        htmlReporter.config().setReportName("Web Automation Results");
		htmlReporter.config().setDocumentTitle("Test Results");
	
		  extentReports = new ExtentReports();
		  extentReports.attachReporter(htmlReporter);
		  
	/*	String pathPdf =System.getProperty("user.dir") + fileSeparator + "reports" + fileSeparator +"indexpdf.pdf";
		
			 ExtentPDFReporter pdfReport = new ExtentPDFReporter(pathPdf);

			pdfReport.config().setTitle("Test Results");
		
		 extentReports.attachReporter(pdfReport);*/
		 extentReports.setSystemInfo("Environment", "Production");
		 extentReports.setSystemInfo("Url", "web.umang.gov.in");
		 extentReports.setSystemInfo("Tester", "UMANG Testing TEAM");
		 Servicewisecount = extentReports.createTest("<b><i>----SERVICE WISE STATUS----</i></b>");
		 summaryTest = extentReports.createTest("<b><i>----FAILED TEST SUMMARY----</i></b>");
		// summaryTest.assignCategory("Failed Summary");
		   summaryTest.log(Status.FAIL,"Failed List (Created at the end of execution)");
		  // Create the "Failed Test Summary" report at the start
	        
		  
		   
		   
    }
    }
    @Override
    public void onTestStart(ITestResult result) {
    	

    	test= extentReports.createTest(result.getMethod().getMethodName());

    	extentTest.set(test);
  
        
    }

	@Override
	public void onTestSuccess(ITestResult result) {
      //test.log(Status.PASS, "Test Passed");
		  String className = result.getTestClass().getName();
	        incrementPassCount(className);
		extentTest.get().log(Status.PASS, "Test Passed");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		// TODO Auto-generated method stub
		
		extentTest.get().log(Status.SKIP, "SKipped");
		
	}

    @Override
    public void onTestFailure(ITestResult result) {
        String methodName = result.getMethod().getMethodName();
     String fullClassName = result.getTestClass().getName();

 

     incrementFailCount(fullClassName);
        String screenshotPath = null;
		try {
			screenshotPath = capture();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Replace this with the actual path to your screenshot
        String errorMessage = result.getThrowable().getMessage();

        
        extentTest.get().log(Status.FAIL, "Test Case Failed: " + methodName);
        extentTest.get().log(Status.FAIL, "Error Message: " + errorMessage);
        extentTest.get().addScreenCaptureFromPath(screenshotPath);
        
     
      
        String[] failedTestInfo = {fullClassName, methodName, screenshotPath};
    
        failedTestInfoList.add(failedTestInfo);
       
  }

        	    
        	
        	
      

  
	private int countMethodsForClass(String className) {
	    int count = 0;
	    for (String[] failedTestInfo : failedTestInfoList) {
	        if (failedTestInfo[0].equals(className)) {
	            count++;
	            
	        }
	    }
	    
	
	    return count;
	}

    @Override
    public void onFinish(ITestContext context) {
	
    	
    	if (!failedTestInfoList.isEmpty())
    	{
            StringBuilder failedTestTable = new StringBuilder("<table border='1'><tr>");
            failedTestTable.append("<th style='padding: 8px; background-color: #f6746a;'>Service Name</th>");
            failedTestTable.append("<th style='padding: 8px; background-color: #f6746a;'>Method Name</th>");
            failedTestTable.append("<th style='padding: 8px; background-color: #f6746a;'>Screenshot</th></tr>");

            String previousClassName = null;
            for (String[] failedTestInfo : failedTestInfoList) {
                String className = failedTestInfo[0];
                String methodName = failedTestInfo[1];
                String screenshotPath = failedTestInfo[2];

                String screenshotLink = "<a href='" + screenshotPath + "'>Screenshot</a>";

                if (previousClassName == null || !previousClassName.equals(className)) {
                    // Add a new row for a new class
                    failedTestTable.append("<tr>");
                    failedTestTable.append("<td style='padding: 8px; background-color: #f7e8e8 ; text-align: left;' rowspan='")
                            .append(countMethodsForClass(className))
                            .append("'>")
                            .append(className)
                            .append("</td>");
                    failedTestTable.append("<td style='padding: 8px; background-color: #f7e8e8 ;text-align: left;'>").append(methodName).append("</td>");
                    failedTestTable.append("<td style='padding: 8px; background-color: #f7e8e8 ;text-align: left;'>").append(screenshotLink).append("</td>");
                    failedTestTable.append("</tr>");
                } else {
                    // Continue the row for the existing class
                    failedTestTable.append("<tr>");
                    failedTestTable.append("<td style='padding: 8px; background-color: #f7e8e8 ;text-align: left;'>").append(methodName).append("</td>");
                    failedTestTable.append("<td style='padding: 8px; background-color: #f7e8e8 ;text-align: left;'>").append(screenshotLink).append("</td>");
                    failedTestTable.append("</tr>");
                }
                previousClassName = className;
            }
            failedTestTable.append("</table>");

            summaryTest.getModel().setDescription(failedTestTable.toString());
            extentReports.setAnalysisStrategy(AnalysisStrategy.TEST);
        }
    	
        //-------------------------------------
        // 
      
    	
    	

    	 StringBuilder serviceWiseTable= new StringBuilder("<table border='1'><tr>");
      	  serviceWiseTable.append("<th style='padding: 8px; background-color: #f6746a;'>Department Name</th>");
    	  serviceWiseTable.append("<th style='padding: 8px; background-color: #f6746a;'>Service Name</th>");
    	  serviceWiseTable.append("<th style='padding: 8px; background-color: #f6746a;'>Pass Cases</th>");
    	  serviceWiseTable.append("<th style='padding: 8px; background-color: #f6746a;'>Fail Cases</th></tr>");
    	  
    	  Set<String> allClasses = new HashSet<>(classPassCount.keySet());
      	allClasses.addAll(classFailCount.keySet());
      	
    	for (String className : allClasses) {
    	    int passCount = classPassCount.getOrDefault(className, 0);
    	    int failCount = classFailCount.getOrDefault(className, 0);
       
    	    
    	    int lastIndex = className.lastIndexOf('.');
    	    String packageName = className.substring(0, lastIndex); // Substring before the last dot
    	    String servcieName = className.substring(lastIndex + 1);
    	    // Add rows to the table
    	    serviceWiseTable.append("<tr>");
    	    serviceWiseTable.append("<td style='padding: 8px; background-color: #f7e8e8 ; text-align: left;'>").append(packageName).append("</td>");
    	    serviceWiseTable.append("<td style='padding: 8px; background-color: #f7e8e8 ; text-align: left;'>").append(servcieName).append("</td>");
    	    serviceWiseTable.append("<td style='padding: 8px; background-color: #f7e8e8 ;text-align: left;'>").append(passCount).append("</td>");
    	    serviceWiseTable.append("<td style='padding: 8px; background-color: #f7e8e8 ;text-align: left;'>").append(failCount).append("</td>");
    	    serviceWiseTable.append("</tr>");
    	}

    	serviceWiseTable.append("</table>");
    	Servicewisecount.getModel().setDescription(serviceWiseTable.toString());

    	extentReports.flush();
    	
  
    }
    	
   

    
    private void incrementPassCount(String className)
    {
        classPassCount.put(className, classPassCount.getOrDefault(className, 0) + 1);
    }

    private void incrementFailCount(String className)
    {
        classFailCount.put(className, classFailCount.getOrDefault(className, 0) + 1);
    }

    private static void deleteOldReport() {
        String fileSeparator = File.separator;
        String reportDirectoryPath = System.getProperty("user.dir") + fileSeparator + "reports";

        File reportDirectory = new File(reportDirectoryPath);
        if (reportDirectory.exists()) {
            deleteDirectory(reportDirectory);
        }

        reportDirectory.mkdir();
    }

    private static void deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        directory.delete();
    }

    }