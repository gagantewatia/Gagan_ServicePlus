package Pageobject.SPLabourDepartmentMeghalaya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LabourDepartmentMeghalaya{
public WebDriver Driver;
WebDriverWait wait;
	
	

public LabourDepartmentMeghalaya(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//License to Work as a Factory
By Factory =By.xpath("//h4[normalize-space()='License to Work as a Factory']");


//License for Contractors under the Contract Labour Act 1970
By LabourAct=By.xpath("//h4[normalize-space()='License for Contractors under the Contract Labour Act 1970']");


//Seeinfo
//Development of Minor Irrigation
By  infoFactory=By.xpath("//h4[normalize-space()='License to Work as a Factory']//following::img[@src='./assets/images/infoIcon.png'][1]");

//License for Contractors under the Contract Labour Act 1970
By infoLabourAct=By.xpath("//h4[normalize-space()='License for Contractors under the Contract Labour Act 1970']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoFactory()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFactory));
	  return Driver.findElement(infoFactory);
}
public WebElement infoLabourAct()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoLabourAct));
	  return Driver.findElement(infoLabourAct);
}

public WebElement Factory()
{
	wait.until(ExpectedConditions.elementToBeClickable(Factory));
	  return Driver.findElement(Factory);
}

public WebElement LabourAct()
{
	wait.until(ExpectedConditions.elementToBeClickable(LabourAct));
	  return Driver.findElement(LabourAct);
}

}
