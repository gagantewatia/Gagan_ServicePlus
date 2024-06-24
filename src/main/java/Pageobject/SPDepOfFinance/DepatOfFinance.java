package Pageobject.SPDepOfFinance;
import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DepatOfFinance {

public WebDriver Driver;
WebDriverWait wait;

public DepatOfFinance (WebDriver Driver) 
{
	
	this.Driver=Driver;
	wait=new WebDriverWait(Driver, Duration.ofSeconds(20));
}
By Taxclearence=By.xpath("//h4[normalize-space()='Tax Clearance Certificate']");
By Serviceheading=By.xpath("//div[@class='col-xs-12 text-center']");
By infoTaxclearence=By.xpath("//h4[normalize-space()='Tax Clearance Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoTaxclearence()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoTaxclearence));
	  return Driver.findElement(infoTaxclearence);
}
public WebElement Taxclearence()
{

	 wait.until(ExpectedConditions.elementToBeClickable(Taxclearence));
	  return Driver.findElement(Taxclearence);
}


}
