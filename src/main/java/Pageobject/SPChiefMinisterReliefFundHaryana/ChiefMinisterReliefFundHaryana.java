package Pageobject.SPChiefMinisterReliefFundHaryana;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChiefMinisterReliefFundHaryana{
public WebDriver Driver;
WebDriverWait wait;
	
	

public ChiefMinisterReliefFundHaryana(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Application for Financial Assistance from Haryana Chief Ministers Relief Fund/ हरियाणा मुख्यमंत्री राहत कोष से आर्थिक सहायता के
By ChiefMinisters =By.xpath("//h4[normalize-space()='Application for Financial Assistance from Haryana Chief Ministers Relief Fund/ हरियाणा मुख्यमंत्री राहत कोष से आर्थिक सहायता के']");

public WebElement ChiefMinisters()
{
	wait.until(ExpectedConditions.elementToBeClickable(ChiefMinisters));
	  return Driver.findElement(ChiefMinisters);
}
}
