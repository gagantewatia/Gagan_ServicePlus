package Pageobject.SPDirectorateOfIndustries;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DirectorateOfIndustries{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DirectorateOfIndustries(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Entrepreneurship Development and Skill up-gradation
By EntrepreneurshipDevelopment =By.xpath("//h4[normalize-space()='Entrepreneurship Development and Skill up-gradation']");


//info service 

//Entrepreneurship Development and Skill up-gradation
By infoEntrepreneurshipDevelopment =By.xpath("//h4[normalize-space()='Entrepreneurship Development and Skill up-gradation']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoEntrepreneurshipDevelopment()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoEntrepreneurshipDevelopment));
	  return Driver.findElement(infoEntrepreneurshipDevelopment);
}

public WebElement EntrepreneurshipDevelopment()
{
	wait.until(ExpectedConditions.elementToBeClickable(EntrepreneurshipDevelopment));
	  return Driver.findElement(EntrepreneurshipDevelopment);
}
}
