package Pageobject.SPFisheriesDepartment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FisheriesDepartment {
public WebDriver Driver;
WebDriverWait wait;
	
	

public FisheriesDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Application for subsidiy for Welfare of Scheduled Caste Families in Fisheries Sector
By FamiliesinFisheries =By.xpath("//h4[normalize-space()='Application for subsidiy for Welfare of Scheduled Caste Families in Fisheries Sector']");

//Application for subsidy for Scheme for the Intensive Fisheries Development Programme in Fisheries Sector
By IntensiveFisheries=By.xpath("//h4[normalize-space()='Application for subsidy for Scheme for the Intensive Fisheries Development Programme in Fisheries Sector']");

//Application for subsidiy for Welfare of Scheduled Caste Families in Fisheries Sector
By infoFamiliesinFisheries =By.xpath("//h4[normalize-space()='Application for subsidiy for Welfare of Scheduled Caste Families in Fisheries Sector']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for subsidy for Scheme for the Intensive Fisheries Development Programme in Fisheries Sector
By infoIntensiveFisheries=By.xpath("//h4[normalize-space()='Application for subsidy for Scheme for the Intensive Fisheries Development Programme in Fisheries Sector']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoFamiliesinFisheries()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFamiliesinFisheries));
	  return Driver.findElement(infoFamiliesinFisheries);
}
public WebElement infoIntensiveFisheries()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoIntensiveFisheries));
	  return Driver.findElement(infoIntensiveFisheries);
}

public WebElement FamiliesinFisheries()
{
	wait.until(ExpectedConditions.elementToBeClickable(FamiliesinFisheries));
	  return Driver.findElement(FamiliesinFisheries);
}
public WebElement IntensiveFisheries()
{
	wait.until(ExpectedConditions.elementToBeClickable(IntensiveFisheries));
	  return Driver.findElement(IntensiveFisheries);
}

}
