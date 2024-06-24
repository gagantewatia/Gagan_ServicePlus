package Pageobject.SPRubberBoard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RubberBoard{
public WebDriver Driver;
WebDriverWait wait;
	
	

public RubberBoard(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//RUBBER PLANTATION DEVELOPMENT SCHEME
By RUBBERPLANTATION =By.xpath("//h4[normalize-space()='RUBBER PLANTATION DEVELOPMENT SCHEME']");

public WebElement RUBBERPLANTATION()
{
	wait.until(ExpectedConditions.elementToBeClickable(RUBBERPLANTATION));
	  return Driver.findElement(RUBBERPLANTATION);
}
}
