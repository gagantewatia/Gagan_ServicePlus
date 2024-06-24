package Pageobject.SPPublicWorksDepartment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PublicWorksDepartment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public PublicWorksDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Registration of Contractors Class I to IV for Works & Services - EoDB
By ClassItoIVforWorks =By.xpath("//h4[normalize-space()='Registration of Contractors Class I to IV for Works & Services - EoDB']");

//Assistance to farmers under High Yielding Programme
By ClassVforWorks = By.xpath("//h4[normalize-space()='Registration of Contractors Class V for Works & Services - EoDB']");

//Development of Minor Irrigation
By  ClassVforWorksand=By.xpath("//h4[normalize-space()='Registration of Contractors Class V for Works and Services - EoDB']");

//Registration of Contractors Class I to IV for Works & Services - EoDB
By infoClassItoIVforWorks =By.xpath("//h4[normalize-space()='Registration of Contractors Class I to IV for Works & Services - EoDB']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Assistance to farmers under High Yielding Programme
By infoClassVforWorks = By.xpath("//h4[normalize-space()='Registration of Contractors Class V for Works & Services - EoDB']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Development of Minor Irrigation
By  infoClassVforWorksand=By.xpath("//h4[normalize-space()='Registration of Contractors Class V for Works and Services - EoDB']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoClassItoIVforWorks()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoClassItoIVforWorks));
	  return Driver.findElement(infoClassItoIVforWorks);
}
public WebElement infoClassVforWorks()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoClassVforWorks));
	  return Driver.findElement(infoClassVforWorks);
}
public WebElement infoClassVforWorksand()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoClassVforWorksand));
	  return Driver.findElement(infoClassVforWorksand);
}

public WebElement ClassItoIVforWorks()
{
	wait.until(ExpectedConditions.elementToBeClickable(ClassItoIVforWorks));
	  return Driver.findElement(ClassItoIVforWorks);
}
public WebElement ClassVforWorks()
{
	wait.until(ExpectedConditions.elementToBeClickable(ClassVforWorks));
	  return Driver.findElement(ClassVforWorks);
}
public WebElement ClassVforWorksand()
{
	wait.until(ExpectedConditions.elementToBeClickable(ClassVforWorksand));
	  return Driver.findElement(ClassVforWorksand);
}

}
