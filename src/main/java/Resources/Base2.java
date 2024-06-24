package Resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import Utilis.departmenttestdata;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Base2 {
	
protected static WebDriver Driver;
public static ExtentReports extent;
public static ExtentReports extentReports;
public static ExtentTest test;
public static String AICTE = "AICTE Department Test";
public static String Meraration = "Mera Ration Department Test";
public static String NTA = "NTA Department Test";
public static String GSTN = "GSTN Department Test";
public static String CRIS = "CRIS Department Test";
public static String JanAushaidhiSugam  = "Jan Aushaidhi Sugam Department Test";
public static String SkillIndia  = "Skill India Department Test";
public static String PMAYG  = "PMAYG Department Test";
public static String COWIN  = "COWIN Department Test";
public static String NSP = "NSP Department Test";
public static String Coffeeboard = "Coffeeboard Department Test";
public static String CISF = "CISF Department Test";
public static String CPGRAMS = "CPGRAMS Department Test";
public static String ArundatiGoldScheme = "Arundati Gold Scheme Department Test";
public static String SamagraShiksha = "Samagra Shiksha Department Test";
public static String ICCR= "Indian Council for Cultural Relations Department Test";
public static String MeeSeva= "TN Mee Seva Department Test";
public static String CarbonNeutral= "Carbon Neutral Department Test";
public static String MAUD= "MAUD Department Test";
public static String GA= "Gallantary Awards Department Test";
public static String TNMSME= "TN MSME Awards Department Test";
public static String RDD= "Rural Development Department Test";
public static String UKMinorityAffair= "UK Minority Affair Department Test";
public static String DelhiPolice= "Delhi Police Department Test";
public static String DHEAssam= "DHE Assam Department Test";
public static String ORS= "Online Regsiteration System Department Test";
public static String InspireManak= "Inspire Manak Department Test";
public static String eGopala= "eGopala Department Test";
public static String Elderline= "Elderline Department Test";

//Service plus department 
public static String DepOfFinance= "Department Of Finance Tripura";
public static String AgricultureDep= "Agriculture Department - Andaman and Nicobar";
public static String AgricultureDepartment= "Agriculture Department Meghalaya";
public static String AgricultureDepartmentHaryana= "Agriculture Department Haryana";
public static String CCET= "CCET Chandigarh";
public static String ChiefMinisterReliefFund= "Chief Minister Relief Fund Haryana";
public static String DepOfEmpowerment= "Department Of Empowerment Of Persons With Disabilities";
public static String DeptOfRevenue="DEPARTMENT OF REVENUE";
public static String DepOfAnimalHusbandry="Department of Animal Husbandry and Veterinary Services Andaman & Nicobar Island";
public static String DepOfScienceAndTechnology="Department of Science and Technology Haryana";
public static String DepOfScientificAndIndustrial="Department of Scientific and Industrial Research Delhi";
public static String DepOfSocialWelfare="Department of Social Welfare, Women and Child Development, Chandigarh Administration";
public static String DepOfUrbanAffairs ="Department of Urban Affairs Meghalaya";
public static String DepOfUrbanDevelopment ="Department Of Urban Development Tripura";
public static String DirectorateofEducation ="Directorate of Education Andaman & Nicobar Island";
public static String DirectorateofFisheries ="Directorate of Fisheries Andaman & Nicobar Island";
public static String DirectorateOfHealthServices ="Directorate of Health Services";
public static String DirectorateOfIndustries ="Directorate of Industries Andaman & Nicobar Island";
public static String DirectorateOfSchoolEducation ="Directorate of School Education Chandigarh";
public static String DirectorateOfTechnicalEducation ="Directorate of Technical Education Chandigarh";
public static String EducationDepartment ="Education Department (School) Tripura";
public static String ForestClimateChangeDepartment ="Forest & Climate Change Department";
public static String GeneralAdministrationDepartment ="General Administration Department";
public static String GuwahatiDevelopmentDepartment ="Guwahati Development Department";
public static String HealthDepartment ="Health Department (GMSH) Chandigarh";
public static String HomeDepartment ="Home Department (Fire Service)";
public static String DepartmenOfHome ="Department of Home";
public static String KarbiAnglong ="Karbi Anglong (AC) Assam";
public static String MinistryOfNewAndRenewableResources ="Ministry of New and Renewable Resources";
public static String PunjabEngineeringCollege ="Punjab Engineering College";
public static String RevenueAndDisasterManagementDep ="Revenue and Disaster Management Department";
public static String RubberBoard ="Rubber Board";
public static String SocialJusticeEmpowerment ="Social Justice & Empowerment";
public static String ZilaSainikBoard ="Zila Sainik Board Chandigarh";
public static String DepartmentOfLabour ="Department of Labour, Employment and Training";
public static String RevenueDep ="Revenue Department(Tripura)";
public static String DepartmentOfRevenue ="Department of Revenue";
public static String UrbanDevelopmentDepartment ="Urban Development Department";
public static String DepOfPersonnelAdministrativeReforms ="Department of Personnel, Administrative Reforms and Raj Bhasa";
public static String HousingBoardHaryana ="Housing Board Haryana Haryana";
public static String FisheriesDepartment ="Fisheries Department";
public static String HaryanaShahariVikasPradhikaran ="Haryana Shahari Vikas Pradhikaran";
public static String WelfareofSCsBCs ="Welfare of SCs & BCs";
public static String EmploymentDepartment ="Employment Department";
public static String PublicWorksDepartment ="Public Works Department (RandB)";
public static String DepartmentofPower ="Department of Power Haryana";
public static String DepartmentofCommerceandIndustriesMeghalaya ="Department of Commerce and Industries Meghalaya";
public static String DepartmentofForestTripura ="Department of Forest Tripura";
public static String DepartmentofHealthJammuKashmir ="Department of Health Jammu & Kashmir";
public static String DepartmentofHorticulture ="Department of Horticulture";
public static String DepartmentofMinesGeology ="Department of Mines & Geology";
public static String DepartmentofPanchayatiRajJammuKashmir ="Department of Panchayati Raj Jammu & Kashmir";
public static String FoodSuppliesDepartmentHaryana ="Food & Supplies Department Haryana";
public static String WomenandChildDevelopmentDepartment ="Women and Child Development Department";
public static String UrbanDevHousingDepartmentSikkim="Urban Dev. Housing Department Sikkim";
public static String LabourDepartmentMeghalaya="Labour Department Meghalaya";
public static String LabourDepartment ="Labour Department";
public static String TourismMeghalaya ="Tourism Meghalaya";
public static String SainikArdhSainikWelfareDepartment ="Sainik & Ardh Sainik Welfare Department";
public static String PublicHealthEngineeringDepartmentHaryana ="Public Health Engineering Department Haryana";
public static String PrintingandStationeryDepartmentHaryana ="Printing and Stationery Department Haryana";
public static String PoliticalDepartmentMeghalaya ="Political Department Meghalaya";
public static String PersonnelandARMeghalaya="Personnel and A.R. Meghalaya";
public static String DepartmentofUrbanLocalBodies="Department of Urban Local Bodies";
public static String FoodCivilSuppliesConsumerAffairsDepartmentSikkim="Food Civil Supplies Consumer Affairs Department Sikkim";   
public static String HaryanaVeterinaryCouncil="Haryana Veterinary Council"; 
public static String HealthandFamilyWelfare="Health and Family Welfare";   
public static String HomeDepartmentPoliceMeghalaya="Home Department Police Meghalaya";   


//base class to initialize driver
public  WebDriver initdriver() throws IOException, InterruptedException
{
	String appName = System.getProperty("app.name");
	System.out.println("Gagan :" +appName);
	Properties prop=new Properties();
	FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//Resources//data.properties"); 
	prop.load(fs);
    String Browsername=	prop.getProperty("Browser");
   
   
// setting browser for properties files

	if (Browsername.equals("Chrome"))
	{
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	      options.addArguments("--remote-allow-origins=*");
	      options.addArguments("--disable-gpu");
	      options.addArguments("enable-automation");
	    
      
     options.addArguments("--headless=new","--no-sandbox");

//Using the accept insecure cert method with true as parameter to accept the untrusted certificate

	      options.setAcceptInsecureCerts(true);

	      System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	  

	      System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
			
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\Unthinkable\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				  	  			 	      
		Driver=new ChromeDriver(options);
}
	
			  
		
		
		else if (Browsername.equals("FireFox"))
		{
			System.setProperty("WebDriver.gecko.driver","C:\\Users\\SD329EZ\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			Driver = new FirefoxDriver();
		}
		

	   
	
	Driver.manage().window().setSize(new Dimension(1920, 1080));
    Dimension windowSize = Driver.manage().window().getSize();

      // Print the window size
      System.out.println("Window size: width=" + windowSize.getWidth() + ", height=" + windowSize.getHeight());
		
	
		//URL 
		String BrowserURL=prop.getProperty("URL");
		Driver.get(BrowserURL);
		

    	PageObjects.Login lp=new PageObjects.Login(Driver);
    
	    String mobile=	prop.getProperty("mobile");
	    String pin=prop.getProperty("pin");
	    
	   
    	lp.getmobile().sendKeys(mobile);
    
    	lp.getmpin().sendKeys(pin);
        Thread.sleep(2000);
    	lp.getlogin().click();
		System.out.println("Login done");
		Thread.sleep(8000);

		if(lp.accountrecovery()>0)
		{
			
			lp.imagecross().click();
			
		}
		
		
  
		return Driver;
		
		}
	
	
	


	@BeforeSuite
	public void browserstart() throws IOException, InterruptedException
	{
		Driver=initdriver();
		
	}
	
	//screenshot
/*
	public String getscreenshotpath(String testcaseName, WebDriver Driver) throws IOException
	{
 	TakesScreenshot scrShot =(TakesScreenshot)Driver;
   File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	
  String destinationfile=System.getProperty("user.dir")+"\\reports\\img\\" + testcaseName +".png";
 FileUtils.copyFile(SrcFile, new File(destinationfile));


 return destinationfile;
 }
	*/
	//screenshot with images coming in html
	public String capture() throws IOException {    
	    String screenshotPath;

	        //take screenshot and save it in a file
	        File sourceFile = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
	        //copy the file to the required path
	        File destinationFile = new File(System.getProperty("user.dir")+"/reports/image_" + System.currentTimeMillis()+ ".png");
	        FileUtils.copyFile(sourceFile, destinationFile);  
	        String[] relatvePath = destinationFile.toString().split("reports");
	        screenshotPath = ".\\" + relatvePath[1];
	  
	    return screenshotPath;
	}

	
	

	
	 
	
	
	public boolean download(String expectedFileName) throws IOException, InterruptedException
	{
		
		Properties prop=new Properties();
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties"); 
		prop.load(fs);

		String tmpFolderPath = prop.getProperty("URLdownload");
	
		String finalpath=tmpFolderPath + expectedFileName;
		System.out.println(finalpath);
		 File file=new File(finalpath);
		test.log(Status.INFO, "File path is taken");

		Thread.sleep(3000);
		if(file.exists())
		{
			System.out.print("file exists");
			Assert.assertTrue(true);
			file.delete();
			test.log(Status.INFO, "File Deleted");
			//Thread.sleep(3000);
			return true;
		}
		else
		{
			System.out.print("file not exists");
			Assert.assertTrue(false, "file not exists, purposely done false in this case");
			return true;
		}
	}
	
	
		public boolean beforedownload(String expectedFileName) throws IOException, InterruptedException
		{
			
			Properties prop=new Properties();
			FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties"); 
			prop.load(fs);
			String tmpFolderPath = prop.getProperty("URLdownload");
			 File dir = new File(tmpFolderPath);
	
			File[] dirContents = dir.listFiles();

			  for (int i = 0; i < dirContents.length; i++) {
			      if (dirContents[i].getName().equals(expectedFileName)) {
			          // File has been found, it can now be deleted:
			          dirContents[i].delete();
			          return true;
			      }
			          }
			      return false;
		
	}
	
		
	public void seeinfo(String URL) throws IOException, InterruptedException
	{
	
		Properties prop=new Properties();
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties"); 
		prop.load(fs);	//URL 
		 String depturl=prop.getProperty(URL);
		 Driver.get(depturl);
		 Thread.sleep(3500);
		 ServiceNavigation dp=new ServiceNavigation(Driver);
		 Driver.switchTo().frame(dp.switchframe());
		 
		 Thread.sleep(3500);
	
	
		
	}
		
	@AfterMethod
	public void getResult(ITestResult result) {

/*
		if (result.getStatus() == ITestResult.FAILURE) {
	
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " :Test case FAILED due to below issues:",
					ExtentColor.RED));

			test.log(Status.FAIL, result.getThrowable());



		} else if (result.getStatus() == ITestResult.SUCCESS) {
		
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " :Test Case PASSED", ExtentColor.GREEN));
		

		} else if (result.getStatus() == ITestResult.SKIP) {

			test.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " :Test Case SKIPPED ", ExtentColor.YELLOW));


		}
		extent.flush();

		}*/

      
		extentReports.flush();

	}

//	@AfterSuite
//	public void quit() throws InterruptedException {
//		Thread.sleep(8000);
//		System.out.println("Browser Closed After Suite Run");
//		Driver.quit();
//	}

/*
	 @AfterSuite
	    public void sendEmail() {
	    //    String host = "smtp.office365.com";
		 String host = "smtp.gmail.com";
	        String port = "465";
	 //       final String userName = "babita18.nic@gmail.com";
	        	
	      //  final String password = "";
	        String[] to = {"babita.dadhwal@in.ey.com"};

	        Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.socketFactory.port", port);
	        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");

	        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication("babita18.nic@gmail.com", "");
	            }
	        });

	        try {
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress("babita18.nic@gmail.com"));
	            InternetAddress[] recipientAddress = new InternetAddress[to.length];
	            for (int i = 0; i < to.length; i++) {
	                recipientAddress[i] = new InternetAddress(to[i]);
	            }
	            message.setRecipients(Message.RecipientType.TO, recipientAddress);
	            message.setSubject("Test Results");
	            message.setText("Test Results for MyTest");
	            Transport.send(message);
	            System.out.println("Email sent successfully");
	        } catch (MessagingException ex) {
	            ex.printStackTrace();
	        }
	    }
	   */

	
	public void elementclick(WebElement kp)
	{

	    JavascriptExecutor js = (JavascriptExecutor) Driver;
	     js.executeScript("arguments[0].click();", kp);
		
	}
	
}


/*
@AfterSuite
public void quite() throws InterruptedException
{
	Thread.sleep(8000);
	Driver.quit();
	
}
*/
   
	
	
