package Pageobject.SPDepOfPersonnelAdministrativeReforms;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepOfPersonnelAdministrativeReforms{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepOfPersonnelAdministrativeReforms(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}


//Caste Certificate For ST Where Local Inspection Report Is Required
By STLocalInspection=By.xpath("//h4[normalize-space()='Caste Certificate For ST Where Local Inspection Report Is Required']");

By infoSTLocalInspection=By.xpath("//h4[normalize-space()='Caste Certificate For ST Where Local Inspection Report Is Required']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Caste Certificate for SC Where Local Inspection Report Is Required
By LocalInspection = By.xpath("//h4[normalize-space()='Caste Certificate for SC Where Local Inspection Report Is Required']");

//Caste Certificate for SC Where Local Inspection Report Is Required
By infoLocalInspection = By.xpath("//h4[normalize-space()='Caste Certificate for SC Where Local Inspection Report Is Required']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Caste Certificate for SC Central by SDO and DC
By infoSCCentral=By.xpath("//h4[normalize-space()='Caste Certificate for SC Central by SDO and DC']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Caste Certificate for ST Central by SDO and DC
By infoSTCentral=By.xpath("//h4[normalize-space()='Caste Certificate for ST Central by SDO and DC']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Caste Certificate for EBC I and BC II (Non Creamy Layer)
By infoEBCINonCreamyLayer=By.xpath("//h4[normalize-space()='Caste Certificate for EBC I and BC II (Non Creamy Layer)']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Income and Asset Certificate for EWS for the area not covered under ULB or RLB
By infoAssetCertificateEWS = By.xpath("//h4[normalize-space()='Income and Asset Certificate for EWS for the area not covered under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Caste Certificate for Scheduled Tribe
By infoScheduledTribe=By.xpath("//h4[normalize-space()='Caste Certificate for Scheduled Tribe']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Caste certificate for ST by Circle officer for the area not covered under ULB or RLB
By infoCircleofficerULB=By.xpath("//h4[normalize-space()='Caste certificate for ST by Circle officer for the area not covered under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Caste Certificate for EBC I and BC II (Non Creamy Layer) for the area not covered under ULB or RLB
By infoCasteCertificateNonCreamyLayer=By.xpath("//h4[normalize-space()='Caste Certificate for EBC I and BC II (Non Creamy Layer) for the area not covered under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");


//Caste Certificate for EBC I and BC II for the area not covered under ULB or RLB
By infoCasteCertificate=By.xpath("//h4[normalize-space()='Caste Certificate for EBC I and BC II for the area not covered under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Caste Certificate for OBC for the area not covered under ULB or RLB
By infoCasteCertificateOBC=By.xpath("///h4[normalize-space()='Caste Certificate for OBC for the area not covered under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Income and Asset Certificate for EWS
By infoAssetCertificate=By.xpath("//h4[normalize-space()='Income and Asset Certificate for EWS']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Local Resident Certificate by Circle Officer
By infoCircleOfficer=By.xpath("//h4[normalize-space()='Local Resident Certificate by Circle Officer']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Income and Asset Certificate for EWS by SDO and DC 
By infoAssetCertificateSDO=By.xpath("//h4[normalize-space()='Income and Asset Certificate for EWS by SDO and DC']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Caste certificate for ST by SDO and DC for the area not covered under ULB or RLB
By infoCastecertificateST=By.xpath("//h4[normalize-space()='Caste certificate for ST by SDO and DC for the area not covered under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Caste Certificate for OBC by SDO and DC for the area not covered under ULB or RLB
By infoCasteCertificateSDO = By.xpath("//h4[normalize-space()='Caste Certificate for OBC by SDO and DC for the area not covered under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Income and Asset Certificate for EWS by SDO and DC for the area not covered under ULB or RLB
By infoIncome=By.xpath("//h4[normalize-space()='Income and Asset Certificate for EWS by SDO and DC for the area not covered under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Caste Certificate for Scheduled Caste for the area not covered under ULB or RLB
By infoScheduledCasteULB=By.xpath("//h4[normalize-space()='Caste Certificate for Scheduled Caste for the area not covered under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Local Resident Certificate by Circle Officer for the area not lies under ULB or RLB
By infoResidentCertificate =By.xpath("//h4[normalize-space()='Local Resident Certificate by Circle Officer for the area not lies under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Caste Certificate for Scheduled Caste by SDO and DC for the area not covered under ULB or RLB
By infoScheduledCasteSDO=By.xpath("//h4[normalize-space()='Caste Certificate for Scheduled Caste by SDO and DC for the area not covered under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Local Resident Certificate by Sub Divisional Officer for the area not lies under ULB or RLB
By infoSubDivisionalOfficer=By.xpath("//h4[normalize-space()='Local Resident Certificate by Sub Divisional Officer for the area not lies under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Caste Certificate for ST and SC Migrants for area not covered under ULB or RLB
By infoSCMigrants=By.xpath("//h4[normalize-space()='Caste Certificate for ST and SC Migrants for area not covered under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Caste Certificate for Scheduled Caste
By infoScheduledCaste =By.xpath("//h4[normalize-space()='Caste Certificate for Scheduled Caste']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Caste Certificate for OBC Migrants
By infoOBCMigrants=By.xpath("//h4[normalize-space()='Caste Certificate for OBC Migrants']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Caste Certificate for OBC Migrants for area not covered under ULB or RLB
By infoULBorRLB=By.xpath("//h4[normalize-space()='Caste Certificate for OBC Migrants for area not covered under ULB or RLB']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoULBorRLB()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoULBorRLB));
	  return Driver.findElement(infoULBorRLB);
}

public WebElement infoOBCMigrants()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoOBCMigrants));
	  return Driver.findElement(infoOBCMigrants);
}
public WebElement infoScheduledCaste()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoScheduledCaste));
	  return Driver.findElement(infoScheduledCaste);
}

public WebElement infoSCMigrants()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSCMigrants));
	  return Driver.findElement(infoSCMigrants);
}
public WebElement infoSubDivisionalOfficer()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSubDivisionalOfficer));
	  return Driver.findElement(infoSubDivisionalOfficer);
}
public WebElement infoScheduledCasteSDO()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoScheduledCasteSDO));
	  return Driver.findElement(infoScheduledCasteSDO);
}
public WebElement infoResidentCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoResidentCertificate));
	  return Driver.findElement(infoResidentCertificate);
}

public WebElement infoAssetCertificateSDO()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAssetCertificateSDO));
	  return Driver.findElement(infoAssetCertificateSDO);
}
public WebElement infoScheduledCasteULB()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoScheduledCasteULB));
	  return Driver.findElement(infoScheduledCasteULB);
}
public WebElement infoIncome()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoIncome));
	  return Driver.findElement(infoIncome);
}
public WebElement infoCasteCertificateSDO()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCasteCertificateSDO));
	  return Driver.findElement(infoCasteCertificateSDO);
}
public WebElement infoCastecertificateST()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCastecertificateST));
	  return Driver.findElement(infoCastecertificateST);
}


public WebElement infoCircleOfficer()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCircleOfficer));
	  return Driver.findElement(infoCircleOfficer);
}

public WebElement infoAssetCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAssetCertificate));
	  return Driver.findElement(infoAssetCertificate);
}

public WebElement infoCasteCertificateOBC()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCasteCertificateOBC));
	  return Driver.findElement(infoCasteCertificateOBC);
}
public WebElement infoCasteCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCasteCertificate));
	  return Driver.findElement(infoCasteCertificate);
}
public WebElement infoCasteCertificateNonCreamyLayer()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCasteCertificateNonCreamyLayer));
	  return Driver.findElement(infoCasteCertificateNonCreamyLayer);
}

public WebElement infoCircleofficerULB()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCircleofficerULB));
	  return Driver.findElement(infoCircleofficerULB);
}
public WebElement infoScheduledTribe()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoScheduledTribe));
	  return Driver.findElement(infoScheduledTribe);
}
public WebElement infoAssetCertificateEWS()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAssetCertificateEWS));
	  return Driver.findElement(infoAssetCertificateEWS);
}

public WebElement infoEBCINonCreamyLayer()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoEBCINonCreamyLayer));
	  return Driver.findElement(infoEBCINonCreamyLayer);
}
public WebElement infoSTCentral()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSTCentral));
	  return Driver.findElement(infoSTCentral);
}

public WebElement infoSCCentral()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSCCentral));
	  return Driver.findElement(infoSCCentral);
}
public WebElement infoLocalInspection()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoLocalInspection));
	  return Driver.findElement(infoLocalInspection);
}
public WebElement infoSTLocalInspection()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSTLocalInspection));
	  return Driver.findElement(infoSTLocalInspection);
}

//Income and Asset Certificate for EWS for the area not covered under ULB or RLB
By AssetCertificateEWS = By.xpath("//h4[normalize-space()='Income and Asset Certificate for EWS for the area not covered under ULB or RLB']");

//Caste Certificate for Scheduled Caste
By ScheduledCaste =By.xpath("//h4[normalize-space()='Caste Certificate for Scheduled Caste']");

//Local Resident Certificate by Circle Officer
By CircleOfficer=By.xpath("//h4[normalize-space()='Local Resident Certificate by Circle Officer']");
//Caste Certificate for SC Central by SDO and DC
By SCCentral=By.xpath("//h4[normalize-space()='Caste Certificate for SC Central by SDO and DC']");
//Caste Certificate for EBC I and BC II
By EBCI=By.xpath("//h4[normalize-space()='Caste Certificate for EBC I and BC II']");
//Caste Certificate for ST Central by SDO and DC
By STCentral=By.xpath("//h4[normalize-space()='Caste Certificate for ST Central by SDO and DC']");
//Caste Certificate for EBC I and BC II (Non Creamy Layer)
By EBCINonCreamyLayer=By.xpath("//h4[normalize-space()='Caste Certificate for EBC I and BC II (Non Creamy Layer)']");
//Income and Asset Certificate for EWS
By AssetCertificate=By.xpath("//h4[normalize-space()='Income and Asset Certificate for EWS']");
//Caste Certificate for Scheduled Tribe
By ScheduledTribe=By.xpath("//h4[normalize-space()='Caste Certificate for Scheduled Tribe']");
//Caste Certificate for Scheduled Caste for the area not covered under ULB or RLB
By ScheduledCasteULB=By.xpath("//h4[normalize-space()='Caste Certificate for Scheduled Caste for the area not covered under ULB or RLB']");
//Caste certificate for ST by Circle officer for the area not covered under ULB or RLB
By CircleofficerULB=By.xpath("//h4[normalize-space()='Caste certificate for ST by Circle officer for the area not covered under ULB or RLB']");
//Caste Certificate for EBC I and BC II (Non Creamy Layer) for the area not covered under ULB or RLB
By CasteCertificateNonCreamyLayer=By.xpath("//h4[normalize-space()='Caste Certificate for EBC I and BC II (Non Creamy Layer) for the area not covered under ULB or RLB']");
//Caste Certificate for EBC I and BC II for the area not covered under ULB or RLB
By CasteCertificate=By.xpath("//h4[normalize-space()='Caste Certificate for EBC I and BC II for the area not covered under ULB or RLB']");
//Caste Certificate for OBC for the area not covered under ULB or RLB
By CasteCertificateOBC=By.xpath("///h4[normalize-space()='Caste Certificate for OBC for the area not covered under ULB or RLB']");
//Local Resident Certificate by Circle Officer for the area not lies under ULB or RLB
By ResidentCertificate =By.xpath("//h4[normalize-space()='Local Resident Certificate by Circle Officer for the area not lies under ULB or RLB']");

//Income and Asset Certificate for EWS by SDO and DC 
By AssetCertificateSDO=By.xpath("//h4[normalize-space()='Income and Asset Certificate for EWS by SDO and DC']");
//Caste certificate for ST by SDO and DC for the area not covered under ULB or RLB
By CastecertificateST=By.xpath("//h4[normalize-space()='Caste certificate for ST by SDO and DC for the area not covered under ULB or RLB']");
//Caste Certificate for OBC by SDO and DC for the area not covered under ULB or RLB
By CasteCertificateSDO = By.xpath("//h4[normalize-space()='Caste Certificate for OBC by SDO and DC for the area not covered under ULB or RLB']");
//Caste Certificate for Scheduled Caste by SDO and DC for the area not covered under ULB or RLB
By ScheduledCasteSDO=By.xpath("//h4[normalize-space()='Caste Certificate for Scheduled Caste by SDO and DC for the area not covered under ULB or RLB']");
//Income and Asset Certificate for EWS by SDO and DC for the area not covered under ULB or RLB
By Income=By.xpath("//h4[normalize-space()='Income and Asset Certificate for EWS by SDO and DC for the area not covered under ULB or RLB']");
//Local Resident Certificate by Sub Divisional Officer for the area not lies under ULB or RLB
By SubDivisionalOfficer=By.xpath("//h4[normalize-space()='Local Resident Certificate by Sub Divisional Officer for the area not lies under ULB or RLB']");

//Caste Certificate for ST and SC Migrants for area not covered under ULB or RLB
By SCMigrants=By.xpath("//h4[normalize-space()='Caste Certificate for ST and SC Migrants for area not covered under ULB or RLB']");

//Caste Certificate for OBC Migrants
By OBCMigrants=By.xpath("//h4[normalize-space()='Caste Certificate for OBC Migrants']");
//Caste Certificate for OBC Migrants for area not covered under ULB or RLB
By ULBorRLB=By.xpath("//h4[normalize-space()='Caste Certificate for OBC Migrants for area not covered under ULB or RLB']");


public WebElement ULBorRLB()
{
	wait.until(ExpectedConditions.elementToBeClickable(ULBorRLB));
	  return Driver.findElement(ULBorRLB);
}

public WebElement OBCMigrants()
{
	wait.until(ExpectedConditions.elementToBeClickable(OBCMigrants));
	  return Driver.findElement(OBCMigrants);
}
public WebElement SCMigrants()
{
	wait.until(ExpectedConditions.elementToBeClickable(SCMigrants));
	  return Driver.findElement(SCMigrants);
}
public WebElement STLocalInspection()
{
	wait.until(ExpectedConditions.elementToBeClickable(STLocalInspection));
	  return Driver.findElement(STLocalInspection);
}

public WebElement SubDivisionalOfficer()
{
	wait.until(ExpectedConditions.elementToBeClickable(SubDivisionalOfficer));
	  return Driver.findElement(SubDivisionalOfficer);
}

public WebElement ScheduledCaste()
{
	wait.until(ExpectedConditions.elementToBeClickable(ScheduledCaste));
	  return Driver.findElement(ScheduledCaste);
}

public WebElement LocalInspection()
{
	wait.until(ExpectedConditions.elementToBeClickable(LocalInspection));
	  return Driver.findElement(LocalInspection);
}


public WebElement CircleOfficer()
{
	wait.until(ExpectedConditions.elementToBeClickable(CircleOfficer));
	  return Driver.findElement(CircleOfficer);
}


public WebElement SCCentral()
{
	wait.until(ExpectedConditions.elementToBeClickable(SCCentral));
	  return Driver.findElement(SCCentral);
}

public WebElement EBCI()
{
	wait.until(ExpectedConditions.elementToBeClickable(EBCI));
	  return Driver.findElement(EBCI);
}

public WebElement STCentral()
{
	wait.until(ExpectedConditions.elementToBeClickable(STCentral));
	  return Driver.findElement(STCentral);
}

public WebElement EBCINonCreamyLayer()
{
	wait.until(ExpectedConditions.elementToBeClickable(EBCINonCreamyLayer));
	  return Driver.findElement(EBCINonCreamyLayer);
}

public WebElement AssetCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(AssetCertificate));
	  return Driver.findElement(AssetCertificate);
}

public WebElement ScheduledTribe()
{
	wait.until(ExpectedConditions.elementToBeClickable(ScheduledTribe));
	  return Driver.findElement(ScheduledTribe);
}

public WebElement ScheduledCasteULB()
{
	wait.until(ExpectedConditions.elementToBeClickable(ScheduledCasteULB));
	  return Driver.findElement(ScheduledCasteULB);
}

public WebElement CircleofficerULB()
{
	wait.until(ExpectedConditions.elementToBeClickable(CircleofficerULB));
	  return Driver.findElement(CircleofficerULB);
}

public WebElement CasteCertificateNonCreamyLayer()
{
	wait.until(ExpectedConditions.elementToBeClickable(CasteCertificateNonCreamyLayer));
	  return Driver.findElement(CasteCertificateNonCreamyLayer);
}
public WebElement CasteCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(CasteCertificate));
	  return Driver.findElement(CasteCertificate);
}
public WebElement CasteCertificateOBC()
{
	wait.until(ExpectedConditions.elementToBeClickable(CasteCertificateOBC));
	  return Driver.findElement(CasteCertificateOBC);
}
public WebElement ResidentCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(ResidentCertificate));
	  return Driver.findElement(ResidentCertificate);
}

public WebElement AssetCertificateEWS()
{
	wait.until(ExpectedConditions.elementToBeClickable(AssetCertificateEWS));
	  return Driver.findElement(AssetCertificateEWS);
}
public WebElement AssetCertificateSDO()
{
	wait.until(ExpectedConditions.elementToBeClickable(AssetCertificateSDO));
	  return Driver.findElement(AssetCertificateSDO);
}
public WebElement CastecertificateST()
{
	wait.until(ExpectedConditions.elementToBeClickable(CastecertificateST));
	  return Driver.findElement(CastecertificateST);
	 	  
}

public WebElement CasteCertificateSDO()
{
	wait.until(ExpectedConditions.elementToBeClickable(CasteCertificateSDO));
	  return Driver.findElement(CasteCertificateSDO);
}
public WebElement ScheduledCasteSDO()
{
	wait.until(ExpectedConditions.elementToBeClickable(ScheduledCasteSDO));
	  return Driver.findElement(ScheduledCasteSDO);
}
public WebElement Income()
{
	wait.until(ExpectedConditions.elementToBeClickable(Income));
	  return Driver.findElement(Income);
}
}
