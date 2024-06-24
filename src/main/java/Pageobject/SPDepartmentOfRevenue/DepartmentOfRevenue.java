package Pageobject.SPDepartmentOfRevenue;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepartmentOfRevenue{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepartmentOfRevenue(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Application for Issuance of Marriage Certificate by Registrar
By MarriageCertificate =By.xpath("//h4[normalize-space()='Application for Issuance of Marriage Certificate by Registrar of Marriages']");
//Application for Issuance of Property Certificate
By PropertyCertificate = By.xpath("//h4[normalize-space()='Application for Issuance of Property Certificate']");
//Application for Issuance of Dependent Certificate
By  DependentCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Dependent Certificate']");
//Application for Issuance of Other Backward Classes (OBC) Certificate by Tehsildar
By  BackwardClasses=By.xpath("//h4[normalize-space()='Application for Issuance of Other Backward Classes (OBC) Certificate by Tehsildar']");
//Application for Issuance of Certificate of Belonging to Socially And Educationally Backward Class by Tehsildar - OSC / RBA / AL
By  Socially=By.xpath("//h4[normalize-space()='Application for Issuance of Certificate of Belonging to Socially And Educationally Backward Class by Tehsildar - OSC / RBA / AL']");
//Application for Issuance of Income Certificate by Tehsildar
By  IncomeCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Income Certificate by Tehsildar']");
//Application for Issuance of Income and Assets Certificate for Economically Weaker Section by Tehsildar
By  AssetsCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Income and Assets Certificate for Economically Weaker Section by Tehsildar']");
//Application for Issuance of Certificate for Being a Member of Scheduled Caste / Scheduled Tribe by Tehsildar - SC / ST Certifica
By  ScheduledCaste=By.xpath("//h4[normalize-space()='Application for Issuance of Certificate for Being a Member of Scheduled Caste / Scheduled Tribe by Tehsildar - SC / ST Certifica']");
//Application for Issuance of Pahari Ethnic People Category Certificate
By  CategoryCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Pahari Ethnic People Category Certificate']");
//Application for Issuance of Legal Heir Certificate by Tehsildar
By  LegalHeirCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Legal Heir Certificate by Tehsildar']");
//Application for Issuance of Certificate of Unemployment by Tehsildar
By  CertificateofUnemployment=By.xpath("//h4[normalize-space()='Application for Issuance of Certificate of Unemployment by Tehsildar']");
//Application for Issuance of Character Certificate by Tehsildar
By  CharacterCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Character Certificate by Tehsildar']");
//Application for Issuance of Character Certificate by Tehsildar
By  IncomeDependencyCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Income Dependency Certificate']");
By ServiceHeading=By.xpath("//h5[@class='text-center justify-content-center my-1']");
//second Application for Issuance of Dependent Certificate
By  SecDependentCertificate=By.xpath("(//h4[normalize-space()='Application for Issuance of Dependent Certificate'])[2]");
//Application for Issuance of Unmarried / Widow / Divorce Certificate by Tehsildar
By  DivorceCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Unmarried / Widow / Divorce Certificate by Tehsildar']");
//Application for Issuance of Family Income / Property Certificate for Rehabilitation Assistance Scheme by Tehsildar
By  FamilyIncome =By.xpath("//h4[normalize-space()='Application for Issuance of Family Income / Property Certificate for Rehabilitation Assistance Scheme by Tehsildar']");

//Application for Issuance of Permission to an Agriculturist to Alienate the land to a Non-Agriculturist
By  NonAgriculturist =By.xpath("//h4[normalize-space()='Application for Issuance of Permission to an Agriculturist to Alienate the land to a Non-Agriculturist']");

//See info 
//Application for Issuance of Property Certificate
By infoNonAgriculturist = By.xpath("//h4[normalize-space()='Application for Issuance of Permission to an Agriculturist to Alienate the land to a Non-Agriculturist']//following::img[@src='./assets/images/infoIcon.png'][1]");



//Application for Issuance of Income Certificate by Tehsildar
By  infoIncomeCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Income Certificate by Tehsildar']");

//Application for Issuance of Property Certificate
By infoPropertyCertificate = By.xpath("//h4[normalize-space()='Application for Issuance of Property Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Issuance of Dependent Certificate
By  infoDependentCertificate=By.xpath("//h4[normalize-space()='Application for Issuance of Dependent Certificate']");

public WebElement infoIncomeCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoIncomeCertificate));
	  return Driver.findElement(infoIncomeCertificate);
}


public WebElement infoDependentCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDependentCertificate));
	  return Driver.findElement(infoDependentCertificate);
}


public WebElement NonAgriculturist()
{
	wait.until(ExpectedConditions.elementToBeClickable(NonAgriculturist));
	  return Driver.findElement(NonAgriculturist);
}


public WebElement infoNonAgriculturist()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoNonAgriculturist));
	  return Driver.findElement(infoNonAgriculturist);
}

public WebElement infoPropertyCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPropertyCertificate));
	  return Driver.findElement(infoPropertyCertificate);
}


public WebElement SecDependentCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(SecDependentCertificate));
	  return Driver.findElement(SecDependentCertificate);
}
public WebElement DivorceCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(DivorceCertificate));
	  return Driver.findElement(DivorceCertificate);
}


public WebElement FamilyIncome()
{
	wait.until(ExpectedConditions.elementToBeClickable(FamilyIncome));
	  return Driver.findElement(FamilyIncome);
}
public WebElement ServiceHeading()
{
	wait.until(ExpectedConditions.elementToBeClickable(ServiceHeading));
	  return Driver.findElement(ServiceHeading);
}
public WebElement IncomeDependencyCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(IncomeDependencyCertificate));
	  return Driver.findElement(IncomeDependencyCertificate);
}


public WebElement CharacterCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(CharacterCertificate));
	  return Driver.findElement(CharacterCertificate);
}


public WebElement CertificateofUnemployment()
{
	wait.until(ExpectedConditions.elementToBeClickable(CertificateofUnemployment));
	  return Driver.findElement(CertificateofUnemployment);
}

public WebElement LegalHeirCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(LegalHeirCertificate));
	  return Driver.findElement(LegalHeirCertificate);
}

public WebElement CategoryCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(CategoryCertificate));
	  return Driver.findElement(CategoryCertificate);
}

public WebElement ScheduledCaste()
{
	wait.until(ExpectedConditions.elementToBeClickable(ScheduledCaste));
	  return Driver.findElement(ScheduledCaste);
}

public WebElement AssetsCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(AssetsCertificate));
	  return Driver.findElement(AssetsCertificate);
}

public WebElement IncomeCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(IncomeCertificate));
	  return Driver.findElement(IncomeCertificate);
}

public WebElement Socially()
{
	wait.until(ExpectedConditions.elementToBeClickable(Socially));
	  return Driver.findElement(Socially);
}

public WebElement BackwardClasses()
{
	wait.until(ExpectedConditions.elementToBeClickable(BackwardClasses));
	  return Driver.findElement(BackwardClasses);
}

public WebElement MarriageCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(MarriageCertificate));
	  return Driver.findElement(MarriageCertificate);
}
public WebElement PropertyCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(PropertyCertificate));
	  return Driver.findElement(PropertyCertificate);
}
public WebElement DependentCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(DependentCertificate));
	  return Driver.findElement(DependentCertificate);
}
}
