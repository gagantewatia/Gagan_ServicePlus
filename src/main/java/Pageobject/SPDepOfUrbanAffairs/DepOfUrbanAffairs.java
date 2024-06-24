package Pageobject.SPDepOfUrbanAffairs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepOfUrbanAffairs{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepOfUrbanAffairs(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Payment for Property Tax under Municipal Board
By PropertyTax =By.xpath("//h4[normalize-space()='Payment for Property Tax under Municipal Board']");

//Application form for Cess Pool
By CessPool = By.xpath("//h4[normalize-space()='Application form for Cess Pool']");

//Payment for Property Tax under Municipal Board
By infoPropertyTax =By.xpath("//h4[normalize-space()='Payment for Property Tax under Municipal Board']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application form for Cess Pool
By infoCessPool = By.xpath("//h4[normalize-space()='Application form for Cess Pool']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoPropertyTax()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPropertyTax));
	  return Driver.findElement(infoPropertyTax);
}
public WebElement infoCessPool()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCessPool));
	  return Driver.findElement(infoCessPool);
}

public WebElement PropertyTax()
{
	wait.until(ExpectedConditions.elementToBeClickable(PropertyTax));
	  return Driver.findElement(PropertyTax);
}
public WebElement CessPool()
{
	wait.until(ExpectedConditions.elementToBeClickable(CessPool));
	  return Driver.findElement(CessPool);
}

}
