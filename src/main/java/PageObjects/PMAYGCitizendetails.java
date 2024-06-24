package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PMAYGCitizendetails {

	WebDriver Driver;
	
	By registrationlabel=By.xpath("//label[normalize-space()='Registration Number']");
	By convergencetab=By.xpath("//div[contains(text(),'Convergence Details')]");
	By convergencedetailsassert=By.xpath("//label[normalize-space()='Ujjwala Connection']");
	By sanctioncompalindetails=By.xpath("//div[contains(text(),'Sanction and Completion Details')]");
	
	By ordersheetdetails=By.xpath("//div[contains(text(),'Order Sheet Details')]");
	By financialyear=By.xpath("//label[normalize-space()='Financial Year']");
	By physicalprocess=By.xpath("//div[contains(text(),'Physical Progress')]");
	By phyicalprocessgettext=By.xpath("//button[contains(text(),'Get Direction')]");
	By map=By.xpath("//span[normalize-space()='Add destination']");
	By mapclick=By.xpath("//img[@src='assets/images/direction.svg']");
	
	public PMAYGCitizendetails(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	
	
	public WebElement registerlabel()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(registrationlabel));
		return Driver.findElement(registrationlabel);
			
	}
	
	public WebElement convergencetab()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(convergencetab));
		return Driver.findElement(convergencetab);
			
	}
	
	public WebElement convergencedetailsassert()
	{
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(convergencedetailsassert));
		return Driver.findElement(convergencedetailsassert);
			
	}
	
	public WebElement sanctioncompalindetails()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(sanctioncompalindetails));
		return Driver.findElement(sanctioncompalindetails);
			
	}
	
	public WebElement ordersheetdetails()
	{
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(ordersheetdetails));
		return Driver.findElement(ordersheetdetails);
			
	}
	
	public WebElement financialyear()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(financialyear));
		return Driver.findElement(financialyear);
			
	}
	
	
	public WebElement physicalprocess()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(physicalprocess));
		return Driver.findElement(physicalprocess);
			
	}
	
	public WebElement physicalprocesstext()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(phyicalprocessgettext));
		return Driver.findElement(phyicalprocessgettext);
			
	}
	public WebElement map()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(map));
		return Driver.findElement(map);
			
	}
	public WebElement mapclick()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(mapclick));
		return Driver.findElement(mapclick);
			
	}
	
}
