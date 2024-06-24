package Pageobject.SPHealthDepartment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HealthDepartment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public HealthDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Socio-Economic Upliftment and Rehabilitation for HIV Infected/Affected Children and Widows
By SocioEconomic =By.xpath("//h4[normalize-space()='Socio-Economic Upliftment and Rehabilitation for HIV Infected/Affected Children and Widows']");

//Janani Suraksha Yojna
By JananiSuraksha=By.xpath("//h4[normalize-space()='Janani Suraksha Yojna']");

//Socio-Economic Upliftment and Rehabilitation for HIV Infected/Affected Children and Widows
By infoSocioEconomic =By.xpath("//h4[normalize-space()='Socio-Economic Upliftment and Rehabilitation for HIV Infected/Affected Children and Widows']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Janani Suraksha Yojna
By infoJananiSuraksha=By.xpath("//h4[normalize-space()='Janani Suraksha Yojna']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoSocioEconomic()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSocioEconomic));
	  return Driver.findElement(infoSocioEconomic);
}
public WebElement infoJananiSuraksha()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoJananiSuraksha));
	  return Driver.findElement(infoJananiSuraksha);
}


public WebElement SocioEconomic()
{
	wait.until(ExpectedConditions.elementToBeClickable(SocioEconomic));
	  return Driver.findElement(SocioEconomic);
}
public WebElement JananiSuraksha()
{
	wait.until(ExpectedConditions.elementToBeClickable(JananiSuraksha));
	  return Driver.findElement(JananiSuraksha);
}


}
