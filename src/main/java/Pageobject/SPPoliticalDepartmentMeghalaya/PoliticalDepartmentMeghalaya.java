package Pageobject.SPPoliticalDepartmentMeghalaya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PoliticalDepartmentMeghalaya{
public WebDriver Driver;
WebDriverWait wait;
	
	

public PoliticalDepartmentMeghalaya(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Application for Permission for Holding Public Events
By HoldingPublic =By.xpath("//h4[normalize-space()='Application for Permission for Holding Public Events']");


//Income Certificate
By Income=By.xpath("//h4[normalize-space()='Income Certificate']");


//Seeinfo
//Application for Permission for Holding Public Events
By  infoHoldingPublic=By.xpath("//h4[normalize-space()='Application for Permission for Holding Public Events']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Income Certificate
By infoIncome=By.xpath("//h4[normalize-space()='Income Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoHoldingPublic()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoHoldingPublic));
	  return Driver.findElement(infoHoldingPublic);
}
public WebElement infoIncome()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoIncome));
	  return Driver.findElement(infoIncome);
}

public WebElement HoldingPublic()
{
	wait.until(ExpectedConditions.elementToBeClickable(HoldingPublic));
	  return Driver.findElement(HoldingPublic);
}

public WebElement Income()
{
	wait.until(ExpectedConditions.elementToBeClickable(Income));
	  return Driver.findElement(Income);
}

}
