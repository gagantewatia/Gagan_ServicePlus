package Pageobject.SPZilaSainikBoard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZilaSainikBoard{
public WebDriver Driver;
WebDriverWait wait;
	
	

public ZilaSainikBoard(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Incentive of Rs 1 lakh to the cadets from UT Chandigarh at the time of joining Indian Armed Forces
By IndianArmedForces =By.xpath("//h4[normalize-space()='Incentive of Rs 1 lakh to the cadets from UT Chandigarh at the time of joining Indian Armed Forces']");
//Scholarship for the wards of ex-servicemen, widows who have scored 60% or above in class 10, 12
By Scholarship =By.xpath("//h4[normalize-space()='Scholarship for the wards of ex-servicemen, widows who have scored 60% or above in class 10, 12']");

//Incentive of Rs 1 lakh to the cadets from UT Chandigarh at the time of joining Indian Armed Forces
By infoIndianArmedForces =By.xpath("//h4[normalize-space()='Incentive of Rs 1 lakh to the cadets from UT Chandigarh at the time of joining Indian Armed Forces']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Scholarship for the wards of ex-servicemen, widows who have scored 60% or above in class 10, 12
By infoScholarship =By.xpath("//h4[normalize-space()='Scholarship for the wards of ex-servicemen, widows who have scored 60% or above in class 10, 12']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoIndianArmedForces()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoIndianArmedForces));
	  return Driver.findElement(infoIndianArmedForces);
}
public WebElement infoScholarship()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoScholarship));
	  return Driver.findElement(infoScholarship);
}
public WebElement IndianArmedForces()
{
	wait.until(ExpectedConditions.elementToBeClickable(IndianArmedForces));
	  return Driver.findElement(IndianArmedForces);
}
public WebElement Scholarship()
{
	wait.until(ExpectedConditions.elementToBeClickable(Scholarship));
	  return Driver.findElement(Scholarship);
}
}
