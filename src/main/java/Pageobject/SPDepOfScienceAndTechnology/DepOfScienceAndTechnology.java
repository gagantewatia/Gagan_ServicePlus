package Pageobject.SPDepOfScienceAndTechnology;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepOfScienceAndTechnology{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepOfScienceAndTechnology(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Issue of Income Certificate
By ScienceEducation =By.xpath("//h4[normalize-space()='Promotion of Science Education (POSE) Scholarship']");

//Issue of Income Certificate
By infoScienceEducation =By.xpath("//h4[normalize-space()='Promotion of Science Education (POSE) Scholarship']//following::img[@src='./assets/images/infoIcon.png'][1]");



public WebElement infoScienceEducation()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoScienceEducation));
	  return Driver.findElement(infoScienceEducation);
}


public WebElement ScienceEducation()
{
	wait.until(ExpectedConditions.elementToBeClickable(ScienceEducation));
	  return Driver.findElement(ScienceEducation);
}

}
