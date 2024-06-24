package PageObjects;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import Utilis.departmenttestdata;

public class commonlocators {
	WebDriver Driver;
	WebDriverWait wait;
	
	public commonlocators(WebDriver Driver)
	{
		wait=new WebDriverWait(Driver, Duration.ofSeconds(30));
		this.Driver=Driver;
	}
	
	By close=By.xpath("//button[normalize-space()='Close']");
	By next=By.xpath("//button[normalize-space()='Next']");
	By Submit=By.xpath("//button[normalize-space()='Submit']");
	By list=By.xpath("(//span[@class='ng-option-label ng-star-inserted'])");
	By login=By.xpath("//button[normalize-space()='Login']");
	By register=By.xpath("//button[normalize-space()='Register']");
	By home=By.xpath("//button[normalize-space()='Home']");
	By forgetpwd=By.xpath("//span[normalize-space()='Forget Password ?']");
	By logout=By.xpath("//button[normalize-space()='Logout']");
	By confirm=By.xpath("//button[normalize-space()='Confirm']");
	By preview=By.xpath("//button[normalize-space()='Preview']");
	By cancel=By.xpath("//button[normalize-space()='Cancel']");
	By download=By.xpath("//button[normalize-space()='Download']");
	By Serviceheading=By.xpath("//div[@class='col-xs-12 text-center']");
	By serviceCount =By.xpath("//div[@class='tile-heading']");
	By Tagline =By.xpath("");
	
	By dots=By.xpath("//img[@alt='more-vert']");
	By info=By.xpath("//button[@role='menuitem']");
	By contact=By.xpath("//div[@class='directory-detail-body']//li[1]/a/span");
	By website=By.xpath("//img[@src='assets/img/website.svg']");
	By description=By.xpath("//div[@class='directory-discription']");
	// Service Plus tagline 
	 By search=By.xpath("//button[normalize-space()='Search']");	
	    By loader1=By.xpath("//div[@class='loader-div-wrapper']");
	    By add=By.xpath("//button[normalize-space()='Add']");
	    By checkbox=By.xpath("//div[@class='mat-checkbox-inner-container']");
	    By apply=By.xpath("//button[normalize-space()='Apply']");
	    By option=By.xpath("//div[@role='option']");
		
		By arrow=By.xpath("(//div[@class='mat-select-arrow-wrapper'])");
		By circleloader=By.xpath("//img[@src='./assets/images/loader.gif']");
		By arrowng=By.xpath("(//span[@class='ng-arrow-wrapper'])[1]");
		By servicecount=By.xpath("(//div[contains(@class,'service-tile')])//following::h4");

		public List<WebElement> servicecount()
		{
			wait.until(ExpectedConditions.elementToBeClickable(servicecount));
			  return Driver.findElements(servicecount);
		}
		
		
		//function to check service name miss/add
		public void servicecountfunction(List<WebElement> countofservice,String x) throws IOException
		{
			////////get UI name of services
			List<WebElement> op=countofservice;
			
			//now add that count in list by first creating list
			List<String> list1 = new ArrayList<>();

		    // Loop through the list items and add them to the array
		    for (WebElement item : op) 
		    {
		        list1.add(item.getText());
		    }
			System.out.println("UI List is " + list1);
			
			
			///////now get data from excel where we have kept all services name

		  //to add all data from excel
			departmenttestdata td=new departmenttestdata();
			
		//pass name of row where name of services is written
			 ArrayList<String> data=td.getData(x);
			//function to check count
				//remove 1st name from excel
			// List<String> list2 = new ArrayList<>(data.subList(1, data.size()));
			 List<String> list2;
			 System.out.println(data.size());
			 if (data.size() > 1) {
				 System.out.println("hi");
				 
			     list2 = new ArrayList<>(data.subList(1, data.size()));
			 } else {
				 System.out.println("hiii");
			     list2 = new ArrayList<>(); // Create an empty list if data has only one element or is empty
			 }
			
				System.out.println("Excel list data " + list2);
				int i=list2.size();
				System.out.println("Excel sheet element number " +i);
			

				
		//////// Step 3: Compare the lists excel and UI names
				

				 // Step 1: Compare the lists
		        List<String> extrapresentinUI = new ArrayList<>(list1);
		        extrapresentinUI.removeAll(list2); // Names in UI but not in excel

		        List<String> absentInUI = new ArrayList<>(list2);
		        absentInUI.removeAll(list1); // Names in excel but not in UI
		        SoftAssert softAssert = new SoftAssert();
		     
		     
		        // Step 2: Report the names
		        if (extrapresentinUI.isEmpty() && absentInUI.isEmpty())
		        {
		            System.out.println("All names match in UI and excel.");
		   
		           
		            softAssert.assertTrue(true);
		        } 
		       
		        else
		        {
		        
		        	
		        	if (!extrapresentinUI.isEmpty()) {
		        	    System.out.println("Found extra service name in UI: " + extrapresentinUI);

		        	    StringBuilder table = new StringBuilder("<table border='1' style='width: 100%;'><tr>");
		        	    table.append("<th style='padding: 0; background-color: #48C9B0; border: 1px solid black;'>Found extra service name in UI but absent in excel:</th>");
		        	    table.append("</tr><tr><td style='padding: 0; background-color: #E8F8F5 ;text-align: left; border: 1px solid black;'>");

		        	    // Start of unordered list
		        	    table.append("<ul style='list-style-type: none; padding: 0; margin: 0;'>");
		        	    for (String serviceName : extrapresentinUI) {
		        	        // List item with border-bottom style
		        	        table.append("<li style='padding: 5px; margin: 0; border-bottom: 1px solid black;'>").append(serviceName).append("</li>");
		        	    }
		        	    // End of unordered list
		        	    table.append("</ul>");

		        	    table.append("</td></tr></table>");
		        	     table.append("</table>");
		        	     
		    
		        	    softAssert.assertTrue(false, table.toString());
		        	    
		        	}

		        	// If Service missing from UI 
		        	if (!absentInUI.isEmpty()) {
		        	    System.out.println("Service missing from UI: " + absentInUI);

		        	    StringBuilder table = new StringBuilder("<table border='1' style='width: 100%;'><tr>");
		        	    table.append("<th style='padding: 0; background-color: #48C9B0; border: 1px solid black;'>Service missing from UI but present in excel:</th>");
		        	    table.append("</tr><tr><td style='padding: 0; background-color: #E8F8F5 ;text-align: left; border: 1px solid black;'>");

		        	    // Start of unordered list
		        	    table.append("<ul style='list-style-type: none; padding: 0; margin: 0;'>");
		        	    for (String serviceName : absentInUI) {
		        	        // List item with border-bottom style
		        	        table.append("<li style='padding: 5px; margin: 0; border-bottom: 1px solid black;'>").append(serviceName).append("</li>");
		        	    }
		        	    // End of unordered list
		        	    table.append("</ul>");

		        	    table.append("</td></tr></table>");
		        	    softAssert.assertTrue(false, table.toString());
		        	}

		        	softAssert.assertAll();
		        }
		        	
		    }
		
		
		/*//function to check service name miss/add
		public void servicecountfunction(List<WebElement> countofservice,String x) throws IOException
		{
			////////get UI name of services
			List<WebElement> op=countofservice;
			
			//now add that count in list by first creating list
			List<String> list1 = new ArrayList<>();

		    // Loop through the list items and add them to the array
		    for (WebElement item : op) 
		    {
		        list1.add(item.getText());
		    }
			System.out.println("UI List is " + list1);
			
			
			///////now get data from excel where we have kept all services name

		  //to add all data from excel
			departmenttestdata td=new departmenttestdata();
			//System.out.println("x = " + x);
		//pass name of row where name of services is written
			 ArrayList<String> data=td.getData(x);
			//function to check count
				//remove 1st name from excel
			 List<String> list2 = new ArrayList<>(data.subList(1, data.size()));
				System.out.println("Excel list data " + list2);
				int i=list2.size();
				System.out.println("Excel sheet element number " +i);
			

				
		//////// Step 3: Compare the lists excel and UI names
				

				 // Step 1: Compare the lists
		        List<String> extrapresentinUI = new ArrayList<>(list1);
		        extrapresentinUI.removeAll(list2); // Names in UI but not in excel

		        List<String> absentInUI = new ArrayList<>(list2);
		        absentInUI.removeAll(list1); // Names in excel but not in UI
		        SoftAssert softAssert = new SoftAssert();
		     
		     
		        // Step 2: Report the names
		        if (extrapresentinUI.isEmpty() && absentInUI.isEmpty())
		        {
		            System.out.println("All names match in UI and excel.");
		   
		           
		            softAssert.assertTrue(true);
		        } 
		       
		        else
		        {
		        
		        	
		        	if (!extrapresentinUI.isEmpty()) {
		        	    System.out.println("Found extra service name in UI: " + extrapresentinUI);

		        	    StringBuilder table = new StringBuilder("<table border='1' style='width: 100%;'><tr>");
		        	    table.append("<th style='padding: 0; background-color: #48C9B0; border: 1px solid black;'>Found extra service name in UI but absent in excel:</th>");
		        	    table.append("</tr><tr><td style='padding: 0; background-color: #E8F8F5 ;text-align: left; border: 1px solid black;'>");

		        	    // Start of unordered list
		        	    table.append("<ul style='list-style-type: none; padding: 0; margin: 0;'>");
		        	    for (String serviceName : extrapresentinUI) {
		        	        // List item with border-bottom style
		        	        table.append("<li style='padding: 5px; margin: 0; border-bottom: 1px solid black;'>").append(serviceName).append("</li>");
		        	    }
		        	    // End of unordered list
		        	    table.append("</ul>");

		        	    table.append("</td></tr></table>");
		        	     table.append("</table>");
		        	     
		    
		        	    softAssert.assertTrue(false, table.toString());
		        	    
		        	}

		        	// If Service missing from UI 
		        	if (!absentInUI.isEmpty()) {
		        	    System.out.println("Service missing from UI: " + absentInUI);

		        	    StringBuilder table = new StringBuilder("<table border='1' style='width: 100%;'><tr>");
		        	    table.append("<th style='padding: 0; background-color: #48C9B0; border: 1px solid black;'>Service missing from UI but present in excel:</th>");
		        	    table.append("</tr><tr><td style='padding: 0; background-color: #E8F8F5 ;text-align: left; border: 1px solid black;'>");

		        	    // Start of unordered list
		        	    table.append("<ul style='list-style-type: none; padding: 0; margin: 0;'>");
		        	    for (String serviceName : absentInUI) {
		        	        // List item with border-bottom style
		        	        table.append("<li style='padding: 5px; margin: 0; border-bottom: 1px solid black;'>").append(serviceName).append("</li>");
		        	    }
		        	    // End of unordered list
		        	    table.append("</ul>");

		        	    table.append("</td></tr></table>");
		        	    softAssert.assertTrue(false, table.toString());
		        	}

		        	softAssert.assertAll();
		    }
				
		
			
		
		        }*/
		
		// service plus service Heading 
		public WebElement arrowng()
		{
			wait.until(ExpectedConditions.elementToBeClickable(arrowng));
			  return Driver.findElement(arrowng);
		}
		public WebElement arrow()
		{
			wait.until(ExpectedConditions.elementToBeClickable(arrow));
			  return Driver.findElement(arrow);
		}

	By errorcontent=By.xpath("//div[contains(@class,'error-content')]");
	By textcontent=By.xpath("//p[contains(@class,'text-center')]");
	
	//service plus serices count 
	
	public int serviceCount()
	{

		  return Driver.findElements(serviceCount).size();
	}
	
	// service puls duplicate services 
	
	public Set<String> duplicateTestCases() throws IOException, InterruptedException 
	{

	    List<WebElement> nameElements = Driver.findElements(serviceCount);

	    List<String> names = new ArrayList<>();
	    for (WebElement nameElement : nameElements) {
	        String name = nameElement.getText().toLowerCase().replaceAll(" ", ""); // remove all spaces from the name
	        names.add(name);
	    }

	    Set<String> uniqueNames = new HashSet<>();
	    Set<String> duplicateNames = new HashSet<>();
	    for (String namee : names) {
	        if (!uniqueNames.add(namee)) {
	            duplicateNames.add(namee);
	        }
	    }
	    
	    return duplicateNames;
	}
	
	public String actualSrc() throws IOException, InterruptedException 
	{
        // Replace this XPath with the correct one for your <img> element
        //String imgXPath = "/html/body/app-root/app-app-home/app-app-header/div/div[2]/div[1]/img";
		String imgXPath = "//img[@class='w-100 h-100 m-0']";
        // Find the <img> element
        WebElement imgElement = Driver.findElement(By.xpath(imgXPath));

        // Get the actual value of the src attribute
        String actualSrc =  imgElement.getAttribute("src");
        
         return actualSrc ;
    }

		
	public String expectedSrc() throws IOException, InterruptedException 
	{
		String expectedSrc = "https://media.umangapp.in/app/ico/service/NationalEmblem23.png";
		
        return expectedSrc ;
	}

	// service plus service Heading 
	public WebElement Serviceheading()
	{
		wait.until(ExpectedConditions.elementToBeClickable(Serviceheading));
		
		  return Driver.findElement(Serviceheading);
	}
	//closing new tab in browser
	public void closebrowserback() throws InterruptedException
	{
		List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	Driver.close();
    //Driver.switchTo().window(browserTabs.get(0));
			// switch to frame
	//ServiceNavigation dp=new ServiceNavigation(Driver);
	//Driver.switchTo().frame(dp.switchframe());
	//Thread.sleep(1000);
   }
	
	// read pdf content in browser
	public String  pdfcontent(String getURL) throws IOException
	{
		URL pdfUrl = new URL(getURL);
		InputStream in = pdfUrl.openStream();
		BufferedInputStream bf = new BufferedInputStream(in);
		PDDocument doc = Loader.loadPDF(bf);
		String content = new PDFTextStripper().getText(doc);
		return content;
		
		//write in case pdf is readable>>   Assert.assertTrue(content.contains("word")); in test case
		
	}
	//read pdf length in browser
	public int getPageCount(String getURL) throws IOException {
		//get the total number of pages in the pdf document
		URL pdfUrl = new URL(getURL);
		InputStream in = pdfUrl.openStream();
		BufferedInputStream bf = new BufferedInputStream(in);
		PDDocument doc = Loader.loadPDF(bf);
		int pageCount = doc.getNumberOfPages();
		return pageCount;
	}
	
	public WebElement download()
	{

		 wait.until(ExpectedConditions.elementToBeClickable(download));
		  return Driver.findElement(download);
	}
	

	
	
	public List<WebElement> list()
	{

		 wait.until(ExpectedConditions.elementToBeClickable(list));
		  return Driver.findElements(list);
	}
	
	public WebElement logout()
	{

		 wait.until(ExpectedConditions.elementToBeClickable(logout));
		  return Driver.findElement(logout);
	}
	public WebElement login()
	{

		 wait.until(ExpectedConditions.elementToBeClickable(login));
		  return Driver.findElement(login);
	}
	public WebElement fp()
	{

		 wait.until(ExpectedConditions.elementToBeClickable(forgetpwd));
		  return Driver.findElement(forgetpwd);
	}
	
	public WebElement home()
	{

		 wait.until(ExpectedConditions.elementToBeClickable(home));
		  return Driver.findElement(home);
	}
	public WebElement register()
	{

		 wait.until(ExpectedConditions.elementToBeClickable(register));
		  return Driver.findElement(register);
	}

	
	public WebElement close()
	{

		 wait.until(ExpectedConditions.elementToBeClickable(close));
		  return Driver.findElement(close);
	}

	public WebElement next()
	{

		 wait.until(ExpectedConditions.elementToBeClickable(next));
		  return Driver.findElement(next);
	}
	
	public WebElement preview()
	{

		 wait.until(ExpectedConditions.elementToBeClickable(preview));
		  return Driver.findElement(preview);
	}
	

	public WebElement submit()
	{
	
		 wait.until(ExpectedConditions.elementToBeClickable(Submit));
		  return Driver.findElement(Submit);
	}
	
	
	public WebElement confirm()
	{
	
		 wait.until(ExpectedConditions.elementToBeClickable(confirm));
		  return Driver.findElement(confirm);
	}
	
	
	public WebElement cancel()
	{
	
		 wait.until(ExpectedConditions.elementToBeClickable(cancel));
		  return Driver.findElement(cancel);
	}

//for dropdowns
	public void loopdropdown(List<WebElement> list, String data)
	{
	  List<WebElement> options=list;

	    for(WebElement element : options)
      {
         if(element.getText().equalsIgnoreCase(data))
          {   
  	     element.click();
  	      break;
            }
      }
	
	
	}
	

	//closing new tab in browser
	public void closebrowserback1() throws InterruptedException
	{
		List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
		Driver.switchTo().window(browserTabs.get(1));
	Driver.close();
    Driver.switchTo().window(browserTabs.get(0));
			// switch to frame
	ServiceNavigation dp=new ServiceNavigation(Driver);
	Driver.switchTo().frame(dp.switchframe());
	Thread.sleep(1000);
   }
	
	
	public WebElement dots()
	{
		 wait.until(ExpectedConditions.elementToBeClickable(dots));
		return Driver.findElement(dots);

	}

	public WebElement info()
	{
		 wait.until(ExpectedConditions.elementToBeClickable(info));
		return Driver.findElement(info);

	}
	
	public WebElement description()
	{
		 wait.until(ExpectedConditions.elementToBeClickable(description));
		return Driver.findElement(description);

	}
	
	
	public void threedots()
	{
		Driver.switchTo().defaultContent();
		dots().click();
		info().click();
	}

	public void Infodiscription() throws InterruptedException
	{
		
		Thread.sleep(2500);
		 String x=description().getText();
		   System.out.println(x);
		   System.out.println(x.length());
		
	   if(x!=null && x.length()>10)
	    {
	        Assert.assertTrue(true);
	    }	

	   else
	     {
	       Assert.assertTrue(false);   

	     }
	}
	
}

	
	
	
