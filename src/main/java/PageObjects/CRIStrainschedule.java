package PageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CRIStrainschedule {
	public WebDriver Driver;
	
	
	By traindropdown=By.xpath("//div[@class='ng-input']");
	By traindropdownlist=By.xpath("//span[@class='ng-option-label ng-star-inserted']");
	By trainvalidatecheck=By.xpath("//th[normalize-space()='Day']");
	By traininputdata=By.xpath("//input[@role='combobox']");
	By trainsubmit=By.xpath("//button[text()='Submit']");
	By search=By.xpath("//input[@id='mat-input-0']");
		
	public  CRIStrainschedule(WebDriver Driver) 
	{
		this.Driver=Driver;
	}
	
	 public WebElement traindropdown()
	    {
			WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(traindropdown));
	        return Driver.findElement(traindropdown);
	    			
	    }
	    
	public List<WebElement> traindropdwonlist()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(traindropdownlist));
		return Driver.findElements(traindropdownlist);
	
	}
	
	
	public WebElement trainvalidatecheck()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(trainvalidatecheck));
		return Driver.findElement(trainvalidatecheck);
	}
	
	public WebElement traininputdata()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(traininputdata));
		return Driver.findElement(traininputdata);
	}
	
	public WebElement trainsubmit()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(trainsubmit));
		return Driver.findElement(trainsubmit);
		
	}
	
	public WebElement serach()
	
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(search));
		return Driver.findElement(search);
	}
	}
	
	
	
	
	
