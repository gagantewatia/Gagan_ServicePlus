package Pageobject.SPHomeDepartmentPoliceMeghalaya;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeDepartmentPoliceMeghalaya{
public WebDriver Driver;
WebDriverWait wait;
	
	

public HomeDepartmentPoliceMeghalaya(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Fire Safety Certificate
By FireSafety =By.xpath("//h4[normalize-space()='Fire Safety Certificate']");

//Fire Safety Certificate
By infoFireSafety =By.xpath("//h4[normalize-space()='Fire Safety Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Provisional Fire Safety Certificate
By ProvisionalFireSafety =By.xpath("//h4[normalize-space()='Provisional Fire Safety Certificate']");

//Provisional Fire Safety Certificate
By infoProvisionalFireSafety =By.xpath("//h4[normalize-space()='Provisional Fire Safety Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");



public WebElement infoProvisionalFireSafety()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoProvisionalFireSafety));
	  return Driver.findElement(infoProvisionalFireSafety);
}


public WebElement ProvisionalFireSafety()
{
	wait.until(ExpectedConditions.elementToBeClickable(ProvisionalFireSafety));
	  return Driver.findElement(ProvisionalFireSafety);
}


public WebElement infoFireSafety()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFireSafety));
	  return Driver.findElement(infoFireSafety);
}


public WebElement FireSafety()
{
	wait.until(ExpectedConditions.elementToBeClickable(FireSafety));
	  return Driver.findElement(FireSafety);
}

}
