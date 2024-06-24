package Pageobject.SPDirectorateOfHealthServices;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DirectorateOfHealthServices
{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DirectorateOfHealthServices(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Ayushman Bharat Pradhan Mantri Jan Arogya Yojana
By AyushmanBharat =By.xpath("//h4[normalize-space()='Ayushman Bharat Pradhan Mantri Jan Arogya Yojana']");

//Dulari Scheme
By DulariScheme = By.xpath("//h4[normalize-space()='Dulari Scheme']");

//info service 

//Ayushman Bharat Pradhan Mantri Jan Arogya Yojana
By infoAyushmanBharat =By.xpath("//h4[normalize-space()='Ayushman Bharat Pradhan Mantri Jan Arogya Yojana']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Dulari Scheme
By infoDulariScheme = By.xpath("//h4[normalize-space()='Dulari Scheme']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoAyushmanBharat()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAyushmanBharat));
	  return Driver.findElement(infoAyushmanBharat);
}
public WebElement infoDulariScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDulariScheme));
	  return Driver.findElement(infoDulariScheme);
}

public WebElement AyushmanBharat()
{
	wait.until(ExpectedConditions.elementToBeClickable(AyushmanBharat));
	  return Driver.findElement(AyushmanBharat);
}
public WebElement DulariScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(DulariScheme));
	  return Driver.findElement(DulariScheme);
}

}