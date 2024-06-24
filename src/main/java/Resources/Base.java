package Resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Base {
	
public WebDriver Driver;
	 
	public  WebDriver initdriver() throws IOException
	{
		
		Properties prop=new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\dell\\Downloads\\Cowintest-20221212T060437Z-001\\Cowintest\\src\\main\\java\\Resources\\data.properties"); 
		prop.load(fs);
	    String Browsername=	prop.getProperty("Browser");
	   
	   
	// setting browser for properties files
	
		if (Browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			Driver=new ChromeDriver();
		}
		
		else if (Browsername.equals("FireFox"))
		{
			System.setProperty("WebDriver.gecko.driver","C:\\Users\\SD329EZ\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			Driver = new FirefoxDriver();
		}
		
		
		 Driver.manage().window().maximize();
		 
		//URL 
		String BrowserURL=prop.getProperty("URL");
		Driver.get(BrowserURL);
		
		//wait duration for all test cases
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return Driver;
		
		
		}
	
	public void getscreenshotpath(String testcaseName, WebDriver Driver) throws IOException
	{
	TakesScreenshot scrShot =(TakesScreenshot)Driver;
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	String destinationfile=System.getProperty("user.dir")+"\\reports\\" + testcaseName +".png";
	FileUtils.copyFile(SrcFile, new File(destinationfile));
	}

}