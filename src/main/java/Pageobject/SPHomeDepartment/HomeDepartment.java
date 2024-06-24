package Pageobject.SPHomeDepartment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeDepartment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public HomeDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Renewal of Fire Safety Certificate
By SafetyCertificate =By.xpath("//h4[normalize-space()='Renewal of Fire Safety Certificate']");

//Renewal of Fire Safety Certificate based on Self Certification
By SelfCertification=By.xpath("//h4[normalize-space()='Renewal of Fire Safety Certificate based on Self Certification']");

//Fire Safety Certificate based on Self Certification
By fireSafetyCertificate =By.xpath("//h4[normalize-space()='Fire Safety Certificate based on Self Certification']");

//Fire Safety Recommendation
By FireSafetyRecommendation=By.xpath("//h4[normalize-space()='Fire Safety Recommendation']");

//Fire Safety Certificate NOC
By CertificateNOC=By.xpath("//h4[normalize-space()='Fire Safety Certificate NOC']");



//Renewal of Fire Safety Certificate
By infoSafetyCertificate =By.xpath("//h4[normalize-space()='Renewal of Fire Safety Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Renewal of Fire Safety Certificate based on Self Certification
By infoSelfCertification=By.xpath("//h4[normalize-space()='Renewal of Fire Safety Certificate based on Self Certification']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Fire Safety Recommendation
By infoFireSafetyRecommendation=By.xpath("//h4[normalize-space()='Fire Safety Recommendation']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoFireSafetyRecommendation()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFireSafetyRecommendation));
	  return Driver.findElement(infoFireSafetyRecommendation);
}


public WebElement infoSafetyCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSafetyCertificate));
	  return Driver.findElement(infoSafetyCertificate);
}
public WebElement infoSelfCertification()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSelfCertification));
	  return Driver.findElement(infoSelfCertification);
}

public WebElement CertificateNOC()
{
	wait.until(ExpectedConditions.elementToBeClickable(CertificateNOC));
	  return Driver.findElement(CertificateNOC);
}
public WebElement FireSafetyRecommendation()
{
	wait.until(ExpectedConditions.elementToBeClickable(FireSafetyRecommendation));
	  return Driver.findElement(FireSafetyRecommendation);
}
public WebElement fireSafetyCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(fireSafetyCertificate));
	  return Driver.findElement(fireSafetyCertificate);
}

public WebElement SafetyCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(SafetyCertificate));
	  return Driver.findElement(SafetyCertificate);
}
public WebElement SelfCertification()
{
	wait.until(ExpectedConditions.elementToBeClickable(SelfCertification));
	  return Driver.findElement(SelfCertification);
}


}
