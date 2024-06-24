package Pageobject.SPDepartmentOfLabour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepartmentOfLabour{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepartmentOfLabour(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Registration of Construction Workers in AN BOCWWB
By ConstructionWorkers =By.xpath("//h4[normalize-space()='Registration of Construction Workers in AN BOCWWB']");
By PHConstructionWorkers =By.xpath("//strong[contains(text(),'A & N BUILDING AND OTHER CONSTRUCTION WORKERS WELF')]");
//Funeral Financial Assistance
By Funeral =By.xpath("//h4[normalize-space()='Funeral Financial Assistance']");
//Funeral Financial Assistance
By Marriage =By.xpath("//h4[normalize-space()='Marriage Financial Assistance']");
//Disability Financial Assistance
By Disability =By.xpath("//h4[normalize-space()='Disability Financial Assistance']");
//Educational Financial Assistance
By Educational =By.xpath("//h4[normalize-space()='Educational Financial Assistance']");
//Maternity Financial Benefit
By Maternity =By.xpath("//h4[normalize-space()='Maternity Financial Benefit']");
//Skill Development Financial Benefit
By SkillDevelopment =By.xpath("//h4[normalize-space()='Skill Development Financial Benefit']");
//Pension Financial Assistance
By Pension =By.xpath("//h4[normalize-space()='Pension Financial Assistance']");
//Medical Financial Assistance
By Medical =By.xpath("//h4[normalize-space()='Medical Financial Assistance']");
//Death Financial Benefit
By Death =By.xpath("//h4[normalize-space()='Death Financial Benefit']");
//Stipend to ITI Trainees
By StipendOne =By.xpath("//h4[normalize-space()='Stipend to ITI Trainees']");
//Scholarship to Eligible Hostel inmates- ITI
By ScholarshipOne =By.xpath("//h4[normalize-space()='Scholarship to Eligible Hostel inmates- ITI']");

//Stipend to ITI Trainees
By StipendTwo =By.xpath("(//div[@class='card tile-card'])[13]");
//Scholarship to Eligible Hostel inmates- ITI
By ScholarshipTwo =By.xpath("(//div[@class='card tile-card'])[14]");

//info service
//Registration of Construction Workers in AN BOCWWB
By infoConstructionWorkers =By.xpath("//h4[normalize-space()='Registration of Construction Workers in AN BOCWWB']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Funeral Financial Assistance
By infoFuneral =By.xpath("//h4[normalize-space()='Funeral Financial Assistance']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Funeral Financial Assistance
By infoMarriage =By.xpath("//h4[normalize-space()='Marriage Financial Assistance']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Disability Financial Assistance
By infoDisability =By.xpath("//h4[normalize-space()='Disability Financial Assistance']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Educational Financial Assistance
By infoEducational =By.xpath("//h4[normalize-space()='Educational Financial Assistance']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Maternity Financial Benefit
By infoMaternity =By.xpath("//h4[normalize-space()='Maternity Financial Benefit']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Skill Development Financial Benefit
By infoSkillDevelopment =By.xpath("//h4[normalize-space()='Skill Development Financial Benefit']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Pension Financial Assistance
By infoPension =By.xpath("//h4[normalize-space()='Pension Financial Assistance']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Medical Financial Assistance
By infoMedical =By.xpath("//h4[normalize-space()='Medical Financial Assistance']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Death Financial Benefit
By infoDeath =By.xpath("//h4[normalize-space()='Death Financial Benefit']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Stipend to ITI Trainees
By infoStipendOne =By.xpath("//h4[normalize-space()='Stipend to ITI Trainees']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Scholarship to Eligible Hostel inmates- ITI
By infoScholarshipOne =By.xpath("//h4[normalize-space()='Scholarship to Eligible Hostel inmates- ITI']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoScholarshipOne()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoScholarshipOne));
	  return Driver.findElement(infoScholarshipOne);
}
public WebElement infoStipendOne()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoStipendOne));
	  return Driver.findElement(infoStipendOne);
}

public WebElement infoDeath()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDeath));
	  return Driver.findElement(infoDeath);
}

public WebElement infoMedical()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMedical));
	  return Driver.findElement(infoMedical);
}

public WebElement infoPension()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPension));
	  return Driver.findElement(infoPension);
}

public WebElement infoSkillDevelopment()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSkillDevelopment));
	  return Driver.findElement(infoSkillDevelopment);
}



public WebElement infoMaternity()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMaternity));
	  return Driver.findElement(infoMaternity);
}
public WebElement infoEducational()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoEducational));
	  return Driver.findElement(infoEducational);
}


public WebElement infoDisability()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDisability));
	  return Driver.findElement(infoDisability);
}

public WebElement infoMarriage()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMarriage));
	  return Driver.findElement(infoMarriage);
}

public WebElement infoConstructionWorkers()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoConstructionWorkers));
	  return Driver.findElement(infoConstructionWorkers);
}
public WebElement infoFuneral()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFuneral));
	  return Driver.findElement(infoFuneral);
}


public WebElement ScholarshipTwo()
{
	wait.until(ExpectedConditions.elementToBeClickable(ScholarshipTwo));
	  return Driver.findElement(ScholarshipTwo);
}

public WebElement StipendTwo()
{
	wait.until(ExpectedConditions.elementToBeClickable(StipendTwo));
	  return Driver.findElement(StipendTwo);
}

public WebElement ScholarshipOne()
{
	wait.until(ExpectedConditions.elementToBeClickable(ScholarshipOne));
	  return Driver.findElement(ScholarshipOne);
}
public WebElement StipendOne()
{
	wait.until(ExpectedConditions.elementToBeClickable(StipendOne));
	  return Driver.findElement(StipendOne);
}

public WebElement Death()
{
	wait.until(ExpectedConditions.elementToBeClickable(Death));
	  return Driver.findElement(Death);
}

public WebElement Medical()
{
	wait.until(ExpectedConditions.elementToBeClickable(Medical));
	  return Driver.findElement(Medical);
}

public WebElement Pension()
{
	wait.until(ExpectedConditions.elementToBeClickable(Pension));
	  return Driver.findElement(Pension);
}

public WebElement SkillDevelopment()
{
	wait.until(ExpectedConditions.elementToBeClickable(SkillDevelopment));
	  return Driver.findElement(SkillDevelopment);
}



public WebElement Maternity()
{
	wait.until(ExpectedConditions.elementToBeClickable(Maternity));
	  return Driver.findElement(Maternity);
}
public WebElement Educational()
{
	wait.until(ExpectedConditions.elementToBeClickable(Educational));
	  return Driver.findElement(Educational);
}


public WebElement Disability()
{
	wait.until(ExpectedConditions.elementToBeClickable(Disability));
	  return Driver.findElement(Disability);
}

public WebElement Marriage()
{
	wait.until(ExpectedConditions.elementToBeClickable(Marriage));
	  return Driver.findElement(Marriage);
}

public WebElement ConstructionWorkers()
{
	wait.until(ExpectedConditions.elementToBeClickable(ConstructionWorkers));
	  return Driver.findElement(ConstructionWorkers);
}
public WebElement PHConstructionWorkers()
{
	wait.until(ExpectedConditions.elementToBeClickable(PHConstructionWorkers));
	  return Driver.findElement(PHConstructionWorkers);
}
public WebElement Funeral()
{
	wait.until(ExpectedConditions.elementToBeClickable(Funeral));
	  return Driver.findElement(Funeral);
}
}
