package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRISPNRStatus 
{
	WebDriver Driver;
	
	By inputpnr=By.xpath("//input[@id='mat-input-0']");
	By invalidpnrtext=By.xpath("//p[normalize-space()='Invalid PNR Number!']");
	By flushedpnr=By.xpath("//p[normalize-space()='FLUSHED PNR / PNR NOT YET GENERATED!']");
	By boarddetails=By.xpath("(//div[@class='card ng-star-inserted'])[1]");
	By submitbutton=By.xpath("//button[text()='Submit']");
	By close=By.xpath("//button[@class='btn'][normalize-space()='Close']");
	
	
	public  CRISPNRStatus(WebDriver Driver) 
	{
		this.Driver=Driver;
	}
	
	
	public WebElement inputpnr()
    {
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(inputpnr));
        return Driver.findElement(inputpnr);
    			
    }
	
	public WebElement submitbutton()
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(submitbutton));
        return Driver.findElement(submitbutton);
		
	}
	
	public WebElement invalidpnrtext()
	
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(invalidpnrtext));
        return Driver.findElement(invalidpnrtext);
		
	}
public WebElement flushedPNR()
	
	{
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(flushedpnr));
        return Driver.findElement(flushedpnr);
		
	}
public WebElement Close()

{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(close));
    return Driver.findElement(close);
	
}

public WebElement boarddetails()

{
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(boarddetails));
    return Driver.findElement(boarddetails);
	
}

}
