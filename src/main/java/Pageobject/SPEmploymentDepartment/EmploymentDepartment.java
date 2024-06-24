package Pageobject.SPEmploymentDepartment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmploymentDepartment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public EmploymentDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Addition Qualification and other related certificates
By AdditionQualification =By.xpath("//h4[normalize-space()='Addition Qualification and other related certificates']");

//Addition Qualification and other related certificates
By SAKSHAMYUVAScheme =By.xpath("//h4[normalize-space()='Registration for SAKSHAM YUVA Scheme']");

//Registration For Job Seeker
By JobSeeker =By.xpath("//h4[normalize-space()='Registration For Job Seeker']");

//Relaxation in Renewal after delay of two months
By twomonths =By.xpath("//h4[normalize-space()='Relaxation in Renewal after delay of two months']");

//Registration Renewal and Grace period of two months of Renewal
By Graceperiod =By.xpath("//h4[normalize-space()='Registration Renewal and Grace period of two months of Renewal']");

//Transfer of Registration from One Exchange to another exchange
By OneExchange =By.xpath("//h4[normalize-space()='Transfer of Registration from One Exchange to another exchange']");

//info service 

//Addition Qualification and other related certificates
By infoAdditionQualification =By.xpath("//h4[normalize-space()='Addition Qualification and other related certificates']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Addition Qualification and other related certificates
By infoSAKSHAMYUVAScheme =By.xpath("//h4[normalize-space()='Registration for SAKSHAM YUVA Scheme']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Registration For Job Seeker
By infoJobSeeker =By.xpath("//h4[normalize-space()='Registration For Job Seeker']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Relaxation in Renewal after delay of two months
By infotwomonths =By.xpath("//h4[normalize-space()='Relaxation in Renewal after delay of two months']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Registration Renewal and Grace period of two months of Renewal
By infoGraceperiod =By.xpath("//h4[normalize-space()='Registration Renewal and Grace period of two months of Renewal']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Transfer of Registration from One Exchange to another exchange
By infoOneExchange =By.xpath("//h4[normalize-space()='Transfer of Registration from One Exchange to another exchange']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoOneExchange()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoOneExchange));
	  return Driver.findElement(infoOneExchange);
}

public WebElement infoGraceperiod()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoGraceperiod));
	  return Driver.findElement(infoGraceperiod);
}

public WebElement infotwomonths()
{
	wait.until(ExpectedConditions.elementToBeClickable(infotwomonths));
	  return Driver.findElement(infotwomonths);
}

public WebElement infoJobSeeker()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoJobSeeker));
	  return Driver.findElement(infoJobSeeker);
}

public WebElement infoSAKSHAMYUVAScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSAKSHAMYUVAScheme));
	  return Driver.findElement(infoSAKSHAMYUVAScheme);
}

public WebElement infoAdditionQualification()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAdditionQualification));
	  return Driver.findElement(infoAdditionQualification);
}



public WebElement OneExchange()
{
	wait.until(ExpectedConditions.elementToBeClickable(OneExchange));
	  return Driver.findElement(OneExchange);
}

public WebElement Graceperiod()
{
	wait.until(ExpectedConditions.elementToBeClickable(Graceperiod));
	  return Driver.findElement(Graceperiod);
}

public WebElement twomonths()
{
	wait.until(ExpectedConditions.elementToBeClickable(twomonths));
	  return Driver.findElement(twomonths);
}

public WebElement JobSeeker()
{
	wait.until(ExpectedConditions.elementToBeClickable(JobSeeker));
	  return Driver.findElement(JobSeeker);
}

public WebElement SAKSHAMYUVAScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(SAKSHAMYUVAScheme));
	  return Driver.findElement(SAKSHAMYUVAScheme);
}

public WebElement AdditionQualification()
{
	wait.until(ExpectedConditions.elementToBeClickable(AdditionQualification));
	  return Driver.findElement(AdditionQualification);
}


}
