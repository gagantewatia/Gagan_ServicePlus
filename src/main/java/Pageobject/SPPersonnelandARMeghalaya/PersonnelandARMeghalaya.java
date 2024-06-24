package Pageobject.SPPersonnelandARMeghalaya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonnelandARMeghalaya{
public WebDriver Driver;
WebDriverWait wait;
	
	

public PersonnelandARMeghalaya(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Return of Assests and Liabilities under Meghalaya Public Service Rules 2016
By MeghalayaPublic =By.xpath("//h4[normalize-space()='Return of Assests and Liabilities under Meghalaya Public Service Rules 2016");

By infoMeghalayaPublic=By.xpath("//h4[normalize-space()='Return of Assests and Liabilities under Meghalaya Public Service Rules 2016']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoMeghalayaPublic()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoMeghalayaPublic));
	  return Driver.findElement(infoMeghalayaPublic);
}
public WebElement MeghalayaPublic()
{

	 wait.until(ExpectedConditions.elementToBeClickable(MeghalayaPublic));
	  return Driver.findElement(MeghalayaPublic);
}

}
