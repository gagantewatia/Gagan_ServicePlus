package Pageobject.SPDepOfEmpowerment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepOfEmpowerment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepOfEmpowerment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Scheme of Assistance to Disabled Persons for Purchase/Fitting of Aids/Appliances ADIP SCHEME
By Disabled =By.xpath("//h4[normalize-space()='Scheme of Assistance to Disabled Persons for Purchase/Fitting of Aids/Appliances ADIP SCHEME']");

//Scheme of Assistance to Disabled Persons for Purchase/Fitting of Aids/Appliances ADIP SCHEME
By infoDisabled =By.xpath("//h4[normalize-space()='Scheme of Assistance to Disabled Persons for Purchase/Fitting of Aids/Appliances ADIP SCHEME']//following::img[@src='./assets/images/infoIcon.png'][1]");


By SecDisabled=By.xpath("//h4[normalize-space()='Scheme of Assistance to Disabled Persons for Purchase/Fitting of Aids/Appliances ADIP SCHEME']");
//By SPpageheading =By.xpath("//div[@class='table_cont header_new']");

public WebElement infoDisabled()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDisabled));
	  return Driver.findElement(infoDisabled);
}

public WebElement Disabled()
{
	wait.until(ExpectedConditions.elementToBeClickable(Disabled));
	  return Driver.findElement(Disabled);
}
public WebElement SecDisabled()
{
	wait.until(ExpectedConditions.elementToBeClickable(SecDisabled));
	  return Driver.findElement(SecDisabled);
}
}
