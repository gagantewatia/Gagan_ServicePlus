package Pageobject.SPAgricultureDepartmentHaryana;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgricultureDepartmentHaryana{
public WebDriver Driver;
WebDriverWait wait;
	
	

public AgricultureDepartmentHaryana(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Grant of License or Renewal for Working of Cotton Ginning and/or Pressing Factory
By CottonGinningPressingFactory =By.xpath("//h4[normalize-space()='Grant of License or Renewal for Working of Cotton Ginning and/or Pressing Factory']");

//Implementation of Scheme for Providing Implements/Machinery on Subsidy to the Farmer of Schedule Caste Category SB-89/Last Date
By ScheduleCasteCategory = By.xpath("//h4[normalize-space()='Implementation of Scheme for Providing Implements/Machinery on Subsidy to the Farmer of Schedule Caste Category SB-89/Last Date']");

//License of Pesticides - District Level
By  LicenseofPesticides=By.xpath("//h4[normalize-space()='License of Pesticides - District Level']");

//License of Seeds - District Level
By LicenseofSeeds=By.xpath("//h4[normalize-space()='License of Seeds - District Level']");

//Application for Acknowledgement of Receipt/Authorization letter of Fertilizer Dealer Services - District Level
By ReceiptAuthorizationletter =By.xpath("//h4[normalize-space()='Application for Acknowledgement of Receipt/Authorization letter of Fertilizer Dealer Services - District Level']");

//Grant Of License or Renewal to Install A Power Crusher For Manufacturer Of Gur
By PowerCrusher = By.xpath("//h4[normalize-space()='Grant Of License or Renewal to Install A Power Crusher For Manufacturer Of Gur']");

//Grant of Licence or Renewal to install or use Centrifugal for the manufacture of Khandsari Sugar
By  KhandsariSugar=By.xpath("//h4[normalize-space()='Grant of Licence or Renewal to install or use Centrifugal for the manufacture of Khandsari Sugar']");

//Renewal OR Duplicate OR Amendment in Acknowledgment of Receipt/Authorization letter of Fertilizer Dealer Services - District lev
By FertilizerDealerServices=By.xpath("//h4[normalize-space()='Renewal OR Duplicate OR Amendment in Acknowledgment of Receipt/Authorization letter of Fertilizer Dealer Services - District lev']");


//info 

By infoCottonGinningPressingFactory =By.xpath("//h4[normalize-space()='Grant of License or Renewal for Working of Cotton Ginning and/or Pressing Factory']//following::img[@src='./assets/images/infoIcon.png'][1]");

By infoScheduleCasteCategory = By.xpath("//h4[normalize-space()='Implementation of Scheme for Providing Implements/Machinery on Subsidy to the Farmer of Schedule Caste Category SB-89/Last Date']//following::img[@src='./assets/images/infoIcon.png'][1]");

By infoLicenseofPesticides=By.xpath("//h4[normalize-space()='License of Pesticides - District Level']//following::img[@src='./assets/images/infoIcon.png'][1]");

By infoLicenseofSeeds=By.xpath("//h4[normalize-space()='License of Seeds - District Level']//following::img[@src='./assets/images/infoIcon.png'][1]");

By infoReceiptAuthorizationletter =By.xpath("//h4[normalize-space()='Application for Acknowledgement of Receipt/Authorization letter of Fertilizer Dealer Services - District Level']//following::img[@src='./assets/images/infoIcon.png'][1]");

By infoPowerCrusher = By.xpath("//h4[normalize-space()='Grant Of License or Renewal to Install A Power Crusher For Manufacturer Of Gur']//following::img[@src='./assets/images/infoIcon.png'][1]");

By infoKhandsariSugar=By.xpath("//h4[normalize-space()='Grant of Licence or Renewal to install or use Centrifugal for the manufacture of Khandsari Sugar']//following::img[@src='./assets/images/infoIcon.png'][1]");

By infoFertilizerDealerServices=By.xpath("//h4[normalize-space()='Renewal OR Duplicate OR Amendment in Acknowledgment of Receipt/Authorization letter of Fertilizer Dealer Services - District lev']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoKhandsariSugar()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoKhandsariSugar));
	  return Driver.findElement(infoKhandsariSugar);
}

public WebElement infoFertilizerDealerServices()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFertilizerDealerServices));
	  return Driver.findElement(infoFertilizerDealerServices);
}

public WebElement infoReceiptAuthorizationletter()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoReceiptAuthorizationletter));
	  return Driver.findElement(infoReceiptAuthorizationletter);
}

public WebElement infoPowerCrusher()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPowerCrusher));
	  return Driver.findElement(infoPowerCrusher);
}

public WebElement infoLicenseofPesticides()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoLicenseofPesticides));
	  return Driver.findElement(infoLicenseofPesticides);
}

public WebElement infoLicenseofSeeds()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoLicenseofSeeds));
	  return Driver.findElement(infoLicenseofSeeds);
}

public WebElement infoScheduleCasteCategory()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoScheduleCasteCategory));
	  return Driver.findElement(infoScheduleCasteCategory);
}

public WebElement infoCottonGinningPressingFactory()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCottonGinningPressingFactory));
	  return Driver.findElement(infoCottonGinningPressingFactory);
}

public WebElement FertilizerDealerServices()
{
	wait.until(ExpectedConditions.elementToBeClickable(FertilizerDealerServices));
	  return Driver.findElement(FertilizerDealerServices);
}
public WebElement KhandsariSugar()
{
	wait.until(ExpectedConditions.elementToBeClickable(KhandsariSugar));
	  return Driver.findElement(KhandsariSugar);
}

public WebElement PowerCrusher()
{
	wait.until(ExpectedConditions.elementToBeClickable(PowerCrusher));
	  return Driver.findElement(PowerCrusher);
}

public WebElement ReceiptAuthorizationletter()
{
	wait.until(ExpectedConditions.elementToBeClickable(ReceiptAuthorizationletter));
	  return Driver.findElement(ReceiptAuthorizationletter);
}



public WebElement LicenseofSeeds()
{
	wait.until(ExpectedConditions.elementToBeClickable(LicenseofSeeds));
	  return Driver.findElement(LicenseofSeeds);
}
public WebElement LicenseofPesticides()
{
	wait.until(ExpectedConditions.elementToBeClickable(LicenseofPesticides));
	  return Driver.findElement(LicenseofPesticides);
}

public WebElement ScheduleCasteCategory()
{
	wait.until(ExpectedConditions.elementToBeClickable(ScheduleCasteCategory));
	  return Driver.findElement(ScheduleCasteCategory);
}

public WebElement CottonGinningPressingFactory()
{
	wait.until(ExpectedConditions.elementToBeClickable(CottonGinningPressingFactory));
	  return Driver.findElement(CottonGinningPressingFactory);
}

}
