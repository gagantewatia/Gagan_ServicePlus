package Pageobject.SPDirectorateOfSchoolEducation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DirectorateOfSchoolEducation{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DirectorateOfSchoolEducation(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Attendance Scholarship to Girls Students From 1st to 5th Class
By GirlsStudents =By.xpath("//h4[normalize-space()='Attendance Scholarship to Girls Students From 1st to 5th Class']");
//Attendance Scholarship to SC ST Students from 1st to 8th Class
By SCSTStudents =By.xpath("//h4[normalize-space()='Attendance Scholarship to SC ST Students from 1st to 8th Class']");
//Meritorious Scholarship To SC ST Student From 9th To 12th Class
By MeritoriousScholarship =By.xpath("//h4[normalize-space()='Meritorious Scholarship To SC ST Student From 9th To 12th Class']");
//Merit Scholarship on the Basis of 5th Class Scholarship Exam
By ScholarshipExam =By.xpath("//h4[normalize-space()='Merit Scholarship on the Basis of 5th Class Scholarship Exam']");
//Merit Scholarship to 9th Class Students on basis of 8th class Annual Exam
By AnnualExam =By.xpath("//h4[normalize-space()='Merit Scholarship to 9th Class Students on basis of 8th class Annual Exam']");
//Stipend to SC/ST/BC students from 6th to 8th Class under State Harijan Welfare Scheme
By HarijanWelfareScheme =By.xpath("//h4[normalize-space()='Stipend to SC/ST/BC students from 6th to 8th Class under State Harijan Welfare Scheme']");
//Assitance to Physically Handicapped Students from 1st to 8th Class
By PhysicallyHandicapped =By.xpath("//h4[normalize-space()='Assitance to Physically Handicapped Students from 1st to 8th Class']");
//Free Uniform and Exercise Notebooks to school children upto Elementary Classes
By FreeUniform =By.xpath("//h4[normalize-space()='Free Uniform and Exercise Notebooks to school children upto Elementary Classes']");


//info service 

//Attendance Scholarship to Girls Students From 1st to 5th Class
By infoGirlsStudents =By.xpath("//h4[normalize-space()='Attendance Scholarship to Girls Students From 1st to 5th Class']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Attendance Scholarship to SC ST Students from 1st to 8th Class
By infoSCSTStudents =By.xpath("//h4[normalize-space()='Attendance Scholarship to SC ST Students from 1st to 8th Class']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Meritorious Scholarship To SC ST Student From 9th To 12th Class
By infoMeritoriousScholarship =By.xpath("//h4[normalize-space()='Meritorious Scholarship To SC ST Student From 9th To 12th Class']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Merit Scholarship on the Basis of 5th Class Scholarship Exam
By infoScholarshipExam =By.xpath("//h4[normalize-space()='Merit Scholarship on the Basis of 5th Class Scholarship Exam']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Merit Scholarship to 9th Class Students on basis of 8th class Annual Exam
By infoAnnualExam =By.xpath("//h4[normalize-space()='Merit Scholarship to 9th Class Students on basis of 8th class Annual Exam']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Stipend to SC/ST/BC students from 6th to 8th Class under State Harijan Welfare Scheme
By infoHarijanWelfareScheme =By.xpath("//h4[normalize-space()='Stipend to SC/ST/BC students from 6th to 8th Class under State Harijan Welfare Scheme']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Assitance to Physically Handicapped Students from 1st to 8th Class
By infoPhysicallyHandicapped =By.xpath("//h4[normalize-space()='Assitance to Physically Handicapped Students from 1st to 8th Class']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Free Uniform and Exercise Notebooks to school children upto Elementary Classes
By infoFreeUniform =By.xpath("//h4[normalize-space()='Free Uniform and Exercise Notebooks to school children upto Elementary Classes']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoGirlsStudents()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoGirlsStudents));
	  return Driver.findElement(infoGirlsStudents);
}
public WebElement infoSCSTStudents()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSCSTStudents));
	  return Driver.findElement(infoSCSTStudents);
}
public WebElement infoMeritoriousScholarship()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMeritoriousScholarship));
	  return Driver.findElement(infoMeritoriousScholarship);
}
public WebElement infoScholarshipExam()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoScholarshipExam));
	  return Driver.findElement(infoScholarshipExam);
}
public WebElement infoAnnualExam()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAnnualExam));
	  return Driver.findElement(infoAnnualExam);
}
public WebElement infoHarijanWelfareScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoHarijanWelfareScheme));
	  return Driver.findElement(infoHarijanWelfareScheme);
}
public WebElement infoPhysicallyHandicapped()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPhysicallyHandicapped));
	  return Driver.findElement(infoPhysicallyHandicapped);
}
public WebElement infoFreeUniform()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFreeUniform));
	  return Driver.findElement(infoFreeUniform);
}


public WebElement GirlsStudents()
{
	wait.until(ExpectedConditions.elementToBeClickable(GirlsStudents));
	  return Driver.findElement(GirlsStudents);
}
public WebElement SCSTStudents()
{
	wait.until(ExpectedConditions.elementToBeClickable(SCSTStudents));
	  return Driver.findElement(SCSTStudents);
}
public WebElement MeritoriousScholarship()
{
	wait.until(ExpectedConditions.elementToBeClickable(MeritoriousScholarship));
	  return Driver.findElement(MeritoriousScholarship);
}
public WebElement ScholarshipExam()
{
	wait.until(ExpectedConditions.elementToBeClickable(ScholarshipExam));
	  return Driver.findElement(ScholarshipExam);
}
public WebElement AnnualExam()
{
	wait.until(ExpectedConditions.elementToBeClickable(AnnualExam));
	  return Driver.findElement(AnnualExam);
}
public WebElement HarijanWelfareScheme()
{
	wait.until(ExpectedConditions.elementToBeClickable(HarijanWelfareScheme));
	  return Driver.findElement(HarijanWelfareScheme);
}
public WebElement PhysicallyHandicapped()
{
	wait.until(ExpectedConditions.elementToBeClickable(PhysicallyHandicapped));
	  return Driver.findElement(PhysicallyHandicapped);
}
public WebElement FreeUniform()
{
	wait.until(ExpectedConditions.elementToBeClickable(FreeUniform));
	  return Driver.findElement(FreeUniform);
}
}
