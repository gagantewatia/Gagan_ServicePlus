package Pageobject.SPSainikArdhSainikWelfareDepartment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SainikArdhSainikWelfareDepartment {
public WebDriver Driver;
WebDriverWait wait;
	
	

public SainikArdhSainikWelfareDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}


By Marriage =By.xpath("//h4[normalize-space()='Financial Assistance to The Ex Servicemen For Marriage Grant']");


By Additional =By.xpath("//h4[normalize-space()='Additional Pension']");


By WWIIVeteran =By.xpath("//h4[normalize-space()='Financial Assistance to WWII Veteran and Widow WWII Veteran']");


By Orphan =By.xpath("//h4[normalize-space()='Financial Assistance of Orphan Children of Ex Servicemen']");


By WidowExServicemen =By.xpath("//h4[normalize-space()='Financial Assistance to Ex Servicemen and Widows of Ex Servicemen of and Above the age of 60']");


By WidowsDefenceForces =By.xpath("//h4[normalize-space()='Financial Assistance to War Widows of Defence Forces']");


By ParaTetraPlegic =By.xpath("//h4[normalize-space()='Financial Assistance to Para Tetra Plegic Ex Servicemen']");


By Disabled =By.xpath("//h4[normalize-space()='Financial Assistance to Disabled Ex Serviceman']");


By blind =By.xpath("//h4[normalize-space()='Financial Assistance to blind Ex Servicemen']");


By DefenceForces =By.xpath("//h4[normalize-space()='Disabled Ex Gratia Grant of Defence Forces According to the percentage of Disability']");


By ParaMilitary =By.xpath("//h4[normalize-space()='Disabled Ex Gratia Grant of Para Military Forces According to the percentage of Disability']");
// Info service 

By infoMarriage =By.xpath("//h4[normalize-space()='Financial Assistance to The Ex Servicemen For Marriage Grant']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoAdditional =By.xpath("//h4[normalize-space()='Additional Pension']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoWWIIVeteran =By.xpath("//h4[normalize-space()='Financial Assistance to WWII Veteran and Widow WWII Veteran']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoOrphan =By.xpath("//h4[normalize-space()='Financial Assistance of Orphan Children of Ex Servicemen']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoWidowExServicemen =By.xpath("//h4[normalize-space()='Financial Assistance to Ex Servicemen and Widows of Ex Servicemen of and Above the age of 60']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoWidowsDefenceForces =By.xpath("//h4[normalize-space()='Financial Assistance to War Widows of Defence Forces']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoParaTetraPlegic =By.xpath("//h4[normalize-space()='Financial Assistance to Para Tetra Plegic Ex Servicemen']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoDisabled =By.xpath("//h4[normalize-space()='Financial Assistance to Disabled Ex Serviceman']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoblind =By.xpath("//h4[normalize-space()='Financial Assistance to blind Ex Servicemen']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoDefenceForces =By.xpath("//h4[normalize-space()='Disabled Ex Gratia Grant of Defence Forces According to the percentage of Disability']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoParaMilitary =By.xpath("//h4[normalize-space()='Disabled Ex Gratia Grant of Para Military Forces According to the percentage of Disability']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoMarriage()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMarriage));
	  return Driver.findElement(infoMarriage);
}

public WebElement infoAdditional()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAdditional));
	  return Driver.findElement(Additional);
}
public WebElement infoWWIIVeteran()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoWWIIVeteran));
	  return Driver.findElement(infoWWIIVeteran);
}


public WebElement infoParaTetraPlegic()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoParaTetraPlegic));
	  return Driver.findElement(infoParaTetraPlegic);
}
public WebElement infoWidowsDefenceForces()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoWidowsDefenceForces));
	  return Driver.findElement(infoWidowsDefenceForces);
}

public WebElement infoWidowExServicemen()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoWidowExServicemen));
	  return Driver.findElement(infoWidowExServicemen);
}
public WebElement infoOrphan()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoOrphan));
	  return Driver.findElement(infoOrphan);
}


public WebElement infoParaMilitary()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoParaMilitary));
	  return Driver.findElement(infoParaMilitary);
}
public WebElement infoDefenceForces()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDefenceForces));
	  return Driver.findElement(infoDefenceForces);
}

public WebElement infoblind()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoblind));
	  return Driver.findElement(infoblind);
}
public WebElement infoDisabled()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDisabled));
	  return Driver.findElement(infoDisabled);
}

public WebElement Marriage()
{
	wait.until(ExpectedConditions.elementToBeClickable(Marriage));
	  return Driver.findElement(Marriage);
}

public WebElement Additional()
{
	wait.until(ExpectedConditions.elementToBeClickable(Additional));
	  return Driver.findElement(Additional);
}
public WebElement WWIIVeteran()
{
	wait.until(ExpectedConditions.elementToBeClickable(WWIIVeteran));
	  return Driver.findElement(WWIIVeteran);
}


public WebElement ParaTetraPlegic()
{
	wait.until(ExpectedConditions.elementToBeClickable(ParaTetraPlegic));
	  return Driver.findElement(ParaTetraPlegic);
}
public WebElement WidowsDefenceForces()
{
	wait.until(ExpectedConditions.elementToBeClickable(WidowsDefenceForces));
	  return Driver.findElement(WidowsDefenceForces);
}

public WebElement WidowExServicemen()
{
	wait.until(ExpectedConditions.elementToBeClickable(WidowExServicemen));
	  return Driver.findElement(WidowExServicemen);
}
public WebElement Orphan()
{
	wait.until(ExpectedConditions.elementToBeClickable(Orphan));
	  return Driver.findElement(Orphan);
}


public WebElement ParaMilitary()
{
	wait.until(ExpectedConditions.elementToBeClickable(ParaMilitary));
	  return Driver.findElement(ParaMilitary);
}
public WebElement DefenceForces()
{
	wait.until(ExpectedConditions.elementToBeClickable(DefenceForces));
	  return Driver.findElement(DefenceForces);
}

public WebElement blind()
{
	wait.until(ExpectedConditions.elementToBeClickable(blind));
	  return Driver.findElement(blind);
}
public WebElement Disabled()
{
	wait.until(ExpectedConditions.elementToBeClickable(Disabled));
	  return Driver.findElement(Disabled);
}

}
