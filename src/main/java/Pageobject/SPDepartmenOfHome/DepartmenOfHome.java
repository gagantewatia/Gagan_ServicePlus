package Pageobject.SPDepartmenOfHome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DepartmenOfHome{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepartmenOfHome(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Registration of Outside Arms License
By OutsideArmsLicense =By.xpath("//h4[normalize-space()='Registration of Outside Arms License']");
//Renewal of Arms License
By RenewalofArms =By.xpath("//h4[normalize-space()='Renewal of Arms License']");
//Extension of Area Validity of Arms License
By ValidityofArms =By.xpath("//h4[normalize-space()='Extension of Area Validity of Arms License']");
//Change of Quantity of Ammunition in Arm License
By AmmunitioninArm =By.xpath("//h4[normalize-space()='Change of Quantity of Ammunition in Arm License']");
//Sale/Transfer/Gift of Arms License
By GiftofArms =By.xpath("//h4[normalize-space()='Sale/Transfer/Gift/Deactivation of Arms License']");
//Issuance of New Arms License
By NewArmsLicense =By.xpath("//h4[normalize-space()='Issuance of New Arms License']");
//Cancellation/Suspension/Revocation of Arms License
By RevocationofArms =By.xpath("//h4[normalize-space()='Cancellation/Suspension/Revocation of Arms License']");
//Change of Address Within the Jurisdiction
By Jurisdiction =By.xpath("//h4[normalize-space()='Change of Address Within the Jurisdiction']");
//Conversion of one type of weapon to another type
By Conversion =By.xpath("//h4[normalize-space()='Conversion of one type of weapon to another type']");
//Extension of purchase period of weapon
By Extension  =By.xpath("//h4[normalize-space()='Extension of purchase period of weapon']");
//Deletion of Weapon from Arms License
By DeletionWeapon =By.xpath("//h4[normalize-space()='Deletion of Weapon from Arms License']");
//Issuance of Duplicate Arm License
By DuplicateArmLicense =By.xpath("//h4[normalize-space()='Issuance of Duplicate Arm License']");
//Acquisition of Firearm
By AcquisitionFirearm  =By.xpath("//h4[normalize-space()='Acquisition of Firearm']");
//Acquisition of Firearm
By EndorsementofWeapon  =By.xpath("//h4[normalize-space()='Endorsement of Weapon in Arms License']");

///seeInfo

//Registration of Outside Arms License
By infoOutsideArmsLicense =By.xpath("//h4[normalize-space()='Registration of Outside Arms License']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Renewal of Arms License
By infoRenewalofArms =By.xpath("//h4[normalize-space()='Renewal of Arms License']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Extension of Area Validity of Arms License
By infoValidityofArms =By.xpath("//h4[normalize-space()='Extension of Area Validity of Arms License']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Change of Quantity of Ammunition in Arm License
By infoAmmunitioninArm =By.xpath("//h4[normalize-space()='Change of Quantity of Ammunition in Arm License']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Sale/Transfer/Gift of Arms License
By infoGiftofArms =By.xpath("//h4[normalize-space()='Sale/Transfer/Gift/Deactivation of Arms License']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Issuance of New Arms License
By infoNewArmsLicense =By.xpath("//h4[normalize-space()='Issuance of New Arms License']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Cancellation/Suspension/Revocation of Arms License
By infoRevocationofArms =By.xpath("//h4[normalize-space()='Cancellation/Suspension/Revocation of Arms License']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Change of Address Within the Jurisdiction
By infoJurisdiction =By.xpath("//h4[normalize-space()='Change of Address Within the Jurisdiction']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Conversion of one type of weapon to another type
By infoConversion =By.xpath("//h4[normalize-space()='Conversion of one type of weapon to another type']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Extension of purchase period of weapon
By infoExtension  =By.xpath("//h4[normalize-space()='Extension of purchase period of weapon']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Deletion of Weapon from Arms License
By infoDeletionWeapon =By.xpath("//h4[normalize-space()='Deletion of Weapon from Arms License']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Issuance of Duplicate Arm License
By infoDuplicateArmLicense =By.xpath("//h4[normalize-space()='Issuance of Duplicate Arm License']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Acquisition of Firearm
By infoAcquisitionFirearm  =By.xpath("//h4[normalize-space()='Acquisition of Firearm']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Acquisition of Firearm
By infoEndorsementofWeapon  =By.xpath("//h4[normalize-space()='Endorsement of Weapon in Arms License']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoEndorsementofWeapon()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoEndorsementofWeapon));
	  return Driver.findElement(infoEndorsementofWeapon);
}

public WebElement infoDeletionWeapon()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDeletionWeapon));
	  return Driver.findElement(infoDeletionWeapon);
}
public WebElement infoDuplicateArmLicense()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDuplicateArmLicense));
	  return Driver.findElement(infoDuplicateArmLicense);
}

public WebElement infoAcquisitionFirearm()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAcquisitionFirearm));
	  return Driver.findElement(infoAcquisitionFirearm);
}

public WebElement infoExtension()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoExtension));
	  return Driver.findElement(infoExtension);
}
public WebElement infoConversion()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoConversion));
	  return Driver.findElement(infoConversion);
}

public WebElement infoAmmunitioninArm()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAmmunitioninArm));
	  return Driver.findElement(infoAmmunitioninArm);
}
public WebElement infoJurisdiction()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoJurisdiction));
	  return Driver.findElement(infoJurisdiction);
}

public WebElement infoRevocationofArms()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoRevocationofArms));
	  return Driver.findElement(infoRevocationofArms);
}
public WebElement infoNewArmsLicense()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoNewArmsLicense));
	  return Driver.findElement(infoNewArmsLicense);
}

public WebElement infoGiftofArms()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoGiftofArms));
	  return Driver.findElement(infoGiftofArms);
}
public WebElement infoValidityofArms()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoValidityofArms));
	  return Driver.findElement(infoValidityofArms);
}

public WebElement infoRenewalofArms()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoRenewalofArms));
	  return Driver.findElement(infoRenewalofArms);
}
public WebElement infoOutsideArmsLicense()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoOutsideArmsLicense));
	  return Driver.findElement(infoOutsideArmsLicense);
}







public WebElement EndorsementofWeapon()
{
	wait.until(ExpectedConditions.elementToBeClickable(EndorsementofWeapon));
	  return Driver.findElement(EndorsementofWeapon);
}

public WebElement DeletionWeapon()
{
	wait.until(ExpectedConditions.elementToBeClickable(DeletionWeapon));
	  return Driver.findElement(DeletionWeapon);
}
public WebElement DuplicateArmLicense()
{
	wait.until(ExpectedConditions.elementToBeClickable(DuplicateArmLicense));
	  return Driver.findElement(DuplicateArmLicense);
}

public WebElement AcquisitionFirearm()
{
	wait.until(ExpectedConditions.elementToBeClickable(AcquisitionFirearm));
	  return Driver.findElement(AcquisitionFirearm);
}

public WebElement Extension()
{
	wait.until(ExpectedConditions.elementToBeClickable(Extension));
	  return Driver.findElement(Extension);
}
public WebElement Conversion()
{
	wait.until(ExpectedConditions.elementToBeClickable(Conversion));
	  return Driver.findElement(Conversion);
}

public WebElement AmmunitioninArm()
{
	wait.until(ExpectedConditions.elementToBeClickable(AmmunitioninArm));
	  return Driver.findElement(AmmunitioninArm);
}
public WebElement Jurisdiction()
{
	wait.until(ExpectedConditions.elementToBeClickable(Jurisdiction));
	  return Driver.findElement(Jurisdiction);
}

public WebElement RevocationofArms()
{
	wait.until(ExpectedConditions.elementToBeClickable(RevocationofArms));
	  return Driver.findElement(RevocationofArms);
}
public WebElement NewArmsLicense()
{
	wait.until(ExpectedConditions.elementToBeClickable(NewArmsLicense));
	  return Driver.findElement(NewArmsLicense);
}

public WebElement GiftofArms()
{
	wait.until(ExpectedConditions.elementToBeClickable(GiftofArms));
	  return Driver.findElement(GiftofArms);
}
public WebElement ValidityofArms()
{
	wait.until(ExpectedConditions.elementToBeClickable(ValidityofArms));
	  return Driver.findElement(ValidityofArms);
}

public WebElement RenewalofArms()
{
	wait.until(ExpectedConditions.elementToBeClickable(RenewalofArms));
	  return Driver.findElement(RenewalofArms);
}
public WebElement OutsideArmsLicense()
{
	wait.until(ExpectedConditions.elementToBeClickable(OutsideArmsLicense));
	  return Driver.findElement(OutsideArmsLicense);
}



}
