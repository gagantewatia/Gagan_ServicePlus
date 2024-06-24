package Pageobject.SPDepOfSocialWelfare;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepOfSocialWelfare{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepOfSocialWelfare(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Issue of Income Certificate
By UTChandigarh  =By.xpath("//h4[normalize-space()='UT Chandigarh ICDS State Enhancement']");

//Issue of Local Resident Certificate
By DaughtersofWidows = By.xpath("//h4[normalize-space()='Financial Assistance for the Marriage of Daughters of Widows and Destitute Women belonging to SC']");

//Issue of Local Resident Certificate
By ChildrenofWidows = By.xpath("//h4[normalize-space()='Financial Assistance to Dependent Children of Widows and Destitute Women']");

//Issue of Local Resident Certificate
By  physicallyhandicapped  = By.xpath("//h4[normalize-space()='Unemployment Allowance to physically handicapped persons']");

//Issue of Local Resident Certificate
By SCwomen = By.xpath("//h4[normalize-space()='Post Natal Financial assistance belonging to the SC women']");

//Issue of Local Resident Certificate
By Petrolsubsidy = By.xpath("//h4[normalize-space()='Petrol subsidy to physically handicapped person']");



//ifo services 

//Issue of Income Certificate
By infoUTChandigarh  =By.xpath("//h4[normalize-space()='UT Chandigarh ICDS State Enhancement']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Issue of Local Resident Certificate
By infoDaughtersofWidows = By.xpath("//h4[normalize-space()='Financial Assistance for the Marriage of Daughters of Widows and Destitute Women belonging to SC']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Issue of Local Resident Certificate
By infoChildrenofWidows = By.xpath("//h4[normalize-space()='Financial Assistance to Dependent Children of Widows and Destitute Women']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Issue of Local Resident Certificate
By  infophysicallyhandicapped  = By.xpath("//h4[normalize-space()='Unemployment Allowance to physically handicapped persons']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Issue of Local Resident Certificate
By infoSCwomen = By.xpath("//h4[normalize-space()='Post Natal Financial assistance belonging to the SC women']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Issue of Local Resident Certificate
By infoPetrolsubsidy = By.xpath("//h4[normalize-space()='Petrol subsidy to physically handicapped person']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoUTChandigarh()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoUTChandigarh));
	  return Driver.findElement(infoUTChandigarh);
}
public WebElement infoDaughtersofWidows()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDaughtersofWidows));
	  return Driver.findElement(infoDaughtersofWidows);
}
public WebElement infoChildrenofWidows()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoChildrenofWidows));
	  return Driver.findElement(infoChildrenofWidows);
}
public WebElement infophysicallyhandicapped()
{
	wait.until(ExpectedConditions.elementToBeClickable(infophysicallyhandicapped));
	  return Driver.findElement(infophysicallyhandicapped);
}
public WebElement infoSCwomen()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSCwomen));
	  return Driver.findElement(infoSCwomen);
}
public WebElement infoPetrolsubsidy()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPetrolsubsidy));
	  return Driver.findElement(infoPetrolsubsidy);
}
public WebElement UTChandigarh()
{
	wait.until(ExpectedConditions.elementToBeClickable(UTChandigarh));
	  return Driver.findElement(UTChandigarh);
}
public WebElement DaughtersofWidows()
{
	wait.until(ExpectedConditions.elementToBeClickable(DaughtersofWidows));
	  return Driver.findElement(DaughtersofWidows);
}
public WebElement ChildrenofWidows()
{
	wait.until(ExpectedConditions.elementToBeClickable(ChildrenofWidows));
	  return Driver.findElement(ChildrenofWidows);
}
public WebElement physicallyhandicapped()
{
	wait.until(ExpectedConditions.elementToBeClickable(physicallyhandicapped));
	  return Driver.findElement(physicallyhandicapped);
}
public WebElement SCwomen()
{
	wait.until(ExpectedConditions.elementToBeClickable(SCwomen));
	  return Driver.findElement(SCwomen);
}
public WebElement Petrolsubsidy()
{
	wait.until(ExpectedConditions.elementToBeClickable(Petrolsubsidy));
	  return Driver.findElement(Petrolsubsidy);
}

}