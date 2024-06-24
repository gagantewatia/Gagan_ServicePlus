package Pageobject.SPHealthandFamilyWelfare;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HealthandFamilyWelfare{
public WebDriver Driver;
WebDriverWait wait;
	
	

public HealthandFamilyWelfare(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Licence for Retail and Wholesale Drug licence
By Wholesale =By.xpath("//h4[normalize-space()='Licence for Retail and Wholesale Drug licence']");

//Licence for Retail and Wholesale Drug licence
By infoWholesale =By.xpath("//h4[normalize-space()='Licence for Retail and Wholesale Drug licence']//following::img[@src='./assets/images/infoIcon.png'][1]");



public WebElement infoWholesale()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoWholesale));
	  return Driver.findElement(infoWholesale);
}


public WebElement Wholesale()
{
	wait.until(ExpectedConditions.elementToBeClickable(Wholesale));
	  return Driver.findElement(Wholesale);
}

}
