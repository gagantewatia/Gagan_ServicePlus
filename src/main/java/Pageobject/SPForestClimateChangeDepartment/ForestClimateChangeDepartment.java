package Pageobject.SPForestClimateChangeDepartment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForestClimateChangeDepartment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public ForestClimateChangeDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//EDB - गैर वन भूमि/वन क्षेत्र से दूरी संबंधित प्रमाण पत्र
By EDB =By.xpath("//h4[normalize-space()='EDB - गैर वन भूमि/वन क्षेत्र से दूरी संबंधित प्रमाण पत्र']");

public WebElement EDB()
{
	wait.until(ExpectedConditions.elementToBeClickable(EDB));
	  return Driver.findElement(EDB);
}

}
