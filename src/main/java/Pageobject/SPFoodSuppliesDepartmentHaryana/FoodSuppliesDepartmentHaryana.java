package Pageobject.SPFoodSuppliesDepartmentHaryana;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FoodSuppliesDepartmentHaryana{
public WebDriver Driver;
WebDriverWait wait;
	
	

public FoodSuppliesDepartmentHaryana(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Issuance of New Above Poverty Line (APL) Ration Card
By PovertyLine =By.xpath("//h4[normalize-space()='Issuance of New Above Poverty Line (APL) Ration Card']");


//Issuance of New Above Poverty Line (APL) Ration Card
By infoPovertyLine =By.xpath("//h4[normalize-space()='Issuance of New Above Poverty Line (APL) Ration Card']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoPovertyLine()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPovertyLine));
	  return Driver.findElement(infoPovertyLine);
}
public WebElement PovertyLine()
{
	wait.until(ExpectedConditions.elementToBeClickable(PovertyLine));
	  return Driver.findElement(PovertyLine);
}
}
