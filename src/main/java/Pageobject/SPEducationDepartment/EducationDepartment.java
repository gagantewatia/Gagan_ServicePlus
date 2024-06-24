package Pageobject.SPEducationDepartment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EducationDepartment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public EducationDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Registration of Elementary Schools under Right to Education-EoDB
By ElementarySchools =By.xpath("//h4[normalize-space()='Registration of Elementary Schools under Right to Education-EoDB']");
//NoC for Setting up CBSE School - EoDB
By CBSESchool =By.xpath("//h4[normalize-space()='NoC for Setting up CBSE School - EoDB']");
//Registration of Pre-primary / Play School - EoDB
By PlaySchool =By.xpath("//h4[normalize-space()='Registration of Pre-primary / Play School - EoDB']");
//info service 

//Registration of Elementary Schools under Right to Education-EoDB
By infoElementarySchools =By.xpath("//h4[normalize-space()='Registration of Elementary Schools under Right to Education-EoDB']//following::img[@src='./assets/images/infoIcon.png'][1]");
//NoC for Setting up CBSE School - EoDB
By infoCBSESchool =By.xpath("//h4[normalize-space()='NoC for Setting up CBSE School - EoDB']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Registration of Pre-primary / Play School - EoDB
By infoPlaySchool =By.xpath("//h4[normalize-space()='Registration of Pre-primary / Play School - EoDB']//following::img[@src='./assets/images/infoIcon.png'][1]");



public WebElement infoElementarySchools()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoElementarySchools));
	  return Driver.findElement(infoElementarySchools);
}
public WebElement infoCBSESchool()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCBSESchool));
	  return Driver.findElement(infoCBSESchool);
}
public WebElement infoPlaySchool()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPlaySchool));
	  return Driver.findElement(infoPlaySchool);
}

public WebElement ElementarySchools()
{
	wait.until(ExpectedConditions.elementToBeClickable(ElementarySchools));
	  return Driver.findElement(ElementarySchools);
}
public WebElement CBSESchool()
{
	wait.until(ExpectedConditions.elementToBeClickable(CBSESchool));
	  return Driver.findElement(CBSESchool);
}
public WebElement PlaySchool()
{
	wait.until(ExpectedConditions.elementToBeClickable(PlaySchool));
	  return Driver.findElement(PlaySchool);
}
}
