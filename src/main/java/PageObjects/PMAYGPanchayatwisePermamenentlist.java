package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PMAYGPanchayatwisePermamenentlist
{

	public WebDriver Driver;
	
	By state=By.xpath("(//input[@role='combobox'])[1]");
	
	By district=By.xpath("(//input[@role='combobox'])[2]");
	
	By blockname=By.xpath("(//input[@role='combobox'])[3]");
	
	By panchayat=By.xpath("(//input[@role='combobox'])[4]");
	
	By searchbutton=By.xpath("//button[normalize-space()='Search']");
	By panchayatname=By.xpath("//label[normalize-space()='Panchayat Name']");
	By norecordfound=By.xpath("//p[normalize-space()='No record found!']");
	By search=By.xpath("//input[@formcontrolname='search']");
	
	By filter=By.cssSelector(".input-group-text.rounded.dropdown-toggle");
	By fil_reg=By.xpath("//p[normalize-space()='Registration Number']");
	By fil_ben=By.xpath("//p[normalize-space()='Beneficiary Name']");
	By fil_category=By.xpath("//p[normalize-space()='Category']");
	By fil_fathername=By.xpath("//p[normalize-space()='Father Name']");
	By fil_mothername=By.xpath("//p[normalize-space()='Mother Name']");
	By fil_priority=By.xpath("//p[normalize-space()='Priority']");

	
	public PMAYGPanchayatwisePermamenentlist(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	
	public WebElement state()
	{ WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.elementToBeClickable(state));
		return Driver.findElement(state); 
	}
	
	
	public WebElement district()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(district));
		return Driver.findElement(district); 
	}
	
	public WebElement blockname()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(blockname));
		return Driver.findElement(blockname); 
	}
	
	public WebElement panchayat()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(panchayat));
		return Driver.findElement(panchayat); 
	}
	
	  public WebElement searchbutton()
		{
			 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.elementToBeClickable(searchbutton));
			return Driver.findElement(searchbutton);
		}
	
	
	  public WebElement panchayatname()
			{
			
		  WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.elementToBeClickable(panchayatname));
			 return Driver.findElement(panchayatname);
			}
	  
	  public int norecord()
			{
				 
				return Driver.findElements(norecordfound).size();
			}
		
	  
		
	  public WebElement search()
		{
			 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.elementToBeClickable(search));
			return Driver.findElement(search);
		}
	
	
	  

		public WebElement filter()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.elementToBeClickable(filter));
			return Driver.findElement(filter);	
			
		}
		
		
		public WebElement fil_reg()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.elementToBeClickable(fil_reg));
			return Driver.findElement(fil_reg);	
			
		}
		
		public WebElement fil_ben()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.elementToBeClickable(fil_ben));
			return Driver.findElement(fil_ben);	
			
		}
		
		public WebElement fil_category()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.elementToBeClickable(fil_category));
			return Driver.findElement(fil_category);	
			
		}
		
		public WebElement fil_fathername()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.elementToBeClickable(fil_fathername));
			return Driver.findElement(fil_fathername);	
			
		}
		public WebElement fil_mothername()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.elementToBeClickable(fil_mothername));
			return Driver.findElement(fil_mothername);	
			
		}
		
		public WebElement fil_priority()
		{
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.elementToBeClickable(filter));
			return Driver.findElement(fil_priority);	
			
		}
	  
}
