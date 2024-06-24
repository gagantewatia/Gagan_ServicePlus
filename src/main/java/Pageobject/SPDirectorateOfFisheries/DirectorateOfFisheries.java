package Pageobject.SPDirectorateOfFisheries;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DirectorateOfFisheries{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DirectorateOfFisheries(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Registration for Transport of Fish and Fishery Products from Islands
By ProductsfromIslands =By.xpath("//h4[normalize-space()='Registration for Transport of Fish and Fishery Products from Islands']");

//Registration For Transport of Fish and Fishery Products from Mainland
By ProductsfromMainland = By.xpath("//h4[normalize-space()='Registration For Transport of Fish and Fishery Products from Mainland']");

By HeadingProductsfromMainland = By.xpath("//strong[normalize-space()='Directorate of Fisheries']");

//Subsidy for constructions/purchase of New Mechanized / Motorized Fishing Boat
By  FishingBoat=By.xpath("//h4[normalize-space()='Subsidy for constructions/purchase of New Mechanized / Motorized Fishing Boat']");

//Subsidy for Supply of Fishing Inputs EFR
By FishingInputs=By.xpath("//h4[normalize-space()='Subsidy for Supply of Fishing Inputs EFR']");

By HeadingFishingInputs=By.xpath("//h4[normalize-space()='Apply For The Office/Sub-Station Location']");

//Providing Compensation towards loss of Fishing implements due to Natural Calamity
By  NaturalCalamity=By.xpath("//h4[normalize-space()='Providing Compensation towards loss of Fishing implements due to Natural Calamity']");

By  HeadingNaturalCalamity=By.xpath("//h4[normalize-space()='Apply For The Office']");

//Financial Assistance for Purchase of Life Saving, Fire Fighting, Navigational ,Communication Equipment
By FinancialAssistance=By.xpath("//h4[normalize-space()='Financial Assistance for Purchase of Life Saving, Fire Fighting, Navigational ,Communication Equipment']");


//info services

//Registration for Transport of Fish and Fishery Products from Islands
By infoProductsfromIslands =By.xpath("//h4[normalize-space()='Registration for Transport of Fish and Fishery Products from Islands']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Registration For Transport of Fish and Fishery Products from Mainland
By infoProductsfromMainland = By.xpath("//h4[normalize-space()='Registration For Transport of Fish and Fishery Products from Mainland']//following::img[@src='./assets/images/infoIcon.png'][1]");

By infoHeadingProductsfromMainland = By.xpath("//strong[normalize-space()='Directorate of Fisheries']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Subsidy for constructions/purchase of New Mechanized / Motorized Fishing Boat
By  infoFishingBoat=By.xpath("//h4[normalize-space()='Subsidy for constructions/purchase of New Mechanized / Motorized Fishing Boat']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Subsidy for Supply of Fishing Inputs EFR
By infoFishingInputs=By.xpath("//h4[normalize-space()='Subsidy for Supply of Fishing Inputs EFR']//following::img[@src='./assets/images/infoIcon.png'][1]");

By infoHeadingFishingInputs=By.xpath("//h4[normalize-space()='Apply For The Office/Sub-Station Location']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Providing Compensation towards loss of Fishing implements due to Natural Calamity
By  infoNaturalCalamity=By.xpath("//h4[normalize-space()='Providing Compensation towards loss of Fishing implements due to Natural Calamity']//following::img[@src='./assets/images/infoIcon.png'][1]");

By  infoHeadingNaturalCalamity=By.xpath("//h4[normalize-space()='Apply For The Office']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Financial Assistance for Purchase of Life Saving, Fire Fighting, Navigational ,Communication Equipment
By infoFinancialAssistance=By.xpath("//h4[normalize-space()='Financial Assistance for Purchase of Life Saving, Fire Fighting, Navigational ,Communication Equipment']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoProductsfromIslands()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoProductsfromIslands));
	  return Driver.findElement(infoProductsfromIslands);
}
public WebElement infoProductsfromMainland()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoProductsfromMainland));
	  return Driver.findElement(infoProductsfromMainland);
}
public WebElement infoFishingBoat()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFishingBoat));
	  return Driver.findElement(infoFishingBoat);
}
public WebElement infoHeadingProductsfromMainland()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoHeadingProductsfromMainland));
	  return Driver.findElement(infoHeadingProductsfromMainland);
}
public WebElement infoFishingInputs()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFishingInputs));
	  return Driver.findElement(infoFishingInputs);
}
public WebElement infoHeadingFishingInputs()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoHeadingFishingInputs));
	  return Driver.findElement(infoHeadingFishingInputs);
}

public WebElement infoNaturalCalamity()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoNaturalCalamity));
	  return Driver.findElement(infoNaturalCalamity);
}
public WebElement infoHeadingNaturalCalamity()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoHeadingNaturalCalamity));
	  return Driver.findElement(infoHeadingNaturalCalamity);
}
public WebElement infoFinancialAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFinancialAssistance));
	  return Driver.findElement(infoFinancialAssistance);
}


public WebElement ProductsfromIslands()
{
	wait.until(ExpectedConditions.elementToBeClickable(ProductsfromIslands));
	  return Driver.findElement(ProductsfromIslands);
}
public WebElement ProductsfromMainland()
{
	wait.until(ExpectedConditions.elementToBeClickable(ProductsfromMainland));
	  return Driver.findElement(ProductsfromMainland);
}
public WebElement FishingBoat()
{
	wait.until(ExpectedConditions.elementToBeClickable(FishingBoat));
	  return Driver.findElement(FishingBoat);
}
public WebElement HeadingProductsfromMainland()
{
	wait.until(ExpectedConditions.elementToBeClickable(HeadingProductsfromMainland));
	  return Driver.findElement(HeadingProductsfromMainland);
}
public WebElement FishingInputs()
{
	wait.until(ExpectedConditions.elementToBeClickable(FishingInputs));
	  return Driver.findElement(FishingInputs);
}
public WebElement HeadingFishingInputs()
{
	wait.until(ExpectedConditions.elementToBeClickable(HeadingFishingInputs));
	  return Driver.findElement(HeadingFishingInputs);
}

public WebElement NaturalCalamity()
{
	wait.until(ExpectedConditions.elementToBeClickable(NaturalCalamity));
	  return Driver.findElement(NaturalCalamity);
}
public WebElement HeadingNaturalCalamity()
{
	wait.until(ExpectedConditions.elementToBeClickable(HeadingNaturalCalamity));
	  return Driver.findElement(HeadingNaturalCalamity);
}
public WebElement FinancialAssistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(FinancialAssistance));
	  return Driver.findElement(FinancialAssistance);
}

}
