package PageObjects;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PMAYGInstallmentdetails 
{
	WebDriver Driver;
	By regno=By.xpath("//input[@formcontrolname='regNumber']");
	By submitbtn=By.xpath("//button[normalize-space()='Submit']");
	By search=By.xpath("//button[normalize-space()='Search']");
	By installemntdetails=By.xpath("//h4[normalize-space()='Installment Details']");
	By financialyeralabel=By.xpath("//label[normalize-space()='Financial Year']");
	By FTOtrackingdetails=By.xpath("//span[normalize-space()='FTO Tracking Details']");
	By convergenceMnrega=By.xpath("//h4[normalize-space()='MGNREGA Details']");
	By filter=By.xpath("//span[normalize-space()='Filter by']");
	By fil_installment=By.xpath("//p[normalize-space()='Installment Number']");
	By fil_FTOnumber=By.xpath("//p[normalize-space()='FTO Number']");
	By filtersearch=By.xpath("//input[@formcontrolname='search']");

	public PMAYGInstallmentdetails (WebDriver Driver)
	{
		this.Driver=Driver;
	}
	
	public WebElement regno()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(regno));
		return Driver.findElement(regno);
	}
	
	public WebElement submitbtn()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(submitbtn));
		return Driver.findElement(submitbtn);
	}
	
	public WebElement search()
	{

		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(search));
	 return Driver.findElement(search);	
	}
	
	public WebElement installemntdetails()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(installemntdetails));
	 return Driver.findElement(installemntdetails);	
	}
	
	public WebElement financialyeralabel()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(financialyeralabel));
	 return Driver.findElement(financialyeralabel);	
	}
	
	
	public WebElement FTOtrackingdetails()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(FTOtrackingdetails));
	 return Driver.findElement(FTOtrackingdetails);	
	}
	
	
	public WebElement convergenceMnrega()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(convergenceMnrega));
		return Driver.findElement(convergenceMnrega);	
		
	}
	
	public WebElement filter()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(filter));
		return Driver.findElement(filter);	
		
	}
	
	public WebElement fil_installment()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(fil_installment));
		return Driver.findElement(fil_installment);	
		
	}
	
	public WebElement fil_FTOnumber()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(fil_FTOnumber));
		return Driver.findElement(fil_FTOnumber);	
		
	}
	
	public WebElement filtersearch()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(filtersearch));
		return Driver.findElement(filtersearch);	
		
	}
	
}