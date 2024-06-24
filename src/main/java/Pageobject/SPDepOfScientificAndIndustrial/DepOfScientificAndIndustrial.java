package Pageobject.SPDepOfScientificAndIndustrial;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepOfScientificAndIndustrial{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepOfScientificAndIndustrial(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Issue of Income Certificate
By PromotingInnovations  =By.xpath("//h4[normalize-space()='Promoting Innovations in Individuals Start-ups and MSMEs']");

//Issue of Local Resident Certificate
By TechnologyDevelopment = By.xpath("//h4[normalize-space()='Technology Development and Utilization Programme for Women - TDUPW']");

//info service 

//Issue of Income Certificate
By infoPromotingInnovations  =By.xpath("//h4[normalize-space()='Promoting Innovations in Individuals Start-ups and MSMEs']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Issue of Local Resident Certificate
By infoTechnologyDevelopment = By.xpath("//h4[normalize-space()='Technology Development and Utilization Programme for Women - TDUPW']//following::img[@src='./assets/images/infoIcon.png'][1]");



public WebElement infoPromotingInnovations()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPromotingInnovations));
	  return Driver.findElement(infoPromotingInnovations);
}
public WebElement infoTechnologyDevelopment()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoTechnologyDevelopment));
	  return Driver.findElement(infoTechnologyDevelopment);
}


public WebElement PromotingInnovations()
{
	wait.until(ExpectedConditions.elementToBeClickable(PromotingInnovations));
	  return Driver.findElement(PromotingInnovations);
}
public WebElement TechnologyDevelopment()
{
	wait.until(ExpectedConditions.elementToBeClickable(TechnologyDevelopment));
	  return Driver.findElement(TechnologyDevelopment);
}

}
