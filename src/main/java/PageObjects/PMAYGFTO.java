package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PMAYGFTO 

{

	WebDriver Driver;
	
	By ftonumber=By.xpath("//input[@formcontrolname='ftoNumber']");
	
	By ftonumberresult=By.xpath("//label[normalize-space()='FTO Number']");
	
	By searchbutton=By.xpath("//button[normalize-space()='Search']");
	
	By FTOtopfms=By.xpath("//button[normalize-space()='Click to check your PFMS Payment']");
	
	By PFMSnavigation=By.xpath("//h5[normalize-space()='Public Financial Management System']");
	
	public PMAYGFTO(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	
	
	public WebElement ftonumber()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(ftonumber));
		return Driver.findElement(ftonumber);
	}
	
	public WebElement ftonumberresult()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(ftonumberresult));
		return Driver.findElement(ftonumberresult);
	}
	
  public WebElement searchbutton()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(searchbutton));
		return Driver.findElement(searchbutton);
	}
	  
	public WebElement FTOtppfms()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(FTOtopfms));
		return Driver.findElement(FTOtopfms);
	}

	
	public WebElement PFMSnavigation()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(PFMSnavigation));
	return Driver.findElement(PFMSnavigation);
	}
}
