package Pageobject.SPDepartmentofForestTripura;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepartmentofForestTripura{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepartmentofForestTripura(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Extraction Permit of Trees
By ExtractionPermitofTrees =By.xpath("//h4[normalize-space()='Extraction Permit of Trees']");

By infoExtractionPermitofTrees =By.xpath("//h4[normalize-space()='Extraction Permit of Trees']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoExtractionPermitofTrees()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoExtractionPermitofTrees));
	  return Driver.findElement(infoExtractionPermitofTrees);
}

public WebElement ExtractionPermitofTrees()
{
	wait.until(ExpectedConditions.elementToBeClickable(ExtractionPermitofTrees));
	  return Driver.findElement(ExtractionPermitofTrees);
}
}
