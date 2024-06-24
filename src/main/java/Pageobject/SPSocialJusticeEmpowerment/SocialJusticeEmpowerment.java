package Pageobject.SPSocialJusticeEmpowerment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SocialJusticeEmpowerment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public SocialJusticeEmpowerment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//FINANCIAL AID TO NON SCHOOL GOING DISABLED CHILDREN UPTO 18 YEARS
By DISABLEDCHILDREN =By.xpath("//h4[normalize-space()='FINANCIAL AID TO NON SCHOOL GOING DISABLED CHILDREN UPTO 18 YEARS']");
//Financial Assistance to Destitute Children
By DestituteChildren =By.xpath("//h4[normalize-space()='Financial Assistance to Destitute Children']");
//Ladli Social Security Allowance
By SocialSecurity =By.xpath("//h4[normalize-space()='Ladli Social Security Allowance']");




public WebElement DISABLEDCHILDREN()
{
	wait.until(ExpectedConditions.elementToBeClickable(DISABLEDCHILDREN));
	  return Driver.findElement(DISABLEDCHILDREN);
}
public WebElement DestituteChildren()
{
	wait.until(ExpectedConditions.elementToBeClickable(DestituteChildren));
	  return Driver.findElement(DestituteChildren);
}
public WebElement SocialSecurity()
{
	wait.until(ExpectedConditions.elementToBeClickable(SocialSecurity));
	  return Driver.findElement(SocialSecurity);
}
}
