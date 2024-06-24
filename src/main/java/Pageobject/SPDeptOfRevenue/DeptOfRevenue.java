package Pageobject.SPDeptOfRevenue;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeptOfRevenue{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DeptOfRevenue(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Issue of Income Certificate
By IncomeCertificate =By.xpath("//h4[normalize-space()='Issue of Income Certificate']");

//Issue of Local Resident Certificate
By LocalResident = By.xpath("//h4[normalize-space()='Issue of Local Resident Certificate']");

//Marriage Registration Certificate
By  MarrigeCertificate=By.xpath("//h4[normalize-space()='Marriage Registration Certificate']");


//Issue of Income Certificate
By infoIncomeCertificate =By.xpath("//h4[normalize-space()='Issue of Income Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Issue of Local Resident Certificate
By infoLocalResident = By.xpath("//h4[normalize-space()='Issue of Local Resident Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Marriage Registration Certificate
By  infoMarrigeCertificate=By.xpath("//h4[normalize-space()='Marriage Registration Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoIncomeCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoIncomeCertificate));
	  return Driver.findElement(infoIncomeCertificate);
}
public WebElement infoLocalResident()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoLocalResident));
	  return Driver.findElement(infoLocalResident);
}
public WebElement infoMarrigeCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMarrigeCertificate));
	  return Driver.findElement(infoMarrigeCertificate);
}

public WebElement IncomeCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(IncomeCertificate));
	  return Driver.findElement(IncomeCertificate);
}
public WebElement LocalResident()
{
	wait.until(ExpectedConditions.elementToBeClickable(LocalResident));
	  return Driver.findElement(LocalResident);
}
public WebElement MarrigeCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(MarrigeCertificate));
	  return Driver.findElement(MarrigeCertificate);
}
}
