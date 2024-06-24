package Pageobject.SPMinistryOfNewAndRenewableResources;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MinistryOfNewAndRenewableResources{
public WebDriver Driver;
WebDriverWait wait;
	
	

public MinistryOfNewAndRenewableResources(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//MNRE's R&D Scheme
By Scheme =By.xpath("//div[@class='container']//h4[1]");

//MNRE's R&D Scheme
By infoScheme =By.xpath("//div[@class='container']//h4[1]//following::img[@src='./assets/images/infoIcon.png'][1]");



public WebElement infoScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoScheme));
	  return Driver.findElement(infoScheme);
}

public WebElement Scheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(Scheme));
	  return Driver.findElement(Scheme);
}

}
