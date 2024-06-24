package Pageobject.SPFoodCivilSuppliesConsumerAffairsDepartmentSikkim;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FoodCivilSuppliesConsumerAffairsDepartmentSikkim{
public WebDriver Driver;
WebDriverWait wait;
	
	

public FoodCivilSuppliesConsumerAffairsDepartmentSikkim(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Issuance of Manufacturer License from Legal Metrology Unit
By Manufacturer =By.xpath("//h4[normalize-space()='Issuance of Manufacturer License from Legal Metrology Unit']");

//Issuance of Manufacturer License from Legal Metrology Unite
By infoManufacturer =By.xpath("//h4[normalize-space()='Issuance of Manufacturer License from Legal Metrology Unit']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Issuance of Manufacturer License from Legal Metrology Unit
By Dealer =By.xpath("//h4[normalize-space()='Issuance of Dealer License from Legal Metrology Unit']");

//Issuance of Manufacturer License from Legal Metrology Unite
By infoDealer =By.xpath("//h4[normalize-space()='Issuance of Dealer License from Legal Metrology Unit']//following::img[@src='./assets/images/infoIcon.png'][1]");



public WebElement Dealer()
{
	wait.until(ExpectedConditions.elementToBeClickable(Dealer));
	  return Driver.findElement(Dealer);
}


public WebElement infoDealer()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDealer));
	  return Driver.findElement(infoDealer);
}

public WebElement Manufacturer()
{
	wait.until(ExpectedConditions.elementToBeClickable(Manufacturer));
	  return Driver.findElement(Manufacturer);
}


public WebElement infoManufacturer()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoManufacturer));
	  return Driver.findElement(infoManufacturer);
}

}
