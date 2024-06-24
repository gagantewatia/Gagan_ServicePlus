package Pageobject.SPDepartmentofUrbanLocalBodies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepartmentofUrbanLocalBodies{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepartmentofUrbanLocalBodies(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}

By Deed =By.xpath("//h4[normalize-space()='Issue of Conveyance Deed in Municipal Corporation, Municipal Councils and Municipal Committees']");


By Bakery =By.xpath("//h4[normalize-space()='License for Bakery']");


By Tent =By.xpath("//h4[normalize-space()='License for Tent Owners']");


By Temporary =By.xpath("//h4[normalize-space()='Permission for Installation of Temporary Structure']");


By Flour =By.xpath("//h4[normalize-space()='License to Run Flour Mill']");


By Carts =By.xpath("//h4[normalize-space()='License for Plying Carts and Rehris']");


By Meat =By.xpath("//h4[normalize-space()='License for Sale of Meat']");


By Community =By.xpath("//h4[normalize-space()='Booking of Community Center']");


By Documents =By.xpath("//h4[normalize-space()='Request for Copy of Documents']");


By ImportofMeat =By.xpath("//h4[normalize-space()='License for Import of Meat']");


By Aerated =By.xpath("//h4[normalize-space()='License for Aerated Water, Ice and Ice Cream Factory']");


By Dhobis =By.xpath("//h4[normalize-space()='License for Dhobis for using Municipal Dhobi Ghats']");


By Sewer =By.xpath("//h4[normalize-space()='Apply for Disconnection of Water/Sewer Connection in Urban Local Bodies']");


By Dog =By.xpath("//h4[normalize-space()='Registration of Dog']");
		

//info service 

By infoDeed =By.xpath("//h4[normalize-space()='Issue of Conveyance Deed in Municipal Corporation, Municipal Councils and Municipal Committees']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoBakery =By.xpath("//h4[normalize-space()='License for Bakery']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoTent =By.xpath("//h4[normalize-space()='License for Tent Owners']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoTemporary =By.xpath("//h4[normalize-space()='Permission for Installation of Temporary Structure']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoFlour =By.xpath("//h4[normalize-space()='License to Run Flour Mill']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoCarts =By.xpath("//h4[normalize-space()='License for Plying Carts and Rehris']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoMeat =By.xpath("//h4[normalize-space()='License for Sale of Meat']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoCommunity =By.xpath("//h4[normalize-space()='Booking of Community Center']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoDocuments =By.xpath("//h4[normalize-space()='Request for Copy of Documents']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoImportofMeat =By.xpath("//h4[normalize-space()='License for Import of Meat']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoAerated =By.xpath("//h4[normalize-space()='License for Aerated Water, Ice and Ice Cream Factory']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoDhobis =By.xpath("//h4[normalize-space()='License for Dhobis for using Municipal Dhobi Ghats']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoSewer =By.xpath("//h4[normalize-space()='Apply for Disconnection of Water/Sewer Connection in Urban Local Bodies']//following::img[@src='./assets/images/infoIcon.png'][1]");


By infoDog =By.xpath("//h4[normalize-space()='Registration of Dog']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoDog()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDog));
	  return Driver.findElement(infoDog);
}
public WebElement Sewer()
{
	wait.until(ExpectedConditions.elementToBeClickable(Sewer));
	  return Driver.findElement(Sewer);
}

public WebElement infoSewer()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSewer));
	  return Driver.findElement(infoSewer);
}
public WebElement infoDhobis()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDhobis));
	  return Driver.findElement(infoDhobis);
}
public WebElement infoAerated()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAerated));
	  return Driver.findElement(infoAerated);
}
public WebElement infoImportofMeat()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoImportofMeat));
	  return Driver.findElement(infoImportofMeat);
}
public WebElement infoDocuments()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDocuments));
	  return Driver.findElement(infoDocuments);
}

public WebElement infoCommunity()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCommunity));
	  return Driver.findElement(infoCommunity);
}
public WebElement infoMeat()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMeat));
	  return Driver.findElement(infoMeat);
}

public WebElement infoCarts()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCarts));
	  return Driver.findElement(infoCarts);
}
public WebElement infoFlour()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFlour));
	  return Driver.findElement(infoFlour);
}

public WebElement infoTemporary()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoTemporary));
	  return Driver.findElement(infoTemporary);
}
public WebElement infoTent()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoTent));
	  return Driver.findElement(infoTent);
}

public WebElement infoBakery()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoBakery));
	  return Driver.findElement(infoBakery);
}

public WebElement infoDeed()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDeed));
	  return Driver.findElement(infoDeed);
}

public WebElement Dog()
{
	wait.until(ExpectedConditions.elementToBeClickable(Dog));
	  return Driver.findElement(Dog);
}

public WebElement Dhobis()
{
	wait.until(ExpectedConditions.elementToBeClickable(Dhobis));
	  return Driver.findElement(Dhobis);
}
public WebElement Aerated()
{
	wait.until(ExpectedConditions.elementToBeClickable(Aerated));
	  return Driver.findElement(Aerated);
}
public WebElement ImportofMeat()
{
	wait.until(ExpectedConditions.elementToBeClickable(ImportofMeat));
	  return Driver.findElement(ImportofMeat);
}
public WebElement Documents()
{
	wait.until(ExpectedConditions.elementToBeClickable(Documents));
	  return Driver.findElement(Documents);
}

public WebElement Community()
{
	wait.until(ExpectedConditions.elementToBeClickable(Community));
	  return Driver.findElement(Community);
}
public WebElement Meat()
{
	wait.until(ExpectedConditions.elementToBeClickable(Meat));
	  return Driver.findElement(Meat);
}

public WebElement Carts()
{
	wait.until(ExpectedConditions.elementToBeClickable(Carts));
	  return Driver.findElement(Carts);
}
public WebElement Flour()
{
	wait.until(ExpectedConditions.elementToBeClickable(Flour));
	  return Driver.findElement(Flour);
}

public WebElement Temporary()
{
	wait.until(ExpectedConditions.elementToBeClickable(Temporary));
	  return Driver.findElement(Temporary);
}
public WebElement Tent()
{
	wait.until(ExpectedConditions.elementToBeClickable(Tent));
	  return Driver.findElement(Tent);
}

public WebElement Bakery()
{
	wait.until(ExpectedConditions.elementToBeClickable(Bakery));
	  return Driver.findElement(Bakery);
}

public WebElement Deed()
{
	wait.until(ExpectedConditions.elementToBeClickable(Deed));
	  return Driver.findElement(Deed);
}

}
