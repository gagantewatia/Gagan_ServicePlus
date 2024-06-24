package Pageobject.SPRevenueDep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RevenueDep{
public WebDriver Driver;
WebDriverWait wait;
	
	

public RevenueDep(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//OBC Certificate – Central
By Central =By.xpath("//h4[normalize-space()='OBC Certificate – Central']");
//OBC Certificate – State
By State =By.xpath("//h4[normalize-space()='OBC Certificate – State']");
//ST Certificate
By ST =By.xpath("//h4[normalize-space()='ST Certificate']");
//Survival Certificate
By Survival =By.xpath("//h4[normalize-space()='Survival Certificate']");
//SC Certificate
By SC =By.xpath("//h4[normalize-space()='SC Certificate']");
//Income Certificate
By Income  =By.xpath("//h4[normalize-space()='Income Certificate']");
//Food Stuff License
By FoodStuff =By.xpath("//h4[normalize-space()='Food Stuff License']");
//Renewal of Foodstuff License
By Renewal  =By.xpath("//h4[normalize-space()='Renewal of Foodstuff License']");
//Gun License Renewal
By Gun  =By.xpath("//h4[normalize-space()='Gun License Renewal']");

By PHGun  =By.xpath("//span[contains(text(),'Gun License Renewal - Application Form')]");
//Small Savings Agents License MPKBY
By SmallSavings =By.xpath("//h4[normalize-space()='Small Savings Agents License MPKBY']");
//Marriage Certificate
By Marriage  =By.xpath("//h4[normalize-space()='Marriage Certificate']");
//Permanent Resident of Tripura Certificate
By Permanent  =By.xpath("//h4[normalize-space()='Permanent Resident of Tripura Certificate']");
//Distance Certificate
By Distance  =By.xpath("//h4[normalize-space()='Distance Certificate']");
//Renewal of Small Savings Agent License (MPKBY)
By MPKBY  =By.xpath("//h4[normalize-space()='Renewal of Small Savings Agent License (MPKBY)']");



//OBC Certificate – Central
By infoCentral =By.xpath("//h4[normalize-space()='OBC Certificate – Central']//following::img[@src='./assets/images/infoIcon.png'][1]");
//OBC Certificate – State
By infoState =By.xpath("//h4[normalize-space()='OBC Certificate – State']//following::img[@src='./assets/images/infoIcon.png'][1]");
//ST Certificate
By infoST =By.xpath("//h4[normalize-space()='ST Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Survival Certificate
By infoSurvival =By.xpath("//h4[normalize-space()='Survival Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");
//SC Certificate
By infoSC =By.xpath("//h4[normalize-space()='SC Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Gun License Renewal
By infoGun  =By.xpath("//h4[normalize-space()='Gun License Renewal']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Small Savings Agents License MPKBY
By infoSmallSavings =By.xpath("//h4[normalize-space()='Small Savings Agents License MPKBY']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Marriage Certificate
By infoMarriage  =By.xpath("//h4[normalize-space()='Marriage Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Permanent Resident of Tripura Certificate
By infoPermanent  =By.xpath("//h4[normalize-space()='Permanent Resident of Tripura Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Distance Certificate
By infoDistance  =By.xpath("//h4[normalize-space()='Distance Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Renewal of Small Savings Agent License (MPKBY)
By infoMPKBY  =By.xpath("//h4[normalize-space()='Renewal of Small Savings Agent License (MPKBY)']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoGun()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoGun));
	  return Driver.findElement(infoGun);
}

public WebElement infoSmallSavings()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSmallSavings));
	  return Driver.findElement(infoSmallSavings);
}


public WebElement infoMarriage()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMarriage));
	  return Driver.findElement(infoMarriage);
}

public WebElement infoPermanent()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPermanent));
	  return Driver.findElement(infoPermanent);
}
public WebElement infoDistance()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDistance));
	  return Driver.findElement(infoDistance);
}

public WebElement infoCentral()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCentral));
	  return Driver.findElement(infoCentral);
}

public WebElement infoState()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoState));
	  return Driver.findElement(infoState);
}

public WebElement infoST()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoST));
	  return Driver.findElement(infoST);
}
public WebElement infoSurvival()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSurvival));
	  return Driver.findElement(infoSurvival);
}

public WebElement infoSC()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSC));
	  return Driver.findElement(infoSC);
}


public WebElement infoMPKBY()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMPKBY));
	  return Driver.findElement(infoMPKBY);
}


public WebElement MPKBY()
{
	wait.until(ExpectedConditions.elementToBeClickable(MPKBY));
	  return Driver.findElement(MPKBY);
}


public WebElement Central()
{
	wait.until(ExpectedConditions.elementToBeClickable(Central));
	  return Driver.findElement(Central);
}

public WebElement State()
{
	wait.until(ExpectedConditions.elementToBeClickable(State));
	  return Driver.findElement(State);
}

public WebElement ST()
{
	wait.until(ExpectedConditions.elementToBeClickable(ST));
	  return Driver.findElement(ST);
}
public WebElement Survival()
{
	wait.until(ExpectedConditions.elementToBeClickable(Survival));
	  return Driver.findElement(Survival);
}

public WebElement SC()
{
	wait.until(ExpectedConditions.elementToBeClickable(SC));
	  return Driver.findElement(SC);
}

public WebElement Income()
{
	wait.until(ExpectedConditions.elementToBeClickable(Income));
	  return Driver.findElement(Income);
}

public WebElement FoodStuff()
{
	wait.until(ExpectedConditions.elementToBeClickable(FoodStuff));
	  return Driver.findElement(FoodStuff);
}

public WebElement Renewal()
{
	wait.until(ExpectedConditions.elementToBeClickable(Renewal));
	  return Driver.findElement(Renewal);
}



public WebElement Gun()
{
	wait.until(ExpectedConditions.elementToBeClickable(Gun));
	  return Driver.findElement(Gun);
}
public WebElement PHGun()
{
	wait.until(ExpectedConditions.elementToBeClickable(PHGun));
	  return Driver.findElement(PHGun);
}
public WebElement SmallSavings()
{
	wait.until(ExpectedConditions.elementToBeClickable(SmallSavings));
	  return Driver.findElement(SmallSavings);
}


public WebElement Marriage()
{
	wait.until(ExpectedConditions.elementToBeClickable(Marriage));
	  return Driver.findElement(Marriage);
}

public WebElement Permanent()
{
	wait.until(ExpectedConditions.elementToBeClickable(Permanent));
	  return Driver.findElement(Permanent);
}
public WebElement Distance()
{
	wait.until(ExpectedConditions.elementToBeClickable(Distance));
	  return Driver.findElement(Distance);
}

}
