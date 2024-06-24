package Pageobject.SPHousingBoardHaryana;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HousingBoardHaryana {
public WebDriver Driver;
WebDriverWait wait;
	
	

public HousingBoardHaryana (WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//HBH-Issue of No Dues Certificate
By DuesCertificate =By.xpath("//h4[normalize-space()='HBH-Issue of No Dues Certificate']");
//HBH-Transfer of Property in Case of General Transfer before Conveyance Deed
By GeneralTransfer =By.xpath("//h4[normalize-space()='HBH-Transfer of Property in Case of General Transfer before Conveyance Deed']");
//HBH-Transfer of Property in case of Sale deed
By Saledeed =By.xpath("//h4[normalize-space()='HBH-Transfer of Property in case of Sale deed']");
//HBH-Issue of Change Ownership/Re-allotment Letter after execution of Sale deed
By ReallotmentLetter =By.xpath("//h4[normalize-space()='HBH-Issue of Change Ownership/Re-allotment Letter after execution of Sale deed']");
//HBH-Issue of Conveyance deed through GPA
By GPA =By.xpath("//h4[normalize-space()='HBH-Issue of Conveyance deed through GPA']");
//HBH-Issue of Conveyance deed
By Conveyancedeed =By.xpath("//h4[normalize-space()='HBH-Issue of Conveyance deed']");
//HBH-Issue of No-Objection Certificate/Duplicate Allotment Letter
By AllotmentLetter =By.xpath("//h4[normalize-space()='HBH-Issue of No-Objection Certificate/Duplicate Allotment Letter']");
//HBH-Transfer of Property in Case of Death (uncontested)
By CaseofDeath =By.xpath("//h4[normalize-space()='HBH-Transfer of Property in Case of Death (uncontested)']");
//HBH-Issue of Permission for Mortgage
By Mortgage =By.xpath("//h4[normalize-space()='HBH-Issue of Permission for Mortgage']");


//HBH-Issue of No Dues Certificate
By infoDuesCertificate =By.xpath("//h4[normalize-space()='HBH-Issue of No Dues Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");
//HBH-Transfer of Property in Case of General Transfer before Conveyance Deed
By infoGeneralTransfer =By.xpath("//h4[normalize-space()='HBH-Transfer of Property in Case of General Transfer before Conveyance Deed']//following::img[@src='./assets/images/infoIcon.png'][1]");
//HBH-Transfer of Property in case of Sale deed
By infoSaledeed =By.xpath("//h4[normalize-space()='HBH-Transfer of Property in case of Sale deed']//following::img[@src='./assets/images/infoIcon.png'][1]");
//HBH-Issue of Change Ownership/Re-allotment Letter after execution of Sale deed
By infoReallotmentLetter =By.xpath("//h4[normalize-space()='HBH-Issue of Change Ownership/Re-allotment Letter after execution of Sale deed']//following::img[@src='./assets/images/infoIcon.png'][1]");
//HBH-Issue of Conveyance deed through GPA
By infoGPA =By.xpath("//h4[normalize-space()='HBH-Issue of Conveyance deed through GPA']//following::img[@src='./assets/images/infoIcon.png'][1]");
//HBH-Issue of Conveyance deed
By infoConveyancedeed =By.xpath("//h4[normalize-space()='HBH-Issue of Conveyance deed']//following::img[@src='./assets/images/infoIcon.png'][1]");
//HBH-Issue of No-Objection Certificate/Duplicate Allotment Letter
By infoAllotmentLetter =By.xpath("//h4[normalize-space()='HBH-Issue of No-Objection Certificate/Duplicate Allotment Letter']//following::img[@src='./assets/images/infoIcon.png'][1]");
//HBH-Transfer of Property in Case of Death (uncontested)
By infoCaseofDeath =By.xpath("//h4[normalize-space()='HBH-Transfer of Property in Case of Death (uncontested)']//following::img[@src='./assets/images/infoIcon.png'][1]");
//HBH-Issue of Permission for Mortgage
By infoMortgage =By.xpath("//h4[normalize-space()='HBH-Issue of Permission for Mortgage']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoMortgage()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMortgage));
	  return Driver.findElement(infoMortgage);
}
public WebElement infoCaseofDeath()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCaseofDeath));
	  return Driver.findElement(infoCaseofDeath);
}
public WebElement infoAllotmentLetter()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAllotmentLetter));
	  return Driver.findElement(infoAllotmentLetter);
}
public WebElement infoConveyancedeed()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoConveyancedeed));
	  return Driver.findElement(infoConveyancedeed);
}
public WebElement infoGPA()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoGPA));
	  return Driver.findElement(infoGPA);
}
public WebElement infoReallotmentLetter()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoReallotmentLetter));
	  return Driver.findElement(infoReallotmentLetter);
}
public WebElement infoSaledeed()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSaledeed));
	  return Driver.findElement(infoSaledeed);
}
public WebElement infoGeneralTransfer()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoGeneralTransfer));
	  return Driver.findElement(infoGeneralTransfer);
}
public WebElement infoDuesCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDuesCertificate));
	  return Driver.findElement(infoDuesCertificate);
}
public WebElement Mortgage()
{
	wait.until(ExpectedConditions.elementToBeClickable(Mortgage));
	  return Driver.findElement(Mortgage);
}
public WebElement CaseofDeath()
{
	wait.until(ExpectedConditions.elementToBeClickable(CaseofDeath));
	  return Driver.findElement(CaseofDeath);
}
public WebElement AllotmentLetter()
{
	wait.until(ExpectedConditions.elementToBeClickable(AllotmentLetter));
	  return Driver.findElement(AllotmentLetter);
}
public WebElement Conveyancedeed()
{
	wait.until(ExpectedConditions.elementToBeClickable(Conveyancedeed));
	  return Driver.findElement(Conveyancedeed);
}
public WebElement GPA()
{
	wait.until(ExpectedConditions.elementToBeClickable(GPA));
	  return Driver.findElement(GPA);
}
public WebElement ReallotmentLetter()
{
	wait.until(ExpectedConditions.elementToBeClickable(ReallotmentLetter));
	  return Driver.findElement(ReallotmentLetter);
}
public WebElement Saledeed()
{
	wait.until(ExpectedConditions.elementToBeClickable(Saledeed));
	  return Driver.findElement(Saledeed);
}
public WebElement GeneralTransfer()
{
	wait.until(ExpectedConditions.elementToBeClickable(GeneralTransfer));
	  return Driver.findElement(GeneralTransfer);
}
public WebElement DuesCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(DuesCertificate));
	  return Driver.findElement(DuesCertificate);
}


}
