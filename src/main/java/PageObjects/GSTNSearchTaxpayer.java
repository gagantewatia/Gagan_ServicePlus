package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GSTNSearchTaxpayer 
{
  
	public WebDriver Driver;
	By searchbox=By.xpath("//input[@id='gstin']");
	By submitnumber=By.xpath("//button[@id='submit']");
	By popupok=By.xpath("(//button[@type='button'])[5]");
	By blankdatacheck=By.xpath("//div[text()='Please enter valid GSTIN/UIN of the Taxpayer']");
	By norecorddatacheck=By.xpath("/html/body/div[8]/md-dialog/div/p");
	By validdatacheck=By.xpath("//label[text()='Legal Name of Business']");
	
	
	public GSTNSearchTaxpayer(WebDriver Driver) 
	{
		this.Driver=Driver;
	}
	
	public WebElement searchbox()
	{
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(searchbox));
	  return Driver.findElement(searchbox);
		
	}
	
	public WebElement submitnumber()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(submitnumber));
		return Driver.findElement(submitnumber);
		
	}
	
	public WebElement popupok()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(popupok));
		return Driver.findElement(popupok);
		
	}
	
	public WebElement blankdatacheck()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(blankdatacheck));
		return Driver.findElement(blankdatacheck);
		
	}

	public WebElement norecorddatacheck()
	
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(norecorddatacheck));
		return Driver.findElement(norecorddatacheck);
	}
	
	public WebElement validatacheck()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(validdatacheck));
		return Driver.findElement(validdatacheck);
	
	}

}