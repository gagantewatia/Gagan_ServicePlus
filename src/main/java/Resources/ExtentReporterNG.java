package Resources;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import tech.grasshopper.reporter.ExtentPDFReporter;

import java.io.File;


public class ExtentReporterNG extends Base2{



	public static String systemOsName = System.getProperty("os.name");
	
		public static ExtentReports getReportObject()
		{
			   if (extent == null) {
				   
				   deleteOldReport();
			//String path =System.getProperty("user.dir")+"\\reports\\index.html";
			 String fileSeparator = File.separator;
		        String path = System.getProperty("user.dir") + fileSeparator + "reports" + fileSeparator + "index.html";
	
			
		ExtentSparkReporter reporter = new ExtentSparkReporter(path).viewConfigurer().viewOrder()
							.as(new ViewName[] { ViewName.CATEGORY, ViewName.DASHBOARD, ViewName.TEST, ViewName.EXCEPTION,
									ViewName.AUTHOR, ViewName.DEVICE, ViewName.LOG})
							.apply();
		 
			
			reporter.config().setReportName("Web Automation Results");
			reporter.config().setDocumentTitle("Test Results");
		
			 extent =new ExtentReports();
			
			 String pathPdf =System.getProperty("user.dir") + fileSeparator + "reports" + fileSeparator +"index.pdf";
			ExtentPDFReporter pdfReport = new ExtentPDFReporter(pathPdf);
			extent.attachReporter(pdfReport);
				
			 
			extent.attachReporter(reporter);
			extent.setSystemInfo("OS", systemOsName);
			extent.setSystemInfo("Environment", "Production");
			extent.setSystemInfo("Url", "web.umang.gov.in");
			extent.setSystemInfo("Tester", "UMANG Testing TEAM");
			
			  // Add a shutdown hook to ensure the ExtentReports object is flushed and closed
            Runtime.getRuntime().addShutdownHook(new Thread(){
            	public void run() 
            	{
                if (extent != null) {
                    extent.flush();
                    
                }
            	}
            	});
		}
			return extent;
			
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