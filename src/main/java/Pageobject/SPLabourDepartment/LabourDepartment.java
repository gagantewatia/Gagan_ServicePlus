package Pageobject.SPLabourDepartment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LabourDepartment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public LabourDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
By BicycleScheme =By.xpath("//h4[normalize-space()='Bicycle Scheme for registered worker of HBOCWW Board']");


By FreeTravelling =By.xpath("//h4[normalize-space()='Free Travelling Facility for registered worker of HBOCWW Board']");

By Grantpurchase =By.xpath("//h4[normalize-space()='Grant for purchase of tools for registered worker of HBOCWW Board']");


By FarEvisitingHome =By.xpath("//h4[normalize-space()='Fare for visiting Home Town for registered worker of HBOCWW Board']");


By MedicalAssistance =By.xpath("//h4[normalize-space()='Medical Assistance / Wage Compensation during illness for registered worker of HBOCWW Board']");


By DisabilityPension =By.xpath("//h4[normalize-space()='Disability Pension for registered worker of HBOCWW Board']");


By FinancialAssistance =By.xpath("//h4[normalize-space()='Financial Assistance for treatment of Chronic Diseases for registered worker of HBOCWW Board']");


By MukhyaMantriMahila =By.xpath("//h4[normalize-space()='Mukhya Mantri Mahila Nirman Shramik Sammaan Yojna for registered Women workers of HBOCWW Board']");


By KanyadaanScheme =By.xpath("//h4[normalize-space()='Kanyadaan Scheme for daughters of registered worker of HBOCWW Board']");


By MaternityBenefitScheme =By.xpath("//h4[normalize-space()='Maternity Benefit Scheme for registered Women worker of HBOCWW Board']");


By SewingMachineScheme =By.xpath("//h4[normalize-space()='Sewing Machine Scheme for registered Women workers of HBOCWW Board']");


By MukhyaMantriSamajik =By.xpath("//h4[normalize-space()='Mukhya Mantri Samajik Suraksha Yojna for registered worker of HBOCWW Board']");


By FinancialAssistancedisabled =By.xpath("//h4[normalize-space()='Financial Assistance to disabled childern of registered worker of HBOCWW Board']");


By PensionScheme =By.xpath("//h4[normalize-space()='Pension Scheme for registered worker of HBOCWW Board']");


By FamilyPension =By.xpath("//h4[normalize-space()='Family Pension for Pensioner of HBOCWW Board']");


By DeathAssistance =By.xpath("//h4[normalize-space()='Death Assistance for registered worker of HBOCWW Board']");


By FuneralAssistance =By.xpath("//h4[normalize-space()='Funeral Assistance for registered worker of HBOCWW Board']");


By FinancialAssistanceconstruction =By.xpath("//h4[normalize-space()='Financial Assistance to registered construction worker of HBOCWW Board for purchase / construction of House']");


By FinancialAssistanceMarriage =By.xpath("//h4[normalize-space()='Financial Assistance on Marriage of Children of registered worker of HBOCWW Board']");


By DisabilityAssistance =By.xpath("//h4[normalize-space()='Disability Assistance for registered worker of HBOCWW Board']");


By FinancialAssistanceEducation =By.xpath("//h4[normalize-space()='Financial Assistance for Education of children of registered worker of HBOCWW Board']");


By PaternityBenefit =By.xpath("//h4[normalize-space()='Paternity Benefit Scheme for male registered worker of HBOCWW Board']");

///INFO SERVICE 

By infoBicycleScheme =By.xpath("//h4[normalize-space()='Bicycle Scheme for registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoFreeTravelling =By.xpath("//h4[normalize-space()='Free Travelling Facility for registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");

By infoGrantpurchase =By.xpath("//h4[normalize-space()='Grant for purchase of tools for registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoFarEvisitingHome =By.xpath("//h4[normalize-space()='Fare for visiting Home Town for registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoMedicalAssistance =By.xpath("//h4[normalize-space()='Medical Assistance / Wage Compensation during illness for registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoDisabilityPension =By.xpath("//h4[normalize-space()='Disability Pension for registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoFinancialAssistance =By.xpath("//h4[normalize-space()='Financial Assistance for treatment of Chronic Diseases for registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoMukhyaMantriMahila =By.xpath("//h4[normalize-space()='Mukhya Mantri Mahila Nirman Shramik Sammaan Yojna for registered Women workers of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoKanyadaanScheme =By.xpath("//h4[normalize-space()='Kanyadaan Scheme for daughters of registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoMaternityBenefitScheme =By.xpath("//h4[normalize-space()='Maternity Benefit Scheme for registered Women worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoSewingMachineScheme =By.xpath("//h4[normalize-space()='Sewing Machine Scheme for registered Women workers of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoMukhyaMantriSamajik =By.xpath("//h4[normalize-space()='Mukhya Mantri Samajik Suraksha Yojna for registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoFinancialAssistancedisabled =By.xpath("//h4[normalize-space()='Financial Assistance to disabled childern of registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoPensionScheme =By.xpath("//h4[normalize-space()='Pension Scheme for registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoFamilyPension =By.xpath("//h4[normalize-space()='Family Pension for Pensioner of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoDeathAssistance =By.xpath("//h4[normalize-space()='Death Assistance for registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoFuneralAssistance =By.xpath("//h4[normalize-space()='Funeral Assistance for registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoFinancialAssistanceconstruction =By.xpath("//h4[normalize-space()='Financial Assistance to registered construction worker of HBOCWW Board for purchase / construction of House']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoFinancialAssistanceMarriage =By.xpath("//h4[normalize-space()='Financial Assistance on Marriage of Children of registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoDisabilityAssistance =By.xpath("//h4[normalize-space()='Disability Assistance for registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoFinancialAssistanceEducation =By.xpath("//h4[normalize-space()='Financial Assistance for Education of children of registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoPaternityBenefit =By.xpath("//h4[normalize-space()='Paternity Benefit Scheme for male registered worker of HBOCWW Board']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement FinancialAssistanceEducation()
{
	wait.until(ExpectedConditions.elementToBeClickable(FinancialAssistanceEducation));
	  return Driver.findElement(FinancialAssistanceEducation);
}
public WebElement infoFinancialAssistanceEducation()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFinancialAssistanceEducation));
	  return Driver.findElement(infoFinancialAssistanceEducation);
}

public WebElement infoBicycleScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoBicycleScheme));
	  return Driver.findElement(infoBicycleScheme);
}
public WebElement infoFreeTravelling()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFreeTravelling));
	  return Driver.findElement(infoFreeTravelling);
}
public WebElement infoGrantpurchase()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoGrantpurchase));
	  return Driver.findElement(infoGrantpurchase);
}
public WebElement infoFarEvisitingHome()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFarEvisitingHome));
	  return Driver.findElement(infoFarEvisitingHome);
}
public WebElement infoMedicalAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMedicalAssistance));
	  return Driver.findElement(infoMedicalAssistance);
}
public WebElement infoDisabilityPension()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDisabilityPension));
	  return Driver.findElement(infoDisabilityPension);
}


public WebElement infoFinancialAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFinancialAssistance));
	  return Driver.findElement(infoFinancialAssistance);
}
public WebElement infoMukhyaMantriMahila()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMukhyaMantriMahila));
	  return Driver.findElement(infoMukhyaMantriMahila);
}
public WebElement infoKanyadaanScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoKanyadaanScheme));
	  return Driver.findElement(infoKanyadaanScheme);
}
public WebElement infoMaternityBenefitScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMaternityBenefitScheme));
	  return Driver.findElement(infoMaternityBenefitScheme);
}
public WebElement infoSewingMachineScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSewingMachineScheme));
	  return Driver.findElement(infoSewingMachineScheme);
}
public WebElement infoMukhyaMantriSamajik()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMukhyaMantriSamajik));
	  return Driver.findElement(infoMukhyaMantriSamajik);
}
public WebElement infoFinancialAssistancedisabled()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFinancialAssistancedisabled));
	  return Driver.findElement(infoFinancialAssistancedisabled);
}
public WebElement infoPensionScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPensionScheme));
	  return Driver.findElement(infoPensionScheme);
}

public WebElement infoFamilyPension()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFamilyPension));
	  return Driver.findElement(infoFamilyPension);
}
public WebElement infoDeathAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDeathAssistance));
	  return Driver.findElement(infoDeathAssistance);
}
public WebElement infoFuneralAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFuneralAssistance));
	  return Driver.findElement(infoFuneralAssistance);
}

public WebElement infoFinancialAssistanceconstruction()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFinancialAssistanceconstruction));
	  return Driver.findElement(infoFinancialAssistanceconstruction);
}
public WebElement infoFinancialAssistanceMarriage()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFinancialAssistanceMarriage));
	  return Driver.findElement(infoFinancialAssistanceMarriage);
}
public WebElement infoDisabilityAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDisabilityAssistance));
	  return Driver.findElement(infoDisabilityAssistance);
}

public WebElement infoPaternityBenefit()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPaternityBenefit));
	  return Driver.findElement(infoPaternityBenefit);
}

public WebElement BicycleScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(BicycleScheme));
	  return Driver.findElement(BicycleScheme);
}
public WebElement FreeTravelling()
{
	wait.until(ExpectedConditions.elementToBeClickable(FreeTravelling));
	  return Driver.findElement(FreeTravelling);
}
public WebElement Grantpurchase()
{
	wait.until(ExpectedConditions.elementToBeClickable(Grantpurchase));
	  return Driver.findElement(Grantpurchase);
}
public WebElement FarEvisitingHome()
{
	wait.until(ExpectedConditions.elementToBeClickable(FarEvisitingHome));
	  return Driver.findElement(FarEvisitingHome);
}
public WebElement MedicalAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(MedicalAssistance));
	  return Driver.findElement(MedicalAssistance);
}
public WebElement DisabilityPension()
{
	wait.until(ExpectedConditions.elementToBeClickable(DisabilityPension));
	  return Driver.findElement(DisabilityPension);
}


public WebElement FinancialAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(FinancialAssistance));
	  return Driver.findElement(FinancialAssistance);
}
public WebElement MukhyaMantriMahila()
{
	wait.until(ExpectedConditions.elementToBeClickable(MukhyaMantriMahila));
	  return Driver.findElement(MukhyaMantriMahila);
}
public WebElement KanyadaanScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(KanyadaanScheme));
	  return Driver.findElement(KanyadaanScheme);
}
public WebElement MaternityBenefitScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(MaternityBenefitScheme));
	  return Driver.findElement(MaternityBenefitScheme);
}
public WebElement SewingMachineScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(SewingMachineScheme));
	  return Driver.findElement(SewingMachineScheme);
}
public WebElement MukhyaMantriSamajik()
{
	wait.until(ExpectedConditions.elementToBeClickable(MukhyaMantriSamajik));
	  return Driver.findElement(MukhyaMantriSamajik);
}
public WebElement FinancialAssistancedisabled()
{
	wait.until(ExpectedConditions.elementToBeClickable(FinancialAssistancedisabled));
	  return Driver.findElement(FinancialAssistancedisabled);
}
public WebElement PensionScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(PensionScheme));
	  return Driver.findElement(PensionScheme);
}

public WebElement FamilyPension()
{
	wait.until(ExpectedConditions.elementToBeClickable(FamilyPension));
	  return Driver.findElement(FamilyPension);
}
public WebElement DeathAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(DeathAssistance));
	  return Driver.findElement(DeathAssistance);
}
public WebElement FuneralAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(FuneralAssistance));
	  return Driver.findElement(FuneralAssistance);
}

public WebElement FinancialAssistanceconstruction()
{
	wait.until(ExpectedConditions.elementToBeClickable(FinancialAssistanceconstruction));
	  return Driver.findElement(FinancialAssistanceconstruction);
}
public WebElement FinancialAssistanceMarriage()
{
	wait.until(ExpectedConditions.elementToBeClickable(FinancialAssistanceMarriage));
	  return Driver.findElement(FinancialAssistanceMarriage);
}
public WebElement DisabilityAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(DisabilityAssistance));
	  return Driver.findElement(DisabilityAssistance);
}

public WebElement PaternityBenefit()
{
	wait.until(ExpectedConditions.elementToBeClickable(PaternityBenefit));
	  return Driver.findElement(PaternityBenefit);
}
}